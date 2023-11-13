package exo2;

public class Etudiant {
    private  String nom;
    private float note;
    private int groupe;

    public Etudiant() {

    }

    public Etudiant(String nom, float note, int groupe) {
        this.nom = nom;
        this.note = note;
        this.groupe = groupe;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

}
