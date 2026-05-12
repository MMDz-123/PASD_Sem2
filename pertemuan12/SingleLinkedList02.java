

public class SingleLinkedList02 {
    node02 head;
    node02 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()) {
            node02 tmp = head;
            System.out.println("isi linked list\t");
            while (tmp !=null) {
                tmp.data.tmpl();
                tmp = tmp.next;
            }
            System.out.println(" ");
        }
        else{
            System.out.println("linkedlist kosong");
        }
    }

    public void addFrst(mahasiswa02 input){
        node02 ndInp = new node02(input, null);
        if(!isEmpty()){
            head = ndInp;
            tail = ndInp;
        }
        else{
            ndInp.next = head;
            head = ndInp;
        }
    }

    public void addLast(mahasiswa02 input){
        node02 ndinp = new node02(input, null);
        if (isEmpty()) {
            head = ndinp;
            tail = ndinp;
        }
        else{
            tail.next = ndinp;
            tail = ndinp;
        }
    }
    
    public void insertAfter(String key, mahasiswa02 input){
        node02 ndinp = new node02(input, null);
        node02 temp = head;
        do{
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndinp.next = temp.next;
                temp.next = ndinp;
                if(ndinp.next == null){
                    tail = ndinp;
                }
                break;
            }
        }while(temp !=null);
    }

    public void insertAt(int idx, mahasiswa02 input){
        if(idx <0){
            System.out.println("indeks tidak valid");
        }
        else if(idx ==0){
            addFrst(input);
        }
        else{
            node02 temp = head;
            for (int i = 0; i < idx-1; i++) {
                    temp = temp.next;
            }
            temp.next = new node02(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    // Praktikum 2
    public void getData(int idx){
        node02 tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }
        tmp.data.tmpl();
    }

    public int idxof(String key){
        node02 tmp = head;
        int idx = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }
        if (tmp == null) {
            return -1;
        }
        else{
            return idx;
        }
    }

    public void remfirst(){
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
        }
        else if(head == null){
            head = tail = null;
        }
        else{
            head = head.next;
        }
    }

    public void remLast(){
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
        }
        else if(head == tail){
            head = tail = null;
        }
        else{
            node02 tmp = head;
            while (tmp.next !=tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key){
        if (isEmpty()) {
            System.out.println("LiniedList kosong");
        }
        else{
            node02 temp = head;
            while (temp !=null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.remfirst();
                }
                else if(temp.data.nama.equalsIgnoreCase(key)){
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;   
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void remAt(int idx){
        if (idx == 0) {
            remfirst();
        }
        else{
            node02 temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }

}
