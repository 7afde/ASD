package exo1;
import java.util.Scanner;
public class Main {
    public static int[] Lecture(int[] T) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < T.length; i++) {
            T[i] = sc.nextInt();
        }
        return T;
    }

    // Méthode récursive pour rechercher la valeur V dans le tableau
    public static int Recherche(int[] T, int index, int V) {
        int position = -1;
        for(int i = 0; i <= index; i++ ) {
            if(T[i]==V) {
                position = i;
                i = index;
            }
        }
        return position;
    }

    // Méthode pour supprimer une valeur V du tableau en utilisant la méthode Recherche
    public static void Suppression(int[] T,int n, int V) {
        int position ;
        position = Recherche(T, n, V);

        if (position != -1) {

            for (position = position; position < n-1; position++) {

                T[position] = T[position+1];
            }
            n = n - 1;
        } else {
            System.out.println("not found");
        }
    }

    // Méthode pour afficher le contenu d'un tableau
    public static void Affichage(int[] T) {
        for (int i = 0; i < T.length-1; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println(); // Pour ajouter une ligne vide après l'affichage
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la taille du tableau :");
        int taille = scanner.nextInt();
        int[] T = new int[taille];

        System.out.println("Entrez les éléments du tableau :");
        T = Lecture(T);

        System.out.print("Entrez la valeur V que vous souhaitez supprimer : ");
        int V = scanner.nextInt();
        Suppression(T, taille, V);

        System.out.println("Tableau après suppression de la valeur " + V + ":");
        Affichage(T);



    }
}