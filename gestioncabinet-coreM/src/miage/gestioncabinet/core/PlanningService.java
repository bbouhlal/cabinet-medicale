package miage.gestioncabinet.core;

import java.util.Calendar;
import java.util.List;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.GestionCabinetException;
import miage.gestioncabinet.api.Medecin;
import miage.gestioncabinet.api.Patient;
import miage.gestioncabinet.api.PlanningRemoteService;
import miage.gestioncabinet.api.Utilisateur;

// !Basée sur PlanningRemoteService.java

public class PlanningService implements PlanningRemoteService {

	private Utilisateur utilisateur;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Medecin medecin;
	private Consultation rdvCourant;
	private List<Consultation> rdv;
	

	public PlanningService(Utilisateur utilisateur, Calendar dateDebut,
			Calendar dateFin, Medecin medecin) {
		super();
		this.utilisateur = utilisateur;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.medecin = medecin;
	}

	
	@Override
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	@Override
	public List<Medecin> rechercherMedecins() throws GestionCabinetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> rechercherPatients(String nom, String prenom,
			Calendar dateNaissance) throws GestionCabinetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Calendar getDateDebut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDateDebut(Calendar date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Calendar getDateFin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDateFin(Calendar date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Medecin getMedecin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMedecin(Medecin medecin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Consultation> listerRdv() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consultation getRdvCourant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRdvCourant(Consultation rdv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Consultation creerRdv(Calendar date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consultation enregistrerRdv() throws GestionCabinetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerRdv() throws GestionCabinetException {
		// TODO Auto-generated method stub
		
	}

}
