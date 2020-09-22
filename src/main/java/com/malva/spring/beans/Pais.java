package com.malva.spring.beans;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pais {
	private String nombre;
	private List<Ciudad> ciudades;
}
