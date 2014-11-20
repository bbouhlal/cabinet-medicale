package miage.gestioncabinet.core;

import java.util.List;

import miage.gestioncabinet.api.Interaction;
import miage.gestioncabinet.api.Produit;

/***
 * 
 * @author Dorian
 *
 */

public class InteractionM implements Interaction {

	private Long id;
	private String severite;
	private String risques;
	private String precautions;
	private Produit produitA;
	private Produit produitB;
	
	@Override
	public Produit getProduitA() {
		return produitA;
	}

	@Override
	public void setProduitA(Produit produit) {
		this.produitA = produit;
	}

	@Override
	public Produit getProduitB() {
		return produitB;
	}

	@Override
	public void setProduitB(Produit produit) {
		this.produitB = produit;
	}

	@Override
	public String getSeverite() {
		return severite;
	}

	@Override
	public void setSeverite(String severite) {
		this.severite = severite;
		
	}

	@Override
	public String getRisques() {
		return risques;
	}

	@Override
	public void setRisques(String risques) {
		this.risques = risques;
	}

	@Override
	public String getPrecautions() {
		return precautions;
	}
	
	@Override
	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

}
