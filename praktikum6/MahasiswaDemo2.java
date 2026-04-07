package praktikum6;

import java.util.Scanner;

public class MahasiswaDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        int jml = 5;
        double aosd = 0;

        Mahasiswa02 m1 = new Mahasiswa02("325", "Zidan", "2A", 3.45);
        Mahasiswa02 m2 = new Mahasiswa02("653", "Ayu", "2A", 3.56);
        Mahasiswa02 m3 = new Mahasiswa02("342", "Sofi", "2A", 3.34);
        Mahasiswa02 m4 = new Mahasiswa02("356", "Sita", "2A", 3.78);
        Mahasiswa02 m5 = new Mahasiswa02("476", "Miki", "2A", 3.67);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);        

            list.tampil();
                System.out.println("==================");
                System.out.println("Pencarian data");
                System.out.println("==================");
                System.out.print("Cari berdasarkan IPK: ");
                double cari = scanner.nextDouble();
            
            System.out.println("Sequential search...");
            double pos = list.sequentialSearch(cari);
            int psi = (int) pos;
            list.tampilPos(pos, psi);
            list.tampilData(pos, psi);

            System.out.println("Sequential search...");
            double pos2 = list.binarySearch(cari, 0, jml-1);
            int psi2 = (int) pos;
            list.tampilPos(pos2, psi2);
            list.tampilData(pos2, psi2);

            scanner.close();
        /*
        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();
        
        System.out.println("Data mahasiswa setelah bubble sorting (descend)");
        list.bubbleSort();
        list.tampil();
        
        System.out.println("Data mahasiswa setelah selection sorting (ascend)");
        list.SelectionSort();
        list.tampil();
        
        System.out.println("Data mahasiswa setelah insertion sorting (ascend)");
        list.insertionSort();
        list.tampil();
        */
        
    }
}
