package BruteForce.mgg5;

import java.util.Scanner;

public class faktorialMain {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai:");   
        n = scanner.nextInt();

        faktorial fk = new faktorial();
        System.out.println("nilai faktorial "+ n +"menggunakan BF: "+ fk.faktorialBF(n));
        System.out.println("nilai faktorial "+ n +"menggunakan DC: "+ fk.faktorialDC(n));
        scanner.close();
    }
}
