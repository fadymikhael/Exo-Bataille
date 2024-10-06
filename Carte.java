public class Carte {
    // Attributs statiques (constants) pour les couleurs et valeurs possibles
    public static String[] couleurs = {"Coeur", "Carreau", "Trèfle", "Pique"};
    public static String[] valeurs = {"Valet", "Roi", "Reine", "As"};
    
    // Attributs de chaque carte
    public String couleur;  // La couleur de la carte (parmi les 4 disponibles)
    public String valeur;   // La valeur de la carte (parmi Valet, Roi, Reine, As)

    // Constructeur pour créer une carte avec une couleur et une valeur spécifiques
    public Carte(String couleur, String valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    // Méthode toString pour afficher la carte sous forme de texte
    public String toString() {
        return couleur + " " + valeur; // Exemple : "Coeur Roi"
    }
}
