package miage.gestioncabinet.client;

import java.util.Calendar;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.ConsultationRemoteService;
import miage.gestioncabinet.api.Medecin;

import com.novarem.jndi.ServiceLocator;
import com.novarem.jndi.ServiceLocatorException;

/**
 * Programme client permettant de tester la consultation.
 * @author blamy
 *
 */
public class ConsultationTestClient {
	/**
	 * L'interface distante de l'EJB
	 */
	private ConsultationRemoteService ejb;

	/**
	 * Constructeur avec lookup pour récupérer le proxy de l'EJB
	 * @see java.lang.Object#Object()
	 */
	public ConsultationTestClient() {
		String service = "ejb:gestion-cabinet/gestioncabinet-coreM//ConsultationService!miage.gestioncabinet.api.ConsultationRemoteService?stateful";
		try{
			ServiceLocator locator = ServiceLocator.INSTANCE;
			this.ejb = (ConsultationRemoteService) locator.getRemoteInterface(service);
		}
		catch(ServiceLocatorException e){
			System.out.println("Le service "+service+" est introuvable");
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		ConsultationTestClient app = new ConsultationTestClient();
		System.out.println("On développe un scénario de test du service de gestion de consultation");
				
		
		try{

			Calendar date = Calendar.getInstance();
			date.set(Calendar.HOUR_OF_DAY, 9);
			Consultation c1 = app.ejb.creerRdv(date);
			System.out.println("Création d'un 1er rdv : "+ c1);
			date.set(Calendar.HOUR_OF_DAY, 10);
			Consultation c2 = app.ejb.creerRdv(date);
			System.out.println("Création d'un 2nd rdv : "+ c2);
			date.set(Calendar.HOUR_OF_DAY, 11);
			Consultation c3 = app.ejb.creerRdv(date);
			System.out.println("Création d'un 3eme rdv : "+ c3);

			System.out.println("Sélection de la 1ère consultation comme consultation courante");
			app.ejb.setConsultation(c1);
			Consultation c1bis = app.ejb.enregistrer();
			System.out.println("La 1ère consultation est enregistrée : "+ c1bis);
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
}
