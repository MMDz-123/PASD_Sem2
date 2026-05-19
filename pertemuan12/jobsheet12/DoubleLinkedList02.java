package jobsheet12;

import CM2.node;

public class DoubleLinkedList02 {
    node02 head, tail;

    public DoubleLinkedList02(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(mahasiswa02 dat){
        node02 newNode02 = new node02(dat);
        if (isEmpty()) {
            head = tail = newNode02;
        }
        else{
            tail.next = newNode02;
            newNode02.prev = tail;
            tail = newNode02;
        }
    }

    public void addLast(mahasiswa02 dat){
        node newNode02 = new node(dat);
        if(isEmpty()){
            head = tail = newNode02;
        }
        else{
            tail.next = newNode02;
            newNode02.prev = tail;
            tail = newNode02;
        }
    }

    public void insertAfter(String keyNim, mahasiswa02 dat){
        node02 current = head;
            current = current.next;
            if (current == null) {
                System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
                return;
            }
            node newNode = new node(dat);
            
            if (current ==tail) {
                newNode.prev = current;
                current.next = newNode;
                tail = newNode;
            }
            else{
                newNode.prev = current;
                current.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
            }
            System.out.println("Data berhasil disimpan");
        }
    }
        
    public void print(){
        if(isEmpty()){
            System.out.println("List kosong");
        }
        node current = head;
        while (current != null) {
            current.data.tmpl();
            current = current.next;
        }
    }

    public void printRev(){
        if(isEmpty()){
            System.out.println("List kosong");
        }
        else{
            node current = tail;
        while (current != null) {
            current.data.tmpl();
            current = current.prev;
            }
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
            node tmp = head;
            while (tmp.next !=tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
}
