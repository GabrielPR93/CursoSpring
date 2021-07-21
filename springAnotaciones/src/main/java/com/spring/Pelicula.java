package com.spring;

public class Pelicula {
	
	private String nombre;
	private int anho;
	private String genero;
	
	public Pelicula() {
		
	}

	public Pelicula(String nombre, int anho, String genero) {
		this.nombre = nombre;
		this.anho = anho;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
