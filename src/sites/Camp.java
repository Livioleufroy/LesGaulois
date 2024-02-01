package sites;

import personnages.Soldat;

public class Camp {
	
	private Soldat commandant;
	private Soldat[] armeeRomain = new Soldat[4];
	private int nbSoldats = 0;
	
		
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		}
	
	public void ajouterSoldat(Soldat recrue) {
		
		armeeRomain[nbSoldats] = recrue;
		nbSoldats++;
		
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
}
