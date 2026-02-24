package Praktikum3;

import java.util.Scanner;

public class mataKuliahDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        mataKuliah2[] arrayOfMatakuliah = new mataKuliah2[3];
        String kode = null, nama = null, dummy = null;
        int sks = 0, jmlJam = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data matkul ke-"+(i+1)+ ": ");
            arrayOfMatakuliah[i] = new mataKuliah2();
            arrayOfMatakuliah[i].tambahData(scanner);
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
