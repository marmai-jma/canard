package fr.epita.jdr;

public class ComportementHache implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Frapper avec une hache");
    }
}
