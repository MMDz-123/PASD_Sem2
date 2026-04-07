package CM1;

import java.util.Scanner;

public class peminjamanMain {
        public static void main(String[] args) {
        mahasiswa mhsLst[] = new mahasiswa[3];
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        mhsLst[0] = new mahasiswa("22001", "Andi", "Teknik informatika");
        mhsLst[1] = new mahasiswa("22002", "Budi", "Teknik informatika");
        mhsLst[2] = new mahasiswa("22003", "Citra", "Sistem informasi bisnis");

        buku bkList[] = new buku[4];
        bkList[0] = new buku("B001", "Algoritma", 2020);
        bkList[1] = new buku("B002", "Basis Data", 2019);
        bkList[2] = new buku("B003", "Pemrograman", 2021);
        bkList[3] = new buku("B004", "Fisika", 2024);

        peminjaman pjmList[] = new peminjaman[5];
        pjmList[0] = new peminjaman(mhsLst[0], bkList[0], 7);
        pjmList[1] = new peminjaman(mhsLst[1], bkList[1], 3);
        pjmList[2] = new peminjaman(mhsLst[2], bkList[2], 10);
        pjmList[3] = new peminjaman(mhsLst[2], bkList[3], 6);
        pjmList[4] = new peminjaman(mhsLst[0], bkList[1], 4);

        while (menu >=1) {
            System.out.println("menu:");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    for (int i = 0; i < mhsLst.length; i++) {
                        mhsLst[i].tmapil();
                    }
                    
                    break;
                case 2:
                    for (int i = 0; i < bkList.length; i++) {
                        bkList[i].tampil();
                    }
                    
                    break;
                    case 3:
                        for (int i = 0; i < pjmList.length; i++) {
                            pjmList[i].tampil();
                        }
                        
                    break;
                case 4:
                    for (int i = 0; i < pjmList.length - 1; i++) {
                        for (int j = 1; j < pjmList.length - i; j++) {
                            if (pjmList[j-1].denda < pjmList[j].denda) {
                                peminjaman temp = pjmList[j];
                                pjmList[j] = pjmList[j-1];
                                pjmList[j-1] = temp;
                            }
                        }
                    }
                    System.out.println("Data Peminjaman (Urut Berdasarkan Denda Tertinggi):");
                    System.out.println("===================================================");
                    for (peminjaman p : pjmList) {
                        p.tampil(); // Memanggil method tampil dari class peminjaman
                        System.out.println("-----------------------------------");
                    }
                    
                    break;
                case 5:
                    System.out.print("Key: ");
                    String key = scanner.nextLine();
                    for (int i = 0; i < pjmList.length-1; i++) {
                        for (int j = 1; j < pjmList.length-i; j++) {
                            if (pjmList[j-1].mhs.nim.compareTo(pjmList[j].mhs.nim)>0) {
                                peminjaman temp = pjmList[j];
                                pjmList[j] = pjmList[j-1];
                                pjmList[j-1] = temp;
                            }
                        }
                    }
                    int posisi = binarySearchNIM(pjmList, key, 0, pjmList.length - 1);
                    if (posisi != -1) {
                        pjmList[posisi].tampil(); 
                    } else {
                        System.out.println("NIM " + key + " tidak ditemukan.");
                    }
                    
                    break;
                
                default:
                    break;
            }
        }
    }

    static int binarySearchNIM(peminjaman[] list, String cariNIM, int left, int right) {
    if (right >= left) {
        int mid = left + (right - left) / 2;
        int hasilBanding = cariNIM.compareTo(list[mid].mhs.nim);
        if (hasilBanding == 0) {
            return mid;
        }
        if (hasilBanding < 0) {
            return binarySearchNIM(list, cariNIM, left, mid - 1);
        }
        return binarySearchNIM(list, cariNIM, mid + 1, right);
    }
    return -1;
    }
}
