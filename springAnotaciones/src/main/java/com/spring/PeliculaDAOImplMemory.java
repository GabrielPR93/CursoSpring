package com.spring;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PeliculaDAOImplMemory implements PeliculaDAO {

	private List<Pelicula> peliculas=new ArrayList<>();
	
	@Override
	public Pelicula findById(int id) {
		
		return peliculas.get(id);
	}

	@Override
	public Collection<Pelicula> findAll() {
		
		return peliculas;
	}

	@Override
	public void insert(Pelicula pelicula) {
		peliculas.add(pelicula);
		
	}

	@Override
	public void edit(Pelicula antigua, Pelicula nueva) {
		peliculas.remove(antigua);
		peliculas.add(nueva);
		
	}

	@Override
	public void delete(Pelicula pelicula) {
		peliculas.remove(pelicula);
		
	}
	
	public void init() {
		
		insert(new Pelicula("La guerra de las galaxias",1977,"Ciencia Ficción"));
		insert(new Pelicula("La lista de Schinder",1993,"Drama"));
		insert(new Pelicula("El padrino",1972,"Drama"));
		insert(new Pelicula("Apocalypse",1979,"Belico"));
		insert(new Pelicula("Gladiator",2000,"Acción"));
	}

}
