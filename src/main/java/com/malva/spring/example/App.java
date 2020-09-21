package com.malva.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.malva.spring.beans.AppConfig;
import com.malva.spring.beans.AppConfig2;
import com.malva.spring.beans.Marte;
import com.malva.spring.beans.Mundo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
        ApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
    	Marte ma = (Marte) appcontext.getBean("marte");
    	Mundo mu = (Mundo) appcontext.getBean("mundo");
        System.out.println(ma.getSaludo() + mu.getSaludo());
        ((ConfigurableApplicationContext)appcontext).close();
    }
}
