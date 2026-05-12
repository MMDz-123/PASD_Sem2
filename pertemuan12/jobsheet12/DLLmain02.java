package jobsheet12;

import java.util.Scanner;

public class DLLmain02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedList02 list = new DoubleLinkedList02();
        int menus;

        do{
            System.out.println("\n=====MENU DLL=====");
            System.out.println("1.Tambah di awal");
            System.out.println("2.Tambah di akhir");
            System.out.println("3.Sisipkan di tengah (stetlah NIM)");
            System.out.println("4.Hapus di awal");
            System.out.println("5.Hapus di akhir");
            System.out.println("6.Tampilkan data");
            System.out.println("0.Keluar");
            System.out.print("1.Menu: ");
            menus = scanner.nextInt();
            scanner.nextLine();

            switch (menus) {
                case 1:
                    mahasiswa02 mhsAwl = mahasiswa02.input();
                    list.addFirst(mhsAwl);
                    break;
                case 2:
                    mahasiswa02 mhsAkhir = mahasiswa02.input();
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String key = scanner.nextLine();
                    System.out.println("Masukkan data baru");
                    mahasiswa02 baru = mahasiswa02.input();
                    list.insertAfter(key, baru);
                    break;
                case 4:
                    list.remfirst();
                    break;
                case 5:
                    list.remLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                
                default:
                    System.out.println("menu tidak valid");
            }
        }
        while(menus !=0);
        scanner.close();
    }
}
