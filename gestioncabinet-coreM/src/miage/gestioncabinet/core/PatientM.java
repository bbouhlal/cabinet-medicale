package miage.gestioncabinet.core;

import java.util.Calendar;

import miage.gestioncabinet.api.Patient;

public class PatientM implements Patient {

 	private String sexe;
 	private Calendar dateNaissance;
 	
 	
	public PatientM() {
		super();
	}

	public PatientM(String sexe, Calendar dateNaissance) {
		super();
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPrenom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Calendar getDateNaissance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDateNaissance(Calendar dateNaissance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
