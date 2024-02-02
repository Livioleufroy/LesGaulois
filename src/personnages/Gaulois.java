package personnages;

import Equipements.Gaulois.Potion;

public class Gaulois extends Personnage {
    private double puissancePotion = 1.0; // Puissance initiale sans potion

    public Gaulois(String nom, int force) {
        super(nom, force);
    }
	
    public void boirePotion(Potion potion) {
        if ("Obélix".equals(this.nom)) {
            this.parler("Non, non, non ! Je n'ai pas le droit de boire de la potion magique !");
            return;
        }
        this.puissancePotion = potion.getPuissance();
        this.parler("boit une potion de puissance " + this.puissancePotion);
    }

    @Override
    public void frapper(Personnage victime) {
        int forceCoup = (int)(this.force * this.puissancePotion / 3);
		if(victime.estATerre()) {
			
		}
		else if (this.estATerre()) {
			this.parler("Je ne peux plus me battre...");
		}
		else if(!victime.estATerre() && !this.estATerre()) {
			
        super.parler("envoie un grand coup dans la mâchoire de " + victime.getNom() + " avec une force de " + forceCoup);
        victime.recevoirCoup(forceCoup);
        this.puissancePotion = Math.max(1.0, this.puissancePotion - 0.5); // Diminue la puissance de la potion}
        
    }}

    @Override
	public String donnerAuteur() {
        return "Gaulois";
    }

	public void setPuissancePotion(int puissance) {
		puissancePotion = puissance;
		
	}
}



