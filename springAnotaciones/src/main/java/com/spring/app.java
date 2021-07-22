package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

		PeliculaService peliculaService=appContext.getBean(PeliculaService.class);
		
		for (Pelicula pelis : peliculaService.pelisPorGenero("Drama")) {
			System.out.println(pelis.getTitulo());
		}
		
		((ClassPathXmlApplicationContext)appContext).close();

	}

}
