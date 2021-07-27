package com.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository("clasicas")
public class CatalogoPeliculasClasicas implements CatalogoPeliculas{

	public List<Pelicula> peliculas = new ArrayList<>();
	
	@Override
	public Collection<Pelicula> getPeliculas() {
	
		return peliculas;
	}
	
	@PostConstruct
	public void init() {
		peliculas.add(new Pelicula("La guerra de las galaxias", 1977,"Ciencia ficci�n"));
		peliculas.add(new Pelicula("La lista de Schindler",1993,"Drama"));
		peliculas.add(new Pelicula("El Padrino", 1972, "Drama"));
		peliculas.add(new Pelicula("Apocalypse Now", 1979, "B�lico"));
		peliculas.add(new Pelicula("Gladiator", 2000, "Acci�n"));
		peliculas.add(new Pelicula("El Gran Dictador",1940,"Comedia"));
	}
}
