package fr.epita.canard;

public class MiniSimulateur {
    public static void main(String[] args) {
        Canard colvert = new Colvert();
        colvert.afficher();
        colvert.effectuerVol();
        colvert.effectuerCancan();

        Canard proto = new PrototypeCanard();
        proto.afficher();
        proto.effectuerVol();
        proto.setComportementVol(new PropulsionAReaction());
        proto.effectuerVol();

        Appeau appeau = new Appeau();
        appeau.afficher();
        appeau.effectuerCancan();

    }
}
