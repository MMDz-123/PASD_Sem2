package Praktikum3;

import java.util.Scanner;

public class mataKuliahDemo2 {
    public static void main(String[] args) {
        int jml = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah matkul: ");
        jml = scanner.nextInt();
        mataKuliah2[] arrayOfMatakuliah = new mataKuliah2[jml];


        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data matkul ke-"+(i+1)+ ": ");
            arrayOfMatakuliah[i] = new mataKuliah2();
            arrayOfMatakuliah[i].tambahData(scanner);
            System.out.println();
        }
        for (int i = 0; i < jml; i++) {
            System.out.println("Data mata kuliah ke-"+(i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
