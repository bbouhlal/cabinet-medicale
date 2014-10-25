package miage.gestioncabinet.core;

import java.util.List;

import miage.gestioncabinet.api.Interaction;
import miage.gestioncabinet.api.Produit;

public class InteractionM implements Interaction {

	private Long id;
	private String severite;
	private String risques;
	private String precautions;
	private Produit produitA;
	private Produit produitB;
	
	@Override
	public Produit getProduitA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProduitA(Produit produit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produit getProduitB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProduitB(Produit produit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSeverite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSeverite(String severite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRisques() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRisques(String risques) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPrecautions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPrecautions(String precautions) {
		// TODO Auto-generated method stub
		
	}

}
