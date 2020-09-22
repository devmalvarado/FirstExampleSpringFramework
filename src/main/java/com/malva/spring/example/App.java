package com.malva.spring.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.malva.spring.beans.Persona;


public class App {
    public static void main( String[] args ){
    	
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/malva/spring/xml/beans.xml");
    	Persona per = (Persona) appContext.getBean("personaBean2");
    	System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre() + " " + per.getPais().getCiudadela().getNombre());
    	((ConfigurableApplicationContext)appContext).close();
    }
}
