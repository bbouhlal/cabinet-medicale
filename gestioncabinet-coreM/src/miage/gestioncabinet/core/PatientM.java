package miage.gestioncabinet.core;

import java.util.Calendar;

import miage.gestioncabinet.api.Patient;



public class PatientM extends PersonneM implements Patient {
	
	private Calendar dateNaissance;

	@Override
	public Calendar getDateNaissance() {
		return this.dateNaissance;
	}

	@Override
	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
		
	}

	@Override
	public Integer getAge() {
		Calendar curr = Calendar.getInstance();
	    Calendar birth = dateNaissance;
	    int yeardiff = curr.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
	    curr.add(Calendar.YEAR,-yeardiff);
	    if(birth.after(curr))
	    {
	      yeardiff = yeardiff - 1;
	    }
	    return yeardiff;
	}

 	
}