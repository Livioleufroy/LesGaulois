package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[4];
	public int nbVillageois = 0;
	
	public Village(Gaulois chef) {
		this.chef = chef;
	}
	
	public boolean ajouterVillageois(Gaulois nouveauVoisin) {
		
		if (nbVillageois < getVillageois().length) {	
		getVillageois()[nbVillageois] = nouveauVoisin;
		nbVillageois++;
		System.out.println("Le " + chef.donnerAuteur() + chef.getNom() + " : \" Bienvenue " + nouveauVoisin.getNom() + "! \" ");
		return true;
		}
		System.out.println("Le " + chef.donnerAuteur() + chef.getNom() + " : \" Désolé "+ nouveauVoisin.getNom() + " mon village est deja bien rempli.\""); 
		 
		return false;
	}
	
	public void afficherVillageois() {
		System.out.println("Le village de " + chef.getNom() + " est habité par : "); 
		for (int i=0 ; i<nbVillageois; i++) {
			if (this.getVillageois()[i] != null ) {
				System.out.println("- " + getVillageois()[i].getNom()); 
			}
		}
		}
	
	
	public void changerChef( Gaulois chef) {
		System.out.println("Le " + this.chef.donnerAuteur() +" "+ this.chef.getNom() + " : \" Je laisse mon grand bouclier au grand " + chef.getNom() + "\"."); 
		System.out.println("Le " + chef.donnerAuteur()+ " "+ chef.getNom() + " : \"Merci ! \""); 
		this.chef = chef ; 
	}
	
	public Gaulois getchef() {
		return chef;
	}

	public Gaulois[] getVillageois() {
		return villageois;
	}
}
