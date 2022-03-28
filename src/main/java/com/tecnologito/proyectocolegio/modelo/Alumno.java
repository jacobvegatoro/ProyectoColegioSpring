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
@Table(name="alumno")
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private String apellido;
	private int edad;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="curso_id")
	private Curso curso;
	
}
