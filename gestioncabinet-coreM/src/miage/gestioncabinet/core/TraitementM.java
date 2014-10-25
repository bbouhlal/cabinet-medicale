package miage.gestioncabinet.core;

import miage.gestioncabinet.api.Produit;
import miage.gestioncabinet.api.Traitement;

public class TraitementM implements Traitement{

	private Long id;
	private String posologie;
	private Produit produit;
	
	@Override
	public Produit getProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProduit(Produit produit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPosologie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosologie(String posologie) {
		// TODO Auto-generated method stub
		
	}

}
