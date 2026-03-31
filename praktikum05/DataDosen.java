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
            for (int j = 1; j < dsnLst.length-i; j++) {
                if (dsnLst[j].usia > dsnLst[j-1].usia) {
                    Dosen tmp = dsnLst[j];
                    dsnLst[j] = dsnLst[j-1];
                    dsnLst[j-1] = tmp;
                }
            }
        }
    }

    void SortingDSC(){
        for (int i = 0; i < dsnLst.length-1; i++) {
            int minid = i;
            for (int j = i+1; j < dsnLst.length; j++) {
                if (dsnLst[j].usia < dsnLst[minid].usia) {   
                    minid = j;
                }
            }
            Dosen tmp = dsnLst[minid];
            dsnLst[minid] = dsnLst[i];
            dsnLst[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < dsnLst.length; i++) {
            Dosen temp = dsnLst[i];
            int j = i;
            while (j > 0 && dsnLst[j-1].usia < temp.usia) {
                dsnLst[j] = dsnLst[j-1];
                j--;
            }
            dsnLst[j] = temp;
        }
    }
}
