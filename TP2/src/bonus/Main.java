package bonus;
import java.util.*;
public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static float Maximum(float[] T, int N) {
        if(N==0) {
            return T[0];
        }else {
            if(T[N] > Maximum(T, N-1)) {
                return T[N];
            }else {
                return Maximum(T, N-1);
            }
        }
    }

    public static void Lecture(float[] T, int N) {
        for(int i=0; i < N; i++) {
            T[i] = scan.nextFloat();
        }
    }

    public static void main(String[] args) {
        System.out.println("Entrez la taille du tableau :");
        int n = scan.nextInt();
        float[] T = new float[n];
        System.out.println("Entrez les éléments du tableau :");
        Lecture(T, n);
        System.out.println("Le max est :");
        System.out.println(Maximum(T, n-1));
    }
}
