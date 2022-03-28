package com.tecnologito.proyectocolegio.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologito.proyectocolegio.modelo.Calificacion;
import com.tecnologito.proyectocolegio.repositorio.CalificacionRepository;

@Service
public class CalificacionServiceImpl implements CalificacionService {

	@Autowired
	private CalificacionRepository calificacionRepositorio;

	@Override
	public boolean guardarCalificacion(Calificacion calificacion) {
		boolean estado = false;
		
		try {
			calificacionRepositorio.save(calificacion);
			estado = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return estado;
	}

	
}
