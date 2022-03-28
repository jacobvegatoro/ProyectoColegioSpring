package com.tecnologito.proyectocolegio.modelo;

import java.util.Date;

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
@Table(name="calificacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date fecha;
	private String glosa;
	private int nota;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="alumno_id")
	private Alumno alumno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="asignatura_id")
	private Asignatura asignatura;
		
}
