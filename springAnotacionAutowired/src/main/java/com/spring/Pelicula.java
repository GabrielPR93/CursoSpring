package com.spring;

public class Pelicula {
	
	private String titulo;
	private int anho;
	private String genero;
	
	public Pelicula(String titulo, int anho, String genero) {
		this.titulo = titulo;
		this.anho = anho;
		this.genero = genero;
	}
	public Pelicula() {
		
	}

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
