package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
	
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludator saludo= null;
		
		//1.- getBean con Id y casting
		//saludo = (Saludator)appContext.getBean("saludator");
		
		//2.- getBean con ID y tipo
		//saludo=appContext.getBean("saludator",Saludator.class);
		
		//3.- getBean con tipo (Pero si no está repetido el bean)
		saludo=appContext.getBean(Saludator.class);
		
		System.out.println(saludo.saludo());
		
		((ClassPathXmlApplicationContext)appContext).close();
	}

}
