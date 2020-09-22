package com.malva.spring.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.malva.spring.beans.Persona;


public class App {
    public static void main( String[] args ){
    	
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/malva/spring/xml/beans.xml");
    	Persona per = (Persona) appContext.getBean("personaBean");
    	Persona per2 = (Persona) appContext.getBean("personaBean");
    	
    	per.setId(1);
    	per.setNombre("Juan Pablo");
    	per.setApodo("palillo");
    	
    	System.out.println(per2 + " " + per2.getId() + " " + per2.getNombre() + " " + per.getApodo() + " " + per2.getPais().getNombre() + " " + per2.getCiudadela().getNombre());
    	System.out.println(per + " " + per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre() + " " + per.getCiudadela().getNombre());
    	((ConfigurableApplicationContext)appContext).close();
    }
}
