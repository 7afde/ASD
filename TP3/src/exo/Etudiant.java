package exo;

public class Etudiant {
    private String nom;
    private int prenom;
    private int score;

    public Etudiant(String nom, int prenom, int score) {
        this.nom = nom;
        this.prenom = prenom;
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public int getPrenom() {
        return prenom;
    }

    public int getScore() {
        return score;
    }
    @Override
    public String toString() {
        return "Nom : " + nom + ", Prénom : " + prenom + ", Score d'examen : " + score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
