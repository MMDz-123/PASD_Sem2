package Kuis;

import java.util.Scanner;

public class kuis2 {
    public static void main(String[] args) {
        int jml, a = 0, b=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah item");
        jml = scanner.nextInt();

        kuisA2[] kuis = new kuisA2[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("Item ke-" + (i+1));
            kuis[i] = new kuisA2();
            kuis[i].input(scanner);
        }

        for (int i = 0; i < jml; i++) {
            System.out.println("=====================");
            kuis[i].tampil();
        }

        for (int i = 0; i < jml; i++) {
            a = a + kuis[i].hrg;
        }
        
        System.out.println("Kembali: "+bayar(scanner, jml, a));


    }
        public static int bayar(Scanner scanner, int n, int hrg){
        int met, jml = 0;
        int tun;
        System.out.println("Metode Pembayaran");
        System.out.println("1. Debit");
        System.out.println("2. Tunai");
        met = scanner.nextByte();

        if (met == 1) {
            jml = 0;
        }
        else if (met == 2) {
            System.out.println("Jumlah Tunai: ");
            tun = scanner.nextInt();
            jml = (tun - hrg);
        }
        return jml;
    }
}
