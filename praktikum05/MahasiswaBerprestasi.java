package praktikum05;

public class MahasiswaBerprestasi {
    Mahasiswa02[] listMhs = new Mahasiswa02[5];
    int idx;

    void tambah(Mahasiswa02 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data penuh.");
        }
    }

    void tampil(){
        for (Mahasiswa02 m : listMhs) {
            m.tampil();
            System.out.println("---------------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa02 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
