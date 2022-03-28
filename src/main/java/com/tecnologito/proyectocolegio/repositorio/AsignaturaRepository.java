package com.tecnologito.proyectocolegio.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecnologito.proyectocolegio.modelo.Asignatura;

@Repository
public interface AsignaturaRepository extends CrudRepository<Asignatura,Long> {

}
