package personnages;

public abstract class Personnage {
	
	
	public String nom;
	protected int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public void parler(String paroles) {
		System.out.println("Le " + donnerAuteur() +" " + nom + " : " + "\""+paroles+"\"");
	}
	
	public void frapper(Personnage victime) {
		double coup = ((double)force)/3;
		if(victime.estATerre()) {
			
		}
		else if (this.estATerre()) {
			this.parler("Je ne peux plus me battre...");
		}
		else if(!victime.estATerre() && !this.estATerre()) {
			this.parler("envoie un grand coup dans la mâchoire de " + victime.getNom() + " avec une force de " + (int)Math.ceil(coup));
			victime.recevoirCoup(force / 3);
		}
	}
	
	public void recevoirCoup(int force) {
		
	
		this.force -= force;
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("Aïe !");
		}
	}
	
	public boolean estATerre() {
	    return this.force <= 0; // Le personnage est KO
	}
	
	public String getNom() {
		return nom;
	}
	
	protected abstract String donnerAuteur();
	
}