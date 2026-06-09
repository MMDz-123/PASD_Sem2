package jobsheet14;

public class BTArrayMain {
    public static void main(String[] args) {
        binaryTreeArray bta = new binaryTreeArray();

        mahasiswa02 mhs1 = new mahasiswa02("Ali", "A", "2578641201", 3.57);
        mahasiswa02 mhs2 = new mahasiswa02("Badar", "B", "2578641201", 3.47);
        mahasiswa02 mhs3 = new mahasiswa02("Candra", "C", "2578641201", 3.75);
        mahasiswa02 mhs4 = new mahasiswa02("Dewi", "B", "2578641201", 3.36);
        mahasiswa02 mhs5 = new mahasiswa02("Devi", "A", "2578641201", 3.82);
        mahasiswa02 mhs6 = new mahasiswa02("Ehsan", "D", "2578641201", 3.42);
        mahasiswa02 mhs7 = new mahasiswa02("Fizi", "B", "2578641201", 3.12);

        mahasiswa02[] mhsarr = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populate(mhsarr, idxLast);
        System.out.println("\nInOrder Traversal");
        bta.traverseInOrder(0);
    }
}
