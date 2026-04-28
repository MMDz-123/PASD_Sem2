package Praktikum3;

import java.util.Scanner;

public class mahasiswaDemo2 {
    public static void main(String[] args) {
        mahasiswa2[] arayofMahasiswa = new mahasiswa2[3];
        Scanner scanner = new Scanner(System.in);
        String dummy = null;

        for (int i = 0; i < arayofMahasiswa.length; i++) {
            arayofMahasiswa[i] = new mahasiswa2();
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));  
            System.out.print("NIM: ");
            arayofMahasiswa[i].nim = scanner.nextLine();

            System.out.print("Nama:   ");
            arayofMahasiswa[i].nama = scanner.nextLine();

            System.out.print("Kelas:   ");
            arayofMahasiswa[i].kelas = scanner.nextLine();

            System.out.print("IPK:   ");
            dummy = scanner.nextLine();
            arayofMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("========================================");


            scanner.nextLine();
        }
        mahasiswa2.ctkInf(arayofMahasiswa, 3);

        scanner.close();

    }
}
