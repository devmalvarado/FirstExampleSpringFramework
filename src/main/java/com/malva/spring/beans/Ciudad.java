package com.malva.spring.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ciudad {
	private String nombre;
	
	private void initBean() {
		System.out.println("antes de iniciar el bean Ciudad");
	}
	
	private void destroy() {
		System.out.println("Bean Ciudad justo antes de ser destruido");
	}
}
