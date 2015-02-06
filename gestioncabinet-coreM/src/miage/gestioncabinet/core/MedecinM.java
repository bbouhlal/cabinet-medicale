package miage.gestioncabinet.core;

import miage.gestioncabinet.api.Medecin;

public class MedecinM extends UtilisateurM implements Medecin{

	private String rpps;
	@Override
	public String getRPPS() {
		return this.rpps;
	}
	
	public void setRPPS(String rpps) {
		this.rpps = rpps;
	}
}