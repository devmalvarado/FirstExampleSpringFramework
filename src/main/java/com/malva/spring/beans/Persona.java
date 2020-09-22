package com.malva.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter
@AllArgsConstructor
public class Persona {
	
	private int id;
	private String nombre;
	private String apodo;
	
	public Persona(int id) {
		this.id = id;
	}
	
	public Persona(String apodo) {
		this.apodo = apodo;
	}

}
