package com.malva.spring.beans;


import lombok.Getter;
import lombok.Setter;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Setter
@Getter
public class Persona {
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudadela;
	
	@PostConstruct
	private void initBean() {
		System.out.println("antes de iniciar el Bean");
	}
	@PreDestroy
	private void destroy() {
		System.out.println("Bean justo antes de ser destruido");
	}
	
}
