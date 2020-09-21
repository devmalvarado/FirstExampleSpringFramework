package com.malva.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class AppConfig2 {

	@Bean(name="marte")
	public Marte otroMetodo() {
		return new Marte();
	}
}
