package com.tecnologito.proyectocolegio.servicio;

import java.util.List;

import com.tecnologito.proyectocolegio.modelo.Alumno;

public interface AlumnoService {

	List<Alumno> obtenerAlumnos();	
	Alumno obtenerAlumnoPorId(Long idalumno);
	
}
