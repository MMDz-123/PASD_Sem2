package CM1;

public class peminjaman {
    int lama, btas=5, lmbt, denda;
    mahasiswa mhs;
    buku bk;
    
    peminjaman(mahasiswa mhs, buku buku, int lama){
        this.mhs = mhs;
        bk = buku;
        this.lama = lama;
        denda = htgDenda(5, lama);
    }

    int htgDenda(int batas, int lama){
        if(lama>batas){
            int denda = (lama - batas)*2000;
            return denda;
        }
        else{
            return 0;
        }
    }

    void tampil(){
        System.out.println("Nama: "+ mhs.nama);
        System.out.println("Buku yang dipinjam: "+ bk.Judul);
        System.out.println("Lama: "+ lama);
        System.out.println("Terlambat: "+ (denda/2000));
        System.out.println("Denda: " + denda);
    }
}
