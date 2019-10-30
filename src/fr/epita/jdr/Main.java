package fr.epita.jdr;

public class Main {
    public static void main(String[] args) {
        System.out.println("Roi");
        Personnage roi = new Roi();
        roi.combattre();
        System.out.println("Reine");
        Personnage reine = new Reine();
        reine.combattre();
        reine.setArme(new ComportementArcEtFleches());
        reine.combattre();
        reine.setArme(new ComportementEpee());
        reine.combattre();
    }
}
