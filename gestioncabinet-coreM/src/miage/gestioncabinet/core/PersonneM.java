package miage.gestioncabinet.core;

import miage.gestioncabinet.api.Personne;

public abstract class PersonneM implements Personne{

	private long id;
	private String nom;
	private String prenom;
	
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String getPrenom() {
		return prenom;
	}

	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;		
	}

	
}