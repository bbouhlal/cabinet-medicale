package miage.gestioncabinet.core;

import miage.gestioncabinet.api.Produit;

public class ProduitM implements Produit {

	private String cis;
	private String nom;
	
	@Override
	public String getCis() {
		return cis;
	}

	@Override
	public void setCis(String cis) {
		this.cis = cis;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

}
