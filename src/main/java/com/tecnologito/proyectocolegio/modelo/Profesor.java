package com.tecnologito.proyectocolegio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="profesor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profesor {

	@Id
	private Long run;

	private String digito;
	private String nombreProfesor;
	
	@Column(name="apellidos_profesor")
	private String apellidosProfesor;
		
}
