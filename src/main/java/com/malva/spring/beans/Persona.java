package com.malva.spring.beans;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Persona {
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudadela;
	
	
}
