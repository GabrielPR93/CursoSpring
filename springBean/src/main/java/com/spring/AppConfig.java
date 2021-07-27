package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	//Se declaran aquí los beans al no tener Xml
	
	@Bean
	@Primary
	public CatalogoPeliculas catalogoActuales() {
		return new CatalogoPeliculasActuales();
	}
	
	@Bean
	public CatalogoPeliculas catalogoClasicas() {
		return new CatalogoPeliculasClasicas();
	}

	@Bean
	public PeliculaDAO peliculaDaoImplMemory() {
		return new PeliculaDAOImplMemory();
	}
	
	@Bean
	public PeliculaService peliculaService() {
		return new PeliculaService();
	}
}
