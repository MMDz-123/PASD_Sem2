package praktikum05;

public class Dosen {
    String kode, nama, jk;
    boolean isLaki;
    int usia;
    

    Dosen(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        isLaki = jk;
        usia = age;
    }
    
    void tampil(){
        if (isLaki) {
            jk = "Laki-laki";
        }
        else{
            jk = "Perempuan";
        }
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Usia: " + usia);
    }
}
