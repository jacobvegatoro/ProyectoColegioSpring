package com.tecnologito.proyectocolegio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologito.proyectocolegio.modelo.Curso;
import com.tecnologito.proyectocolegio.repositorio.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository cursoRepositorio;
	
	@Override
	public List<Curso> obtenerCursos() {
		return (List<Curso>) cursoRepositorio.findAll();
	}

	
	
}
