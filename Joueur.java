import java.util.ArrayList;

public class Joueur {
    public ArrayList<Carte> main = new ArrayList<>();
    public int points = 0;

    public Carte tirerCarte() {
        return main.remove(0); 
    }

    public void ajouterCarte(Carte carte) {
        main.add(carte);
    }
}
