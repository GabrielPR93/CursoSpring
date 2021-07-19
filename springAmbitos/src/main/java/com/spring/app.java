package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		
	ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

	EmailService emailService1 = appContext.getBean(EmailService.class);

	emailService1.setDestinatarioPorDefecto("gabrielpr93@hotmail.com");
	emailService1.enviarSaludo();
	System.out.println(emailService1);//referencia
	
	EmailService emailService2 = appContext.getBean(EmailService.class);
	emailService2.enviarSaludo();
	System.out.println(emailService2);

	((ClassPathXmlApplicationContext) appContext).close();

	}

}
