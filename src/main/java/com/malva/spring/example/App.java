package com.malva.spring.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.malva.spring.beans.Ciudad;
import com.malva.spring.beans.Persona;


public class App {
    public static void main( String[] args ){
    	
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/malva/spring/xml/beans.xml");
    	Persona per = (Persona) appContext.getBean("persona");
    	Ciudad ciudad = (Ciudad) appContext.getBean("city");
    	
    	System.out.println( per.getApodo() );
    	System.out.println( ciudad.getNombre() );
    	((ConfigurableApplicationContext)appContext).close();
    }
}
