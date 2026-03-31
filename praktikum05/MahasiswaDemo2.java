package praktikum05;

import java.util.Scanner;

public class MahasiswaDemo2 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    MahasiswaBerprestasi maber = new MahasiswaBerprestasi();
      
    for (int i = 0; i < 5; i++) {
        System.out.println("Masukkan data ke-" + (i+1) + ": ");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("IPK: ");
        String tmp = scanner.nextLine();
        double ipk = Double.parseDouble(tmp);

        Mahasiswa02 m = new Mahasiswa02(nim, nama, kelas, ipk);
        maber.tambah(m);
    }
        System.out.println("\n============================");
        System.out.println("Data mahasiswa sebelum sorting");
        maber.tampil();

        System.out.println("\nData mahasiswa setelah sorting (Bubble)");
        maber.bubbleSort();
        maber.tampil();
    }
}
