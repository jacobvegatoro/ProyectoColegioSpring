package com.tecnologito.proyectocolegio.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecnologito.proyectocolegio.modelo.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno,Long> {

}
