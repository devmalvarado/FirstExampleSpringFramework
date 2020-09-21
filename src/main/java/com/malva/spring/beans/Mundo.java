package com.malva.spring.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mundo {
	
	@Value("holi crayolita")
	private String saludo;
	
}
