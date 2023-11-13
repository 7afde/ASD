package exo;
import java.util.*;
public class Tableau_Iteratif extends Tableau {

    public Tableau_Iteratif(Etudiant[] tab, Etudiant[] tabTrie) {
        super(tab, tabTrie);
    }

    public Etudiant[] triBulle(Etudiant[] tab, Etudiant[] tabTrie) {
        int i , j;
        Etudiant temp;
        // Create a copy of the original array
        tabTrie = Arrays.copyOf(tab, tab.length);

        boolean permut = false;
        for ( i = 0; i < tabTrie.length - 1; i++) {
            for ( j = 0; j < tabTrie.length - i - 1; j++) {
                if (tabTrie[j + 1].getScore() > tabTrie[j].getScore()) {
                    temp = tabTrie[j];
                    tabTrie[j] = tabTrie[j + 1];
                    tabTrie[j + 1] = temp;
                    permut = true;
                }
            }

        }

        return tabTrie;
    }

    @Override
    public Etudiant[] triInsertion(Etudiant[] tab, Etudiant[] tabTrie) {

        // Create a copy of the original array
        tabTrie = Arrays.copyOf(tab, tab.length);
        int n = tabTrie.length;
        for (int i = 1; i < n; i++) {
            Etudiant temp = tabTrie[i];
            int j = i - 1;

            while ((j >= 0) && (tabTrie[j].getScore() < temp.getScore())) {
                tabTrie[j + 1] = tabTrie[j];
                j--;
            }

            tabTrie[j + 1] = temp;
        }
        return tabTrie;
    }


    @Override
    public Etudiant[] triSelection(Etudiant[] tab, Etudiant[] tabTrie) {
        // Create a copy of the original array
        tabTrie = Arrays.copyOf(tab, tab.length);
        int n = tabTrie.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (tabTrie[minIndex].getScore() < tabTrie[j].getScore()) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element in the unsorted part
            Etudiant temp = tabTrie[minIndex];
            tabTrie[minIndex] = tabTrie[i];
            tabTrie[i] = temp;
        }
        return tabTrie;
    }




    //Méthode de recherche séquentielle
    @Override
    public Etudiant rechercheSequentielle(int score) {
        for (int i = 0; i < tab.length; i++) {

            if (tab[i].getScore() == score) {
                return tab[i];
            }
        }
        return null; // Retourne null si l'étudiant n'est pas trouvé
    }

    // Méthode de recherche dichotomique
    @Override
    public Etudiant rechercheDichotomique(int score) {
        int debut = 0;
        int fin = tab.length - 1;

        while (debut <= fin) {
            int milieu = (debut + fin) / 2;

            if (tab[milieu].getScore() == score) {
                return tab[milieu];
            } else if (tab[milieu].getScore() < score) {
                debut = milieu - 1;
            } else {
                fin = milieu + 1;
            }
        }

        return null; // Retourne null si l'étudiant n'est pas trouvé
    }







    // Méthode pour afficher les étudiants ayant obtenu un score supérieur à 15
    @Override
    public void afficherEtudiantsScoreSuperieur15() {
        System.out.println("Étudiants ayant obtenu un score supérieur à 15 :");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].getScore() > 15) {
                System.out.println(tab[i].getNom() + " " + tab[i].getPrenom());
            }
        }
    }
}





