package fr.ubo.hello.bean;

public class Greeting {
	private String message = "Hello world";
	private String auteur;
	
	public Greeting(String message, String auteur) {
		super();
		this.message = message;
		this.auteur = auteur;
	}
	
	public Greeting(String message) {
		super();
		this.message = message;
	}

	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
}
