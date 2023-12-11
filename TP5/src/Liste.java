public class Liste {
    private static final int LMAX=10000 ;
    private Element tab[] ;
    private int p ;
    private int longueur_liste;
    public Liste() {
        this.tab = new Element[LMAX];
        this.longueur_liste = 0;
    }
    public Liste listeVide(){
        Liste L = new Liste() ;
        L.tab = null ;
        L.longueur_liste = 0 ;
        return L ;
    }

    public int getLongueur_liste() {
        return longueur_liste;
    }

    public Liste inserer(Liste L, int p, Element e){
        int j ;
        if(L.longueur_liste < LMAX){
            if(L.longueur_liste != 0 && p != L.longueur_liste + 1){
                for(j = L.longueur_liste; j >= p; j--){
                    L.tab[j+1] = L.tab[j];
                }
            }
            L.tab[p] = e;
            L.longueur_liste = L.longueur_liste + 1;
        }

        else{
            System.out.println("“l’insertion est impossible, la liste est saturée");
        }
        return L;
    }

    public Liste supprimer(Liste L, int p){
        int j;
        if(L.longueur_liste != 1){
            for(j = p; j <= L.longueur_liste -1; j++){
                L.tab[j] = L.tab[j+1];
            }
        }
        L.longueur_liste = L.longueur_liste - 1;
        return L;
    }

    public Element acces(Liste L, int p){
        return L.tab[p];
    }

    public int longuer_iter(Liste L){
        return L.longueur_liste;
    }

    public int longuer_rec(Liste L){
        if(L == listeVide()){
            return 0;
        }else{
            return 1 + longuer_rec(supprimer(L,1));
        }
    }

    public boolean estVide(Liste L){
        return L == listeVide();
    }
    public Element Queue(Liste L){
        int lon = 0;
        for (int i = 0; i < L.longueur_liste; i++){
            lon = i;
        }
        return acces(L,lon);
    }
    public Liste Concatener(Liste L1, Liste L2) {
        Liste L = new Liste();
        int p = L1.longueur_liste;

        if (p + L2.longueur_liste <= LMAX) {
            L.longueur_liste = p + L2.longueur_liste;

            for (int i = 0; i < p; i++) {
                L.tab[i] = L1.tab[i];
            }

            for (int j = 0; j < L2.longueur_liste; j++) {
                L.tab[p + j] = L2.tab[j];
            }

        }
        return L;
    }
    public Liste inverse(Liste L) {
        int length = L.longueur_liste;

        for (int i = 0; i < length / 2; i++) {
            int j = length - 1 - i;

            Element temp = L.tab[i];
            L.tab[i] = L.tab[j];
            L.tab[j] = temp;
        }
        return L;
    }


}
