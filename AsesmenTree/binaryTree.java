package AsesmenTree;


public class binaryTree {
    node02 root;
    int cnt = 0;

    public binaryTree(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(mahasiswa02 mhs){
        node02 newNode = new node02(mhs);
        if(isEmpty()){
            root = newNode;
        }
        else{
            node02 current = root;
            node02 parent = null;

            while (true) {
                parent = current;
                if(mhs.ipk < current.data.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean fing(double ipk){
        boolean res = false;
        node02 cur = root;

        while (cur!= null) {
            if (cur.data.ipk == ipk) {
                res = true;
                break;
            }
            else if(ipk > cur.data.ipk){
                cur = cur.right;
            }
            else{
                cur = cur.left;
            }
        }
        return res;
    }

    public void traversePreOrder(node02 node){
        if(node != null){
            node.data.tmpl();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traverseInOrder(node02 node){
        if(node != null){
            traversePreOrder(node.left);
            node.data.tmpl();   
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(node02 node){
        if(node != null){
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            node.data.tmpl();
        }
    }

    public void delete(double ipk){
        if(isEmpty()){
            System.out.println("Tree kosong");
        }
        else{
            node02 parent = root;
            node02 current = root;
            boolean isLeft = false;
            while(current != null){
                if(current.data.ipk == ipk){
                    break;
                }
                else if(ipk < current.data.ipk){
                    parent = current;
                    current = current.left;
                    isLeft = true;
                }
                else if(ipk > current.data.ipk){
                    parent = current;
                    current = current.right;
                    isLeft = false;
                }

                if(current == null){
                    System.out.println("Data tidak ditemukan");
                }
                else{
                    if(current.left ==  null && current.right == null){
                        if(current == root){
                            root = null;
                        }
                        else{
                            if(isLeft){
                                parent.left = null;
                            }
                            else{
                                parent.right = null;
                            }
                        }
                    }
                    else if (current.left == null) {
                        if(current == root){
                            root = current.right;   
                        }
                        else{
                            if(isLeft){
                                parent.left = current.right;
                            }
                            else{
                                parent.right = current.right;
                            }
                        }
                    }
                    else if(current.right == null){
                        node02 successor = getSuccessor(current);
                        System.out.println("Jika dua anak, current = ");
                        successor.data.tmpl();
                        if(current == root){
                            root = current.left;
                        }
                        else{
                            if(isLeft){
                                parent.left = successor;
                            }
                            else{
                                parent.right = successor;
                            }
                        }
                        successor.left = current.left;
                    }
                }
            }
        }
    }

    node02 getSuccessor(node02 del){
        node02 successor = del.right;
        node02 sucParent = del;
        while (successor.left != null) {
            sucParent = successor;
            successor = successor.left;
        } 
        if(successor != del.right){
            sucParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public node02 findName(String nama){
        return search(root, nama);
    }
    public node02 search(node02 cur, String nama){
        if(cur == null||cur.data.nama.equalsIgnoreCase(nama)){
            return cur;
        }
        node02 fnd = search(cur.left, nama);
        if(fnd == null){
            fnd = search(cur.right, nama);
        }
        return fnd;
    }

    public void srcKls(String kls){
        abc(root, kls);
    }

    public void abc(node02 cur, String kls){
        if(cur ==null){
            return;
        }
        abc(cur.left, kls);
        if(cur.data.kelas.equalsIgnoreCase(kls)){
            cur.data.tmpl();
        }
        abc(cur.right, kls);
    }

    public void top3(){
        cnt = 0;
        dis(root);
    }

    public void dis(node02 cur){
        if(cur == null|| cnt >=3){
            return;
        }
        dis(cur.right);
        if(cnt <3){
            System.out.print((cnt+1) + " . ");
            cur.data.tmpl();
            cnt++;
        }
        dis(cur.left);
    }
    
}

