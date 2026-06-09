package AsesmenTree;

public class binaryTreeMain {
    public static void main(String[] args) {
        binaryTree bst = new binaryTree();

        bst.add(new mahasiswa02("Andi", "TI-1A", "220101001", 3.95));
        bst.add(new mahasiswa02("Budi", "TI-1A", "220101002", 3.20));
        bst.add(new mahasiswa02("Sinta", "TI-1B", "220101003", 3.82));
        bst.add(new mahasiswa02("Rina", "TI-1B", "220101004", 3.45));
        bst.add(new mahasiswa02("Dimas", "TI-1C", "220101005", 2.75));
        bst.add(new mahasiswa02("Fajar", "TI-1C", "220101006", 3.10));
        bst.add(new mahasiswa02("Nabila", "TI-1D", "220101007", 3.76));
        bst.add(new mahasiswa02("Rizky", "TI-1D", "220101008", 3.50));
        bst.add(new mahasiswa02("Aulia", "TI-1E", "220101009", 3.88));
        bst.add(new mahasiswa02("Kevin", "TI-1E", "220101010", 3.00));

        System.out.println("\nDaftar Mahasiswa (Order Traversal)");
        bst.traverseInOrder(bst.root);

        // System.out.println("\nPencarian Data Mahasiswa ");
        // System.out.println("ipk: 3.54");
        // String hasilCari = bst.fing(3.54)?"Ditemukan":"tidak ditemukan";
        // System.out.println(hasilCari);

        System.out.println("\nPencarian nama: Fajar");
        node02 hasilNama = bst.findName("Fajar");
        if(hasilNama !=null){
            hasilNama.data.tmpl();
        }
        else{
            System.out.println("tidak ditemukan");
        }

        System.out.println("\nPencarian kelas: TI-1B");
        bst.srcKls("TI-1B");

        System.out.println("\n3 IPK tertinggi: ");
        bst.top3();

        // System.out.println("\nDaftar setelah Penambahan");
        // System.out.println("\nIn Order Traversal");
        // bst.traverseInOrder(bst.root);
        // System.out.println("\nPre Order Traversal");
        // bst.traversePreOrder(bst.root);
        // System.out.println("\nPost Order Traversal");
        // bst.traversePostOrder(bst.root);
        
        // System.out.println("\nPengapusan data Mahasiswa");
        // bst.delete(3.57);
        // System.out.println("\nDaftar mahasiswa setelah penghapusan");
        // bst.traverseInOrder(bst.root);
    }
}
