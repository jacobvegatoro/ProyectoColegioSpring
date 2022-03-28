package com.tecnologito.proyectocolegio.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="asignatura")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asignatura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombreAsignatura;
	private int semestre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="profesor_run")
	private Profesor profesor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="departamento_id")
	private Departamento departamento;
	
}
