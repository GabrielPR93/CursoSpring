package com.spring;

public class Saludator {

	private String mensaje;
	
	public void setMensaje(String str) {
		this.mensaje=str.toUpperCase();
	}
	
	
	public String saludo() {
		return (mensaje==null) ? "Hola Mundo":mensaje;
	}
}
