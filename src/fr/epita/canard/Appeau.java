package fr.epita.canard;

public class Appeau {
    private ComportementCancan comportementCancan;

    public Appeau(){}

    public void effectuerCancan (){
        this.comportementCancan = new Cancan();
        comportementCancan.cancaner();
    }

    public void afficher(){
        System.out.println("Je suis un appeau");
    }
}
