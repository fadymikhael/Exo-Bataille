import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

    public static void main(String[] args) {
        // Création de deux joueurs
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();

        // Création d'un paquet de cartes
        ArrayList<Carte> paquet = new ArrayList<>();

        // Remplissage du paquet avec toutes les cartes possibles (couleurs et valeurs)
        for (String couleur : Carte.couleurs) {
            for (String valeur : Carte.valeurs) {
                paquet.add(new Carte(couleur, valeur)); // Ajout d'une carte avec couleur et valeur
            }
        }

        // Mélange des cartes
        Collections.shuffle(paquet);

        // Distribution des cartes (moitié à chaque joueur)
        for (int i = 0; i < paquet.size(); i++) {
            if (i % 2 == 0) {
                joueur1.ajouterCarte(paquet.get(i)); // Les cartes paires vont au joueur 1
            } else {
                joueur2.ajouterCarte(paquet.get(i)); // Les cartes impaires vont au joueur 2
            }
        }

        // Boucle de jeu : on joue tant que les deux joueurs ont des cartes
        while (!joueur1.main.isEmpty() && !joueur2.main.isEmpty()) {
            Carte carteJoueur1 = joueur1.tirerCarte(); // Le joueur 1 tire une carte
            Carte carteJoueur2 = joueur2.tirerCarte(); // Le joueur 2 tire une carte

            System.out.println("Joueur 1 joue: " + carteJoueur1);
            System.out.println("Joueur 2 joue: " + carteJoueur2);

            // Comparaison des cartes : tu peux ajuster la logique selon les règles que tu veux
            if (carteJoueur1.valeur.equals("Roi") && !carteJoueur2.valeur.equals("Roi")) {
                joueur1.points++;
                System.out.println("Joueur 1 gagne ce tour !");
            } else if (!carteJoueur1.valeur.equals("Roi") && carteJoueur2.valeur.equals("Roi")) {
                joueur2.points++;
                System.out.println("Joueur 2 gagne ce tour !");
            } else {
                System.out.println("Égalité !");
            }

            System.out.println("Score : Joueur 1 - " + joueur1.points + " | Joueur 2 - " + joueur2.points);
        }

        // Détermination du gagnant
        if (joueur1.points > joueur2.points) {
            System.out.println("Joueur 1 gagne la partie !");
        } else if (joueur1.points < joueur2.points) {
            System.out.println("Joueur 2 gagne la partie !");
        } else {
            System.out.println("La partie est une égalité !");
        }
    }
}
