package CM1;

public class buku {
    String Kode, Judul;
    int thn;

    buku(String kd, String jdl, int th){
        Kode = kd;
        Judul = jdl;
        thn = th;
    }

    void tampil(){
        System.out.println("Kode Buku: " + Kode);
        System.out.println("Judul: " + Judul);
        System.out.println("Tahun terbit: " + thn);
    }
}
