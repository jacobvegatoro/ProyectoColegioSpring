package com.tecnologito.proyectocolegio.controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tecnologito.proyectocolegio.modelo.Alumno;
import com.tecnologito.proyectocolegio.modelo.Asignatura;
import com.tecnologito.proyectocolegio.modelo.Calificacion;
import com.tecnologito.proyectocolegio.servicio.AlumnoService;
import com.tecnologito.proyectocolegio.servicio.AsignaturaService;
import com.tecnologito.proyectocolegio.servicio.CalificacionService;

@Controller
public class CalificacionController {

	@Autowired
	private AlumnoService alumnoServicio;
	
	@Autowired
	private AsignaturaService asignaturaServicio;
	
	@Autowired
	private CalificacionService calificacionServicio;

	@RequestMapping("/calificar")
	public String calificarPrueba(Model model) {
		
		List<Alumno> alumnos = alumnoServicio.obtenerAlumnos();
		
		List<Asignatura> asignaturas = asignaturaServicio.obtenerAsignaturas();
		
		model.addAttribute("alumnos", alumnos);
		model.addAttribute("asignaturas", asignaturas);
		
		return "calificarprueba";
	}
	
	@PostMapping(value = "/guardarcalificacion")
	public String guardarCalificacion(
			Model model,
			@RequestParam("slcalumno") String stralumno,
			@RequestParam("slcasignatura") String strasignatura,
			@RequestParam("txtfecha") String strfecha,
			@RequestParam("txtglosa") String strglosa,
			@RequestParam("txtnota") String strnota
			) {
		
		System.out.println("Fecha: " + strfecha);
		System.out.println("Glosa: " + strglosa);
		System.out.println("Nota: " + strnota);
		
		Calificacion califica = new Calificacion();
		califica.setGlosa(strglosa);
		califica.setNota(Integer.parseInt(strnota));
		
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		Date fechaCalifica = new Date();
		try {
			fechaCalifica = ft.parse(strfecha);			
		}catch(ParseException e) 
		{
			System.out.println("Imposible transformar fecha usando formato " + ft);
		}
		califica.setFecha(fechaCalifica);
		
		
		//califica.setFecha(dtfecha);
		
		Alumno al = alumnoServicio.obtenerAlumnoPorId(Long.parseLong(stralumno));
		califica.setAlumno(al);
		
		Asignatura as = asignaturaServicio.obtenerAsignaturaPorId(Long.parseLong(strasignatura));
		califica.setAsignatura(as);

		boolean resultado = false;
		try {
			calificacionServicio.guardarCalificacion(califica);
			resultado = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String mensaje = "";
		
		if (resultado) {
			mensaje = "La calificación fue agrega exitosamente";
		}
		else {
			mensaje = "Hubo un error al guardar la calificacion";
		}

		model.addAttribute("mensaje", mensaje);
		
		return "calificarprueba";
	}
	
}
