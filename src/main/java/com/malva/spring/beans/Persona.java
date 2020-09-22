package com.malva.spring.beans;


import lombok.Getter;
import lombok.Setter;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Setter
@Getter
public class Persona implements InitializingBean, DisposableBean {
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudadela;
	
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("antes de iniciar el Bean");
		
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Bean justo antes de ser destruido");
		
	}
	
}
