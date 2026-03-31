package praktikum05;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DataDosen lst = new DataDosen();

        System.out.println("ElMenu: ");
        System.out.println("1. Tambah data");
        System.out.println("2. Tampilkan");
        System.out.println("3. Urut Data Bubble");
        System.out.println("4. Urut Data Selection");
        System.out.println("5. Urut Data Insertion");
        
        while (true) {
        System.out.print("Menu: ");
        int menus = scanner.nextInt();
        scanner.nextLine();
            
            if (menus==1) {
                for (int i = 0; i < 5; i++) {
                    
                    System.out.print("Kode: ");
                    String kode = scanner.nextLine();
                    
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jkInput = scanner.next().charAt(0);
                    boolean isLaki = (jkInput == 'L' || jkInput == 'l');
                    
                    System.out.print("Usia: ");
                    int usia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("================================");
                    
                    Dosen dsn = new Dosen(kode, nama, isLaki, usia);
                    lst.tambah(dsn);
                }
            }
            if (menus==2) {
                lst.tampil();
            }
            if (menus==3) {
                lst.SortingASC();
                lst.tampil();
            }
            if (menus==4) {
                lst.SortingDSC();
                lst.tampil();
            }
            if (menus==5) {
                lst.insertionSort();
                lst.tampil();
            }
            if (menus==0) {
                break;
            }
            
        }
    }
}
