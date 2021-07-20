package com.spring;

public class EmailService implements IEmailService {

	private Saludator saludator;
	private String destinatarioPorDefecto;

	public void setSaludator(Saludator saludator) {
		this.saludator = saludator;
	}

	public void setDestinatarioPorDefecto(String destinatario) {
		this.destinatarioPorDefecto = destinatario;
	}

	public void enviarSaludo() {

		if (destinatarioPorDefecto != null) {
			enviarSaludo(destinatarioPorDefecto);
		} else {
			System.out.println("Configurar un destinatario por defecto");
		}
	}

	public void enviarSaludo(String destinatario) {

		System.out.println("Enviar email a: " + destinatario);
		System.out.println("Mensaje: " + saludator.saludo());

	}

}
