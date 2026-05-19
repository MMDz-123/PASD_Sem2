package CM2;

import java.util.Scanner;


public class dllMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menus;
        dll list = new dll();
         do{
            System.out.println("\n=====MENU DLL=====");
            System.out.println("1.Tambah Antrian");
            System.out.println("2.Cetak Antrian");
            System.out.println("3.Hapus antrian dan pesan");
            System.out.println("4.Laporan Pesanan");
            System.out.println("0.Keluar");
            System.out.print("Menu: ");
            menus = scanner.nextInt();
            scanner.nextLine();

            switch (menus) {
                case 1:
                   System.out.print("Nama: ");
                   String nama = scanner.nextLine();
                   System.out.print("Nomor HP: ");
                   String no = scanner.nextLine();
                   pembeli bBaru = new pembeli(nama, no);
                   list.tambah(bBaru);
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    if (list.isempty()) {
                        System.out.println("Antrina kosong");
                    }
                    else{
                        System.out.print("Nama pesanan: ");
                        String namaP = scanner.nextLine();
                        System.out.print("Kode: ");
                        int kode = scanner.nextInt();
                        System.out.print("Harga:");
                        int hrg = scanner.nextInt();

                        pesanan baru = new pesanan(namaP, hrg, kode);
                        list.pesan(baru);
                    }
                    break;
                case 4:
                    list.tplPesan();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;
                
                default:
                    System.out.println("menu tidak valid");
            }
        }
        while(menus !=0);
    }
}
