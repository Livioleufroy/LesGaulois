package sites;

import personnages.Gaulois;
import personnages.Soldat;


public class Village {
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[4];
	private int nbVillageois = 0;
	
	public Village(Gaulois chef) {
		this.chef = chef;
	}
	
	public void ajouterVillageois(Gaulois nouveauVoisin) {
		
		villageois[nbVillageois] = nouveauVoisin;
		nbVillageois++;
		
	}
	
	public Gaulois getchef() {
		return chef;
	}
}
