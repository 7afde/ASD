package exo;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of students (n): ");
        int n = scanner.nextInt();

        Etudiant[] students = new Etudiant[n];

        for (int i = 0; i < n; i++) {

            // Generate a random score less than 17
            int randomScore = random.nextInt(17);

            // Create Etudiant object with the input values and random score
            students[i] = new Etudiant("ETD", i+1, randomScore);
        }





        Tableau_Iteratif t = new Tableau_Iteratif(students,new Etudiant[0]);


        t.afficherTrie(t.triBulle(students, new Etudiant[0]));
        t.afficher(students);


        //Utilisation des méthodes de recherche
        Etudiant etudiantSeq = t.rechercheSequentielle(10);
        Etudiant etudiantDicho = t.rechercheDichotomique(10);

        if (etudiantSeq != null) {
            System.out.println("Étudiant trouvé avec recherche séquentielle : " + etudiantSeq);
        } else {
            System.out.println("Étudiant non trouvé avec recherche séquentielle.");
        }

        if (etudiantDicho != null) {
            System.out.println("Étudiant trouvé avec recherche dichotomique : " + etudiantDicho);
        } else {
            System.out.println("Étudiant non trouvé avec recherche dichotomique.");
        }

        // Affichage des étudiants avec score supérieur à 15
        t.afficherEtudiantsScoreSuperieur15();
    }

    }
