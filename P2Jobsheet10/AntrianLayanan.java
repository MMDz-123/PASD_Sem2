package P2Jobsheet10;

import CM1.mahasiswa;

public class AntrianLayanan {
    MahasiswaJS10[] data;
    int front, rear, size, max;

    public AntrianLayanan(int max){
        this.max = max;
        this.data = new MahasiswaJS10[max];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }    
    }

        public boolean isFull(){
        if(size==max){
            return true;
        }
        else{
            return false;
        }
    }
    public void lihatDepan(){
        if(!isEmpty()){
            System.out.println("mahasiswa terdepan: ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilDat();
        }
        else{
            System.out.println("Kosong");
        }
    }
    public void lhtSemua(){
        if(isEmpty()){
            System.out.println("Kosong");
        }
        else{
            int i = front;
            while(i !=rear){
                System.out.print(data[i] + " ");
                i = (i+1)%max;
            }
            System.out.print(data[i] + " ");
            System.out.println("JUmlah elemen: " + size);
        }
    }
    public void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue dikosongkan");
        }
        else{
            System.out.println("Queue kosong");
        }
    }
    public void tbhAntrian(MahasiswaJS10 Mhs){
        if(isFull()){
            System.out.println("Antrian Penuh");
            return;
        }
        else{
            rear = (rear+1)% max;
            data[rear] = Mhs;
            size++;
            System.out.println("Berhasih masuk ke dalam antrian");
        }
    }
    public MahasiswaJS10 layaniMahasiswa(){
        int dt = 0;
        if(isEmpty()){
            System.out.println("Antrian kosong");
            return null;
        }
        else{
            MahasiswaJS10 mhs = data[front];
            front = (front+1) % max;
            size--;
            return mhs;
        }
    }
    public int getJmlAntrian() {
        return size;
    }
}  
