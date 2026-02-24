package Praktikum3;

import java.util.Scanner;

public class mataKuliahDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        mataKuliah2[] arrayOfMatakuliah = new mataKuliah2[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data matkul ke-"+(i+1)+ ": ");
            arrayOfMatakuliah[i] = new mataKuliah2();
            arrayOfMatakuliah[i].tambahData(scanner);
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data mata kuliah ke-"+(i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
