package Praktikum3;

public class mahasiswaDemo2 {
    public static void main(String[] args) {
        mahasiswa2[] arayofMahasiswa = new mahasiswa2[3];

        arayofMahasiswa[0] = new mahasiswa2();
        arayofMahasiswa[0].nim = "254822310";
        arayofMahasiswa[0].nama = "Prabu Pranotocoro";
        arayofMahasiswa[0].kelas = "TI-1F";
        arayofMahasiswa[0].ipk = 3.80f;

        arayofMahasiswa[1] = new mahasiswa2();
        arayofMahasiswa[1].nim = "254738137492";
        arayofMahasiswa[1].nama = "Ahmad Maulana";
        arayofMahasiswa[1].kelas = "TI-1H";
        arayofMahasiswa[1].ipk = 3.54f;

        arayofMahasiswa[2] = new mahasiswa2();
        arayofMahasiswa[2].nim = "254313718432";
        arayofMahasiswa[2].nama = "Purtanto";
        arayofMahasiswa[2].kelas = "SIB-1D";
        arayofMahasiswa[2].ipk = 3.92f;

        System.out.println("NIM:     " + arayofMahasiswa[0].nim);
        System.out.println("Nama:    " + arayofMahasiswa[0].nama);
        System.out.println("Kelas:   " + arayofMahasiswa[0].kelas);
        System.out.println("IPK:     " + arayofMahasiswa[0].ipk);
        System.out.println("===========================================");
        System.out.println("NIM:     " + arayofMahasiswa[1].nim);
        System.out.println("Nama:    " + arayofMahasiswa[1].nama);
        System.out.println("Kelas:   " + arayofMahasiswa[1].kelas);
        System.out.println("IPK:     " + arayofMahasiswa[1].ipk);
        System.out.println("===========================================");
        System.out.println("NIM:     " + arayofMahasiswa[2].nim);
        System.out.println("Nama:    " + arayofMahasiswa[2].nama);
        System.out.println("Kelas:   " + arayofMahasiswa[2].kelas);
        System.out.println("IPK:     " + arayofMahasiswa[2].ipk);
        System.out.println("===========================================");
    }
}
