package miage.gestioncabinet.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;




import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.ConsultationRemoteService;
import miage.gestioncabinet.api.GestionCabinetException;
import miage.gestioncabinet.api.Produit;


public class ConsultationService implements ConsultationRemoteService {

	private Consultation consultation;
	private List<Consultation> listConsultation;
	private List<Produit> produits;
	
	
	public ConsultationService(){
		this.produits = new ArrayList<Produit>();
	}
	
	@Override
	public Consultation getConsultation() {
		if (this.consultation == null)	this.consultation = new ConsultationM();
		return this.consultation;
	}

	@Override
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	@Override
	public Consultation creerRdv(Calendar date) {
		Consultation consultation = new ConsultationM();
		consultation.setDebut(date);
		return consultation;
	}

	@Override
	public List<Produit> rechercherMedicament(String keyword)
			throws GestionCabinetException {
		
		List<Produit> listeProduitKey = new ArrayList<Produit>();
		
		for (Produit p : produits){
			if (p.getNom().toUpperCase().contains(keyword.toUpperCase())) listeProduitKey.add(p);
		}
		
		return listeProduitKey;
	}

	@Override
	public void analyserPrescription() throws GestionCabinetException {
		this.consultation.getPrescription();
	}

	@Override
	public Consultation enregistrer() throws GestionCabinetException {
		this.listConsultation.add(this.consultation);
		return this.consultation;
	}

	@Override
	public void supprimer() throws GestionCabinetException {
		this.listConsultation.remove(this.consultation);
	}

}