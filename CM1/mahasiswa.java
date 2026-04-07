package CM1;

public class mahasiswa {
    String nim, nama, prodi;

    mahasiswa(String nm, String nma, String prd){
        nim = nm;
        nama = nma;
        prodi = prd;
    }

    void tmapil(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi" + prodi);
    }
}
