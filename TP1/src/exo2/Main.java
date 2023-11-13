package exo2;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String name;
        float note;
        int groupe;
        boolean a = true;

        Etudiant first = new Etudiant(name = cs.next(), note = cs.nextFloat(), groupe = cs.nextInt());
        Etudiant second = new Etudiant(name = cs.next(), note = cs.nextFloat(), groupe = cs.nextInt());

        Etudiant res1 = new Etudiant("null",1,1);

        Traitement tr = new Traitement();

        tr.comparer(first, second, res1);
        tr.admis(first, a);

        System.out.println(res1.getNote());
        System.out.println(a);
        System.out.println(tr.memegroupe(first, second));
    }
}
