package com.spring;

public class Saludator {

private String mensaje;
	
	public Saludator(String str) {
		this.mensaje=str.toUpperCase();
	}
	
	
	public String saludo() {
		return (mensaje==null) ? "Hola Mundo":mensaje;
	}
}
