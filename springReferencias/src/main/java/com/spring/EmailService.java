package com.spring;

public class EmailService {

	private Saludator saludator;

	public void setSaludator(Saludator saludator) {

		this.saludator = saludator;
	}

	public void enviarEmailSaludos(String destinatario) {
		
		System.out.println("Enviando email a " + destinatario);
		System.out.println("Mensaje: " + saludator.saludo());
	}

}
