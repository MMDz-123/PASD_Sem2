package praktikum6;

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

    void SelectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxmin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxmin].ipk) {
                    idxmin = j;
                }
            }
            Mahasiswa02 tmp = listMhs[idxmin];
            listMhs[idxmin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa02 temp = listMhs[i];
            int j = i;
            while (j> 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearch(double cari){
        int pos = -1;
        for (int i = 0; i  <  listMhs.length; i++) {
            if(listMhs[i].ipk == cari){
                pos = i;
                break;
            }
        }
        return pos;
    }

    void tampilPos(double x, int pos){
        if(pos != -1){
            System.out.println("Mahasiswa dengan ipk: " + x + " ditemukan pada: " + pos);
        }
        else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilData(double x, int pos){
        if(pos != -1){
            System.out.println("nim\t" + listMhs[pos].nim);
            System.out.println("nama\t" + listMhs[pos].nama);
            System.out.println("kelas\t" + listMhs[pos].kelas);
            System.out.println("ipk\t" + x);
        }
        else{
            System.out.println("Data mahasiswa dengan ipk " + x + " tidak ditemukan");
        }

    }
        int binarySearch(double cari, int left, int right){
            int mid;
            if(right>=left){
                mid = (left + right)/2;
                if(cari == listMhs[mid].ipk){
                    return(mid);
                }
                else if(listMhs[mid].ipk> cari){
                    return binarySearch(cari, left, mid-1);
                }
                else{
                    return binarySearch(cari, mid+1, right);
                }
            }
            return -1;
        }
}
