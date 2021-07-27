package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext =new AnnotationConfigApplicationContext(AppConfig.class);
		Saludator saludo=appContext.getBean(Saludator.class);
		System.out.println(saludo.saludo());
		
		((AnnotationConfigApplicationContext)appContext).close();

	}

}
