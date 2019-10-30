package fr.epita.jdr;

public abstract class Personnage {
   ComportementArme arme;

    public Personnage() {}

    public void combattre(){
        arme.utiliserArme();
    }

    public void setArme(ComportementArme arme) {
        this.arme = arme;
    }
}
