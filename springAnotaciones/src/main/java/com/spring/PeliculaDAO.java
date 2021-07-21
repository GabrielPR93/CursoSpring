package com.spring;

import java.util.Collection;

public interface PeliculaDAO {
	
	public Pelicula findById(int id);
	public Collection<Pelicula> findAll();
	public void insert(Pelicula pelicula);
	public void edit(Pelicula antigua,Pelicula nueva);
	public void delete(Pelicula pelicula);
	
	
}
