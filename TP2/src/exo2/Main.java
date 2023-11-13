package exo2;
import java.util.*;
public class Main {
    public static boolean Premier(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int NbreDiviseurs(int N, int M) {
        if(N < M) {
            return 0;
        }else if(N==M) {
            return 1;
        }else if(N % M ==0) {
            return 1 + NbreDiviseurs(N ,M+1);
        }else {
            return NbreDiviseurs(N ,M + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("enter your number :");
        int a = scan.nextInt();

        System.out.println(Premier(a));
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(NbreDiviseurs(x, y));
    }
}
