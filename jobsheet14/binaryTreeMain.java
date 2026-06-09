package jobsheet14;

public class binaryTreeMain {
    public static void main(String[] args) {
        binaryTree bst = new binaryTree();

        bst.add(new mahasiswa02("Ali", "A", "25192101", 3.57));
        bst.add(new mahasiswa02("Badar", "B", "25192102", 3.85));
        bst.add(new mahasiswa02("Candra", "C", "25192103", 3.21));
        bst.add(new mahasiswa02("Dewi", "D", "25192104", 3.54));

        System.out.println("\nDaftar Mahasiswa (Order Transversal)");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian Data Mahasiswa ");
        System.out.println("ipk: 3.54");
        String hasilCari = bst.fing(3.54)?"Ditemukan":"tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new mahasiswa02("Devi", "A", "25192105", 3.72));
        bst.add(new mahasiswa02("Ehsan", "D", "25192106", 3.37));
        bst.add(new mahasiswa02("Fizi", "B", "25192106", 3.46));
        System.out.println("\nDaftar setelah Penambahan");
        System.out.println("\nIn Order Traversal");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPre Order Traversal");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPost Order Traversal");
        bst.traversePostOrder(bst.root);
        
        System.out.println("\nPengapusan data Mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar mahasiswa setelah penghapusan");
        bst.traverseInOrder(bst.root);
    }
}
