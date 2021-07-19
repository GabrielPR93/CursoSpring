package com.spring;

public class EmailService implements IEmailService {

	private Saludator saludator;

	public void setSaludator(Saludator saludator) {
		this.saludator = saludator;
	}

	@Override
	public void enviarSaludo(String destinatario) {

		System.out.println("Enviar email a: " + destinatario);
		System.out.println("Mensaje: " + saludator.saludo());

	}

}
