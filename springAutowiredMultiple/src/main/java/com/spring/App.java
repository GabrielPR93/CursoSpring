package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

		PeliculaService peliculaService = appContext.getBean(PeliculaService.class);

		for (Pelicula peli : peliculaService.pelisPorGenero("Ciencia ficción")) {
			System.out.println(peli.getTitulo());
		}

		((ClassPathXmlApplicationContext) appContext).close();

	}

}
