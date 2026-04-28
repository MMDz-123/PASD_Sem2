package P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianLayanan antri = new AntrianLayanan(5);
        int pil;

        do{
            System.out.println("\n===Menu Antrian Akademik===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat semua antrian");
            System.out.println("5. Jumlah mahasiswa dalam Antrian");
            System.out.println("0.keluar");
            System.out.print("Pilih: ");
            pil = scanner.nextInt();
            scanner.nextLine();

            switch (pil) {
                case 1:
                    System.out.println("Masukkan data...");
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = scanner.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scanner.nextLine();
                    MahasiswaJS10 mhs = new MahasiswaJS10(nim, nama, prodi, kelas);
                    antri.tbhAntrian(mhs);
                    break;
                case 2:
                    MahasiswaJS10 dilayani = antri.layaniMahasiswa();
                    if(dilayani !=null){
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilDat();
                    }
                    break;
                case 3:
                    antri.lihatDepan();
                    break;
                case 4:
                    antri.lhtSemua();
                    break;
                case 5:
                    System.out.println("jumlah dalam antrian: " + antri.getJmlAntrian());
                    break;
                case 0:
                    System.out.println("Matur nuwun");
                    break;
            
                default:
                    break;
            }
        }while (pil!=0);

    }
}
