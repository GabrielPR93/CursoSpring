package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		
	ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
//
//	Saludator saludo = null;
//
//	saludo = appContext.getBean(Saludator.class);
//
//	System.out.println(saludo.saludo() + "\n");

	IEmailService emailService = null;

	emailService = appContext.getBean(IEmailService.class);
	emailService.enviarSaludo("gabrielpr93@hotmail.com");
	
	((ClassPathXmlApplicationContext) appContext).close();

	}

}
