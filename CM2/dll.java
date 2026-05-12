package CM2;

public class dll {
    node head, tail;

    public dll(){
        this.head = null;
        this.tail = null;
    }

    public boolean isempty(){
        return head == null;
    }

    public void tambah(pembeli p){
        node New = new node(p);

        if (isempty()) {
            head = tail = New;
        }
        else{
            tail.next = New;
            New.prev = tail;
            tail = New;
        }
        System.out.println("Pembeli "+ p.nama +" masuk antrean");
    }

    public void pesan(pesanan ps){
        if(isempty()){
            System.out.println("Antrean kosong");
            return;
        }
        else{
            pembeli beli = head.data;
            if(head == tail){    
                head = tail= null;
            }
            else{
                head = head.next;
                head.prev = null;
            }
            System.out.println("pembeli "+ beli.nama+ " selesai");
        }
    }

    public void tampil(){
        if(isempty()){
            System.out.println("Antrian kosong");
        }
        else{
            node abc = head;
            System.out.println("Antrian saat ini:");
            while(abc !=null){
                
            }
        }
    }
}
