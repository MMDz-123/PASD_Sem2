package jobsheet12;

import java.util.Scanner;

public class mahasiswa02 {
    String nama, nim, kelas;
    double ipk;

    public mahasiswa02(String nama, String kelas, String nim, double ipk){
        this.nama = nama;
        this.kelas = kelas;
        this.nim = nim;
        this.ipk = ipk;
    }

    public void tmpl(){
        System.out.println(
            "NIM      : " + nim+
            "\nNama   : " + nim+
            "\nKelas  : " + nim+
            "\nIPK    : " + ipk
        );
    }

        public static mahasiswa02 input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama  : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = scanner.nextLine();

        System.out.print("Masukkan NIM   : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan IPK   : ");
        double ipk = scanner.nextDouble();

        return new mahasiswa02(nama, kelas, nim, ipk);
    }
}
