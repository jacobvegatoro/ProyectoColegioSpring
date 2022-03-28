package com.tecnologito.proyectocolegio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologito.proyectocolegio.modelo.Alumno;
import com.tecnologito.proyectocolegio.repositorio.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepositorio;
	
	@Override
	public List<Alumno> obtenerAlumnos() {
		return (List<Alumno>) alumnoRepositorio.findAll();
	}

	@Override
	public Alumno obtenerAlumnoPorId(Long idalumno) {
		return alumnoRepositorio.findById(idalumno).get();
	}

}
