package praktikum05;

public class MahasiswaDemo2 {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Mahasiswa02 m1 = new Mahasiswa02("325", "Zidan", "2A", 3.45);
        Mahasiswa02 m2 = new Mahasiswa02("653", "Ayu", "2A", 3.56);
        Mahasiswa02 m3 = new Mahasiswa02("342", "Sofi", "2A", 3.34);
        Mahasiswa02 m4 = new Mahasiswa02("356", "Sita", "2A", 3.78);
        Mahasiswa02 m5 = new Mahasiswa02("476", "Miki", "2A", 3.67);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data mahasiswa setelah bubble sorting (descend)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah selection sorting (ascend)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah insertion sorting (ascend)");
        list.insertionSort();
        list.tampil();
        
    }
}
