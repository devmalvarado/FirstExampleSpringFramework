package com.malva.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.malva.spring.beans.Mundo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
        ApplicationContext appcontext = new ClassPathXmlApplicationContext("com/malva/spring/xml/beans.xml");
        Mundo m = (Mundo) appcontext.getBean("mundo");
        System.out.println(m.getSaludo());
        ((ConfigurableApplicationContext)appcontext).close();
    }
}
