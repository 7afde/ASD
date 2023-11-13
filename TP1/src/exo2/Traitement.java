package exo2;

public class Traitement {
    public void comparer(Etudiant a, Etudiant b, Etudiant c) {
        if (a.getNote() > b.getNote()) {
            c.setNote(a.getNote());
        }
        else {
            c.setNote(b.getNote());
        }

    }
    public void admis(Etudiant e, boolean res) {
        if(e.getNote() >= 10) {
            res = true;
        }
        else {
            res = false;
        }
    }
    public boolean memegroupe(Etudiant a, Etudiant b) {
        if (a.getGroupe() == b.getGroupe()) {
            return true;
        } else {
            return false;
        }
    }
}
