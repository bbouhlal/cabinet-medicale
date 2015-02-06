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
			Consultation consultation = app.ejb.creerRdv(date);
			System.out.println("Création d'un rendez-vous : "+ consultation);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
}
