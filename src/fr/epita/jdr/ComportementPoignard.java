package fr.epita.jdr;

public class ComportementPoignard implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("porter un coup de poignard");
    }
}
