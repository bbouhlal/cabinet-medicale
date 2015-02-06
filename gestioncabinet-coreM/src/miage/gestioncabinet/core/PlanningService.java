package miage.gestioncabinet.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.GestionCabinetException;
import miage.gestioncabinet.api.Medecin;
import miage.gestioncabinet.api.Patient;
import miage.gestioncabinet.api.PlanningRemoteService;
import miage.gestioncabinet.api.Utilisateur;

// !Bas�e sur PlanningRemoteService.java


@Remote(PlanningRemoteService.class)
@Stateful
public class PlanningService implements PlanningRemoteService {

	private Utilisateur utilisateur;
	private Calendar dateDebut;
	private Calendar dateFin;
	private Medecin medecin;
	private Consultation rdvCourant;
	private List<Consultation> listRdv;
	private List<Medecin> listMedecin;
	private List<Patient> listPatient;
	
	
	
	public PlanningService(){
		this.listRdv = new ArrayList<Consultation>();
		this.rdvCourant = new ConsultationM();
	}
	
	@Override
	public Utilisateur getUtilisateur() {		
		return this.utilisateur;
	}

	@Override
	public List<Medecin> rechercherMedecins() throws GestionCabinetException {
		return listMedecin;
	}

	@Override
	public List<Patient> rechercherPatients(String nom, String prenom,
			Calendar dateNaissance) throws GestionCabinetException {
		return this.listPatient;
	}

	@Override
	public Calendar getDateDebut() {
		if (dateDebut == null) dateDebut = Calendar.getInstance();
		dateDebut.set(Calendar.HOUR_OF_DAY, 9);
		return this.dateDebut;
	}

	@Override
	public void setDateDebut(Calendar date) {
		this.rdvCourant.setDebut(date);
	}

	@Override
	public Calendar getDateFin() {
		if (dateFin == null) dateFin = Calendar.getInstance();
		dateFin.set(Calendar.HOUR_OF_DAY, 9);
		return this.dateFin;
	}

	@Override
	public void setDateFin(Calendar date) {
		this.rdvCourant.setFin(date);
	}

	@Override
	public Medecin getMedecin() {
		if ( this.medecin == null)	this.medecin = new MedecinM();
		return this.medecin;
	}

	@Override
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	@Override
	public List<Consultation> listerRdv() {
		return this.listRdv;
	}

	@Override
	public Consultation getRdvCourant() {
		return this.rdvCourant;
	}

	@Override
	public void setRdvCourant(Consultation rdv) {
		this.rdvCourant = rdv;
	}

	@Override
	public Consultation creerRdv(Calendar date) {
		Consultation rdvCourant =  this.getRdvCourant();
		rdvCourant.setDebut(date);
		return rdvCourant;
	}

	@Override
	public Consultation enregistrerRdv() throws GestionCabinetException {
		Consultation rdvCourant = this.getRdvCourant();
		this.listerRdv().add(rdvCourant);
		return rdvCourant;
	}

	@Override
	public void supprimerRdv() throws GestionCabinetException {
		Consultation rdvCourant = this.getRdvCourant();
		this.listerRdv().remove(rdvCourant);
	}

}