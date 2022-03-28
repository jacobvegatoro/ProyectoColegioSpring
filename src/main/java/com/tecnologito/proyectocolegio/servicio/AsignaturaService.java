package com.tecnologito.proyectocolegio.servicio;

import java.util.List;

import com.tecnologito.proyectocolegio.modelo.Asignatura;

public interface AsignaturaService {

	List<Asignatura> obtenerAsignaturas();
	Asignatura obtenerAsignaturaPorId(Long idasignatura);

}
