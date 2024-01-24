package personnages;

public abstract class Personnage {
	
	
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public void parler(String paroles) {
		System.out.println("Le " + donnerAuteur() +" " + nom + " : " + paroles);
	}
	
	public void frapper(Personnage victime) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : Envois un grand coup dans la machoire du " + victime.donnerAuteur() + " " + victime.getNom());
		victime.recevoirCoup(force / 3);
	}
	
	public void recevoirCoup(int force) {
		
	
		this.force -= force;
		if (this.force < 0) {
			this.force = 0;
			this.parler("J'abandonne, j'espere que la sauce sera bonne.");
		} else {
			this.parler("Aïe ! Il faut me resaisir sinon César me transformera en salade.");
		}
	}
	
	
	public String getNom() {
		return nom;
	}
	
	protected abstract String donnerAuteur();
	
}