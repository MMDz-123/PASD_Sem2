package praktikum6;

import java.util.Scanner;

public class MahasiswaDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        int jml = 5;
        double aosd = 0;

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();
            System.out.print("IPK: ");
            String a = scanner.nextLine();
            Double ipk = Double.parseDouble(a);
            System.out.print("===================");
            list.tambah( new Mahasiswa02(nim, nama, kelas, ipk));
        }

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
