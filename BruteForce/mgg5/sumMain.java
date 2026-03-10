package BruteForce.mgg5;

import java.util.Scanner;

public class sumMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = scanner.nextInt();

        sum sum = new sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan keuntungan ke-"+ (i+1)+ ": ");
            sum.untung[i] = scanner.nextDouble();
        }

        System.out.println("Total dengan BF: "+ sum.totalBF());
        System.out.println("Total dengan DC: "+ sum.totalDC(sum.untung, 0, elemen-1));
        scanner.close();
    }
}
