package miage.gestioncabinet.core;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.ConsultationRemoteService;
import miage.gestioncabinet.api.GestionCabinetException;
import miage.gestioncabinet.api.Interaction;
import miage.gestioncabinet.api.Medecin;
import miage.gestioncabinet.api.Patient;
import miage.gestioncabinet.api.Produit;
import miage.gestioncabinet.api.Traitement;

public class ConsultationM implements Consultation{

	/**
	 *Identifiant par défaut 
	 */
	private static final long serialVersionUID = 1L;
	
	

	
	
	/**
	 * Date de debut du la consultation
	 */
	private Calendar heureDebut;
	
	/**
	 * Date de fin de la consultation
	 */
	private Calendar heureFin;
	
	
	/**
	 * Compte rendu du médecin
	 */
	private String compteRendu;
	
	/**
	 * La liste des traitements
	 */
	private List<Traitement> traitements;
	
	/***
	 * La liste des interactions
	 */
	private List<Interaction> interactions;
	
	/***
	 * La liste des produits
	 */
	private List<Produit>	produits;
	
	/**
	 * Le médecin effectuant la consultation
	 */
	private Medecin medecin;
	
	
	/***
	 * Le patient malade
	 */
	private Patient patient;

	
	
	
	
	
	@Override
	public int compareTo(Consultation o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Patient getPatient() {
		// Instancier un nouveau patient s'il n'existe pas
		if (patient==null)
			patient = new PatientM();
		
		return patient;
	}
	
	@Override
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	@Override
	public Medecin getMedecin() {
		return medecin;
	}
	@Override
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	@Override
	public Calendar getDebut() {
		return this.heureDebut;
	}
	@Override
	public void setDebut(Calendar date) {
		this.heureDebut = date;
	}
	@Override
	public Calendar getFin() {
		return this.heureFin;
	}
	@Override
	public void setFin(Calendar date) {
		this.heureFin = date;
	}
	
	@Override
	public String getCompteRendu() {
		return this.compteRendu;
	}
	@Override
	public void setCompteRendu(String texte) {
		this.compteRendu = texte;
	}
	
	@Override
	public List<Traitement> getPrescription() {
		return this.traitements;
	}
	@Override
	public Boolean ajouterTraitement(Produit produit) {
		//Création de l'objet traitement
		Traitement traitement = new TraitementM();
		traitement.setProduit(produit);
		return this.traitements.add(traitement);
	}
	@Override
	public Boolean supprimerTraitement(Traitement medicament) {
		return this.traitements.remove(medicament);
	}
	@Override
	public List<Interaction> getInteractions() {
		return this.interactions;
	}
	@Override
	public void setInteractions(List<Interaction> interactions) {
		this.interactions = interactions;
		
	}
	
}
