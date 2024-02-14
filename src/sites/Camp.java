package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	
	private Soldat commandant;
	private Soldat[] armeeRomaine = new Soldat[4];
	private int nbSoldats = 0;
	
		
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		}
	
	public boolean ajouterSoldat(Soldat recrue) {
		
		if (nbSoldats < armeeRomaine.length) {
			armeeRomaine[nbSoldats] = recrue;
			System.out.println("Le " + recrue.donnerAuteur() + recrue.getNom() + " : "
					+ "\"Je mets mon epee au service de Rome dans le camp dirige par \" " + commandant.getNom());
			nbSoldats++;
			return true;
		}
		System.out.println("Le " + recrue.donnerAuteur() + commandant.getNom() + " : \" Désolé " + recrue.getNom()
				+ " notre camp est complet ! \"");
		return false;
	}
	
	
	public void afficherCamp() {
		
		System.out.println("Le camp dirigé par le "+commandant.grade+" " + commandant.getNom() +" contient les soldats : " );
		for(int i =0 ; i<nbSoldats ; i++) {
			
			System.out.println("- " +armeeRomaine[i].getNom());
		}
		
	}

	public void changerCommandant(Soldat commandant) {
		if (commandant.grade != Grade.CENTURION) {
			this.commandant = commandant;
			System.out.println("Le " + commandant.donnerAuteur() +" "+ commandant.getNom()
					+ " : \" Je ne suis pas suffisamment gradé pour prendre la direction du camp\r\n" + "romain. \".");
		} else {
			System.out.println("Le " + commandant.donnerAuteur() +" "+ commandant.getNom() + " \"Moi " + commandant.getNom()
					+ " je prends la direction du camp romain.\"");
		}
	}
	
	
	public Soldat getCommandant() {
		return commandant;
	}
	
}
