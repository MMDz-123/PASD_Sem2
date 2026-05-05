package pertemuan12;

public class SLLmain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();

        mahasiswa02[] mhs = new mahasiswa02[4] ;
        mhs[0] = new mahasiswa02("Tung Sahur", "2G", "190", 3.20);
        mhs[1] = new mahasiswa02("Tralalero", "2K", "191", 3.20);
        mhs[2] = new mahasiswa02("Dindindun", "2j", "192", 3.20);
        mhs[3] = new mahasiswa02("Assasino", "2R", "193", 3.20);

        sll.print();
        sll.addFrst(mhs[0]);
        sll.print();
        sll.addFrst(mhs[1]);
        sll.print();
        sll.addLast(mhs[3]);
        sll.print();
        sll.insertAt(2, mhs[2]);
        sll.print();

        // Praktikum 2
        System.out.println("data indeks 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an 'Tung Sahur' berada di indeks: " + sll.idxof("Tung Sahur"));

        sll.remfirst();
        sll.remLast();
        sll.print();
        sll.remAt(0);
        sll.print();
    }
}
