package miage.gestioncabinet.core;

import miage.gestioncabinet.api.Utilisateur;

public class UtilisateurM extends PersonneM implements Utilisateur{

	private String compte;
	private String motdepasse;
	
	@Override
	public String getCompte() {
		return compte;
	}

	public String getMotdepasse() {
		return motdepasse;
	}
	
	public void setCompte(String compte) {
		this.compte = compte;
	}
	
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}


	
	


}