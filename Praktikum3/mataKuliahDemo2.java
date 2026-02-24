package Praktikum3;

import java.util.Scanner;

public class mataKuliahDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mataKuliah2[] arrayOfMatakuliah = new mataKuliah2[3];
        String kode, nama, dummy;
        int sks, jmlJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Kuliah ke-"+ (i+1));
            System.out.print("Kode:         ");
            kode = scanner.nextLine();
            System.out.print("Nama:         ");
            nama = scanner.nextLine();
            System.out.print("SKS:          ");
            dummy = scanner.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam:   ");
            dummy = scanner.nextLine();
            jmlJam = Integer.parseInt(dummy);

            arrayOfMatakuliah[i] = new mataKuliah2(kode, nama, sks, jmlJam);
            
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("data mata kuliah ke-"+ (i+1));
            System.out.println("Kode:        "+arrayOfMatakuliah[i].kode );
            System.out.println("nama:        "+arrayOfMatakuliah[i].nama);
            System.out.println("SKS:         "+arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah jam:  "+arrayOfMatakuliah[i].jmlJam);
            System.out.println("==================================================");
        }
    }
}
