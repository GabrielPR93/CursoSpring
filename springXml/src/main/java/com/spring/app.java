package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		PersonaDAO personaDAO = applicationContext.getBean(PersonaDAO.class);
	
		for (Persona persona : personaDAO.findAll()) {
			System.out.println("Nombre: "+persona.getNombre()+" Edad: "+persona.getEdad());
		}
		
		((ClassPathXmlApplicationContext)applicationContext).close();

	}

}
