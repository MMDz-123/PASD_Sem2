

import java.util.Scanner;

public class SLLmain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("---------------------------------");
            System.out.println("MENU MAHASISWA (LINKED LIST)");
            System.out.println("---------------------------------");
            System.out.println("1. Tambah Depan (addFirst)");
            System.out.println("2. Tambah Belakang (addLast)");
            System.out.println("3. Sisip Berdasarkan Indeks (insertAt)");
            System.out.println("4. Hapus Depan (remFirst)");
            System.out.println("5. Hapus Belakang (remLast)");
            System.out.println("6. Cetak List (print)");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM : ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Masukkan IPK : ");
                    double ipk = scanner.nextDouble();
                    mahasiswa02 mhs = new mahasiswa02(nama, kelas, nim, ipk);

                    if (menu == 1) {
                        sll.addFrst(mhs);
                    } else if (menu == 2) {
                        sll.addLast(mhs);
                    } else {
                        System.out.print("Masukkan Indeks: ");
                        int idx = scanner.nextInt();
                        sll.insertAt(idx, mhs);
                    }
                    break;

                case 4:
                    sll.remfirst();
                    break;

                case 5:
                    sll.remLast();
                    break;

                case 6:
                    sll.print();
                    break;
            }
        } while (menu != 0);

    }
}
