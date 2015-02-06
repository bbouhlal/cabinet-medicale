package miage.gestioncabinet.core;

import miage.gestioncabinet.api.Produit;
import miage.gestioncabinet.api.Traitement;

public class TraitementM implements Traitement{

	private Long id;
	private String posologie;
	private Produit produit;
	
	@Override
	public Produit getProduit() {
		return this.produit;
	}

	@Override
	public void setProduit(Produit produit) {
		this.produit = produit;
		
	}

	@Override
	public String getPosologie() {
		return this.posologie; 
	}

	@Override
	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}

}