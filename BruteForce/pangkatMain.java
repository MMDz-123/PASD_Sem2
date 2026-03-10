package BruteForce;

import java.util.Scanner;

public class pangkatMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah elemen: ");
        int elemen = scanner.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+ (i+1) +": ");
            int basis = scanner.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+ (i+1) +": ");
            int pangkat = scanner.nextInt();
            png[i] = new pangkat(basis, pangkat);
        }

        System.out.println("Hasil pangkat BruteForce: ");
        for (pangkat pangkat : png) {
            System.out.println(pangkat.nilai + "^" + pangkat.pangkat + "=" + pangkat.pangkatBF(pangkat.nilai, pangkat.pangkat));
        }
        System.out.println("Hasil pangkat DivideConquer: ");
        for (pangkat pangkat : png) {
            System.out.println(pangkat.nilai + "^" + pangkat.pangkat + "=" + pangkat.pangkatBF(pangkat.nilai, pangkat.pangkat));
        }
    }
}
