package com.tecnologito.proyectocolegio.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecnologito.proyectocolegio.modelo.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso,Long> {

}
