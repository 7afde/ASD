package exo_sup;
import java.util.Scanner;
public class Main {
    public static int miroir(int n) {
        int reversenum = 0;
        while(n != 0) {
            int x = n % 10;
            reversenum = reversenum * 10 + x;
            n /= 10;
        }
        return reversenum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entrer le nombre :");
        int x = scan.nextInt();
        System.out.println("le miroir de se nombre est :"+miroir(x));
    }
}
