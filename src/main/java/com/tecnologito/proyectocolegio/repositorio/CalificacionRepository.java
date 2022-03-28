package com.tecnologito.proyectocolegio.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecnologito.proyectocolegio.modelo.Calificacion;

@Repository
public interface CalificacionRepository extends CrudRepository<Calificacion,Long> {

}
