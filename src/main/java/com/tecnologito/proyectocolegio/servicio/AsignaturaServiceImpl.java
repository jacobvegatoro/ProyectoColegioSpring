package com.tecnologito.proyectocolegio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologito.proyectocolegio.modelo.Asignatura;
import com.tecnologito.proyectocolegio.repositorio.AsignaturaRepository;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

	@Autowired
	private AsignaturaRepository asignaturaRepositorio;

	@Override
	public List<Asignatura> obtenerAsignaturas() {
		return (List<Asignatura>) asignaturaRepositorio.findAll();
	}

	@Override
	public Asignatura obtenerAsignaturaPorId(Long idasignatura) {
		return asignaturaRepositorio.findById(idasignatura).get();
	}

}
