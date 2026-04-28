package P2Jobsheet10;

public class MahasiswaJS10 {
    String nim, nama, prodi, kelas;

    public MahasiswaJS10(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampilDat(){
        System.out.println(nim + "-" + nama + "-" + prodi + "-" + kelas);
    }
}
