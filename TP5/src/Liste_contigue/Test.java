package Liste_contigue;

import Liste_contigue.Element;

import java.util.Scanner;
public class Test {

    public static Liste creationListe(Liste L){
        int i;
        L.listeVide();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(i = 0; i < N; i++){
            Element e = new Element(scan.nextInt());
            L.inserer(L,i,e);
        }
        return L;
    }
    public static void affichageListe(Liste L){
        for(int i = 0; i < L.longuer_iter(L); i++){
            System.out.println(L.acces(L,i).getId());
        }
    }

    public static void main(String[] args){
        Liste liste1 = new Liste();
        Liste liste2 = new Liste();
        Liste liste3 = new Liste();
        creationListe(liste1);
        creationListe(liste2);
        Liste max = liste3.Concatener(liste1,liste2);
        affichageListe(max);
        System.out.println("final element is :"+max.Queue(max).getId());
        Liste inverse = max.inverse(max);
        System.out.println("reversed liste is :");
        affichageListe(inverse);
//        if (liste1.getLongueur_liste() == 0) {
//            System.out.println("La liste est vide");
//        } else {
//            System.out.println("La liste n'est pas vide");
//            System.out.println("Les éléments de la liste sont :");
//            affichageListe(liste1);
//        }

    }
}