package praktikum05;

public class DataDosen {
    Dosen[] dsnLst = new Dosen[5];
    int idx;

    void tambah(Dosen dsn){
        if (idx < dsnLst.length) {
            dsnLst[idx] = dsn;
            idx++;
        }
        else{
            System.out.println("Data penuh");
        }
    }

    void tampil(){
        for (Dosen dsn : dsnLst) {
            dsn.tampil();
            System.out.println("=============================");
        }
    }

    void SortingASC(){
        for (int i = 0; i < dsnLst.length-1; i++) {
            for (int j = i; j < dsnLst.length-i; j++) {
                if (dsnLst[j].usia > dsnLst[j-1].usia) {
                    Dosen tmp = dsnLst[j];
                }
            }
        }
    }
}
