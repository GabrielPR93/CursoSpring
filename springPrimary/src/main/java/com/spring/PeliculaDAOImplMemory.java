package com.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PeliculaDAOImplMemory implements PeliculaDAO {

	private List<Pelicula> peliculas = new ArrayList<Pelicula>();
	
	@Autowired //Solo un bean (El que está como primary)
	//@Qualifier("catalogoClasicas")//Se utiliza si no hay ningún bean como primary indicandole el id del bean correspondiente
	private CatalogoPeliculas catalogosPeliculas;
	
	public Pelicula findById(int id) {

		return peliculas.get(id);
	}

	public Collection<Pelicula> findAll() {

		return peliculas;
	}

	public void insert(Pelicula pelicula) {
		peliculas.add(pelicula);

	}

	public void edit(Pelicula antigua, Pelicula nueva) {
		peliculas.remove(antigua);
		peliculas.add(nueva);

	}

	public void delete(Pelicula pelicula) {
		peliculas.remove(pelicula);

	}
	
	public void init () {
		
			peliculas.addAll(catalogosPeliculas.getPeliculas());
	}

}
