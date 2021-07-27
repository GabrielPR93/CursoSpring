package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		PeliculaService peliculaService = appContext.getBean(PeliculaService.class);

		for (Pelicula peli : peliculaService.pelisPorGenero("Ciencia ficción")) {
			System.out.println(peli.getTitulo());
		}

		((AnnotationConfigApplicationContext) appContext).close();

	}

}
