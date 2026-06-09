package AsesmenTree;

public class binaryTreeArray {
    mahasiswa02[] data;
    int idxLast;

    public binaryTreeArray(){
        this.data = new mahasiswa02[10];
    }

    void populate(mahasiswa02 data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(data[idxStart]!= null){
                traverseInOrder(2*idxStart+1);
                data[idxStart].tmpl();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
}
