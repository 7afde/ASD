package Liste_abstract;

public abstract class Liste_abstract {

    public abstract Liste listeVide();
    public abstract int getLongueur_liste();
    public abstract Liste inserer(Liste L, int p, Element e);
    public abstract Liste inserer(Liste L, int p, Etudiant e);
    public abstract Liste supprimer(Liste L, int p);
    public abstract Element acces(Liste L, int p);
    public abstract int longuer_iter(Liste L);
    public abstract int longuer_rec(Liste L);
    public abstract boolean estVide(Liste L);
    public abstract Element Queue(Liste L);
    public abstract Liste Concatener(Liste L1, Liste L2);
    public abstract Liste inverse(Liste L);
}
