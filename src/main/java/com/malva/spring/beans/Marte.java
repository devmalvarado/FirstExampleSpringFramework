package com.malva.spring.beans;


import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Marte {
	
	@Value(" hello marciano ")
	private String saludo;
	
}
