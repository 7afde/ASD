package Liste_abstract;

public abstract class Liste_abstract {

    public abstract Liste_abstract listeVide();
    public abstract int getLongueur_liste();
    public abstract Liste_abstract inserer(Liste_abstract L, int p, Element e);
    public abstract Liste_abstract supprimer(Liste_abstract L, int p);
}
