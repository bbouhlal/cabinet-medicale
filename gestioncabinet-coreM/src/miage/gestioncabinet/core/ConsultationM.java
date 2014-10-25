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

	private Long id;
	private Calendar dateRdv;
	private Date heureDebut;
	private Date heureFin;
	private String compteRendu;
	private List<Traitement> traitements;
	private List<Interaction> interactions;
	private Medecin medecin;
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public Calendar getDebut() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDebut(Calendar date) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Calendar getFin() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setFin(Calendar date) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getCompteRendu() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setCompteRendu(String texte) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Traitement> getPrescription() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean ajouterTraitement(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean supprimerTraitement(Traitement medicament) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Interaction> getInteractions() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setInteractions(List<Interaction> interactions) {
		// TODO Auto-generated method stub
		
	}
	
}
