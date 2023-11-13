package exo;

public abstract class Tableau {
    protected Etudiant[] tab;
    protected Etudiant[] tabTrie;

    public Tableau(Etudiant[] tab, Etudiant[] tabTrie) {
        this.tab = tab;
        this.tabTrie = tabTrie;

    }

    public void afficher(Etudiant[] tab){
        System.out.println("Informations des étudiants non triées :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
    public void afficherTrie(Etudiant[] tabTrie){
        System.out.println("Informations des étudiants triées :");
        for (int i = 0; i < tabTrie.length; i++) {
            System.out.println(tabTrie[i]);
        }
    }
    public abstract Etudiant[] triBulle(Etudiant[] tab, Etudiant[] tabTrie) ;
    public abstract Etudiant[] triInsertion(Etudiant[] tab, Etudiant[] tabTrie) ;
    public abstract Etudiant[] triSelection(Etudiant[] tab, Etudiant[] tabTrie) ;



    public abstract Etudiant rechercheSequentielle(int score);


    public abstract Etudiant rechercheDichotomique(int score);
    public abstract void afficherEtudiantsScoreSuperieur15();
}
