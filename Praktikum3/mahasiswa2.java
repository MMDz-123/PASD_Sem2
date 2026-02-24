package Praktikum3;

public class mahasiswa2 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
    
    public static void ctkInf(mahasiswa2[] arayofMahasiswa ,int pjg){
      for (int i = 0; i < pjg; i++) {
            System.out.println("NIM:     " + arayofMahasiswa[i].nim);
            System.out.println("Nama:    " + arayofMahasiswa[i].nama);
            System.out.println("Kelas:   " + arayofMahasiswa[i].kelas);
            System.out.println("IPK:     " + arayofMahasiswa[i].ipk);
            System.out.println("===========================================");
      }  
    }
}