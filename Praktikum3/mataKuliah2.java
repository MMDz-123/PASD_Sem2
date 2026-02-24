package Praktikum3;

import java.util.Scanner;

public class mataKuliah2 {
    public String kode;
    public String nama;
    public int sks;
    public int jmlJam;

    public void cetakInfo(){
            System.out.println("Kode:        "+kode );
            System.out.println("nama:        "+nama);
            System.out.println("SKS:         "+sks);
            System.out.println("Jumlah jam:  "+jmlJam);
            System.out.println("==================================================");
    }

    public void tambahData(Scanner scanner){
        String dummy;
            System.out.print("Kode:         ");
            kode = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Nama:         ");
            nama = scanner.nextLine();
            scanner.nextLine();
            System.out.print("SKS:          ");
            dummy = scanner.nextLine();
            scanner.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam:   ");
            dummy = scanner.nextLine();
            scanner.nextLine();
            jmlJam = Integer.parseInt(dummy);
    }

}
