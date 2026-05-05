package pertemuan12;

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
        System.out.println(nama + "-" + nim + "-" + kelas + "-" + ipk);
    }

}
