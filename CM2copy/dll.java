package CM2copy;


public class dll {
    node head, tail;
    pesanan[] pesan = new pesanan[10];
    int jml = 0;

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
            else
            {
            node abc = head;
            System.out.println("Antrian saat ini:");
            System.out.println("Nama\t\tNomor HP");
            while(abc !=null){
                System.out.print(abc.data.nama + "\t" + abc.data.noHp);
                if(abc.next !=null){
                    System.out.print("\n");
                }
                abc = abc.next;
            }
        }
    }

    public void tplPesan(){
        if (isempty()) {
            System.out.println("Tidak ada pesanan");
            return;
        }
        else{
            pesanan[] urut = new pesanan[jml];
            for (int i = 0; i < jml; i++) {
                urut[i] = pesan[i];
            }

            for (int i = 0; i < jml-1; i++) {
                for (int j = 0; j < jml-1; j++) {
                    if(urut[j].nama.compareToIgnoreCase(urut[j+1].nama)>0){
                        pesanan tmp = urut[j];
                        urut[j] = urut[j+1];
                        urut[j+1] = tmp;
                    }
                }
            }
            System.out.println("Pesanan");
            System.out.printf("%-15s | %-10s | %-10s\n", "Nama Menu", "Harga", "Kode");
            System.out.println("=========================================");
            for (int i = 0; i < jml; i++) {
                System.out.printf("%-15s|%-8d|%-10d\n", urut[i].nama, urut[i].kode, urut[i].hrg);
            }
        }
    }
    
        public void prio(int idx, pembeli dat){
        node current = head;
        int i=0;
        do{ 
            current = current.next;
            if (current == null && idx == i) {
                return;
            }
            node newNode = new node(dat);
            
            if (current ==tail) {
                newNode.prev = current;
                current.next = newNode;
                tail = newNode;
                break;
            }
            else{
                newNode.prev = current;
                current.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
            }
            System.out.println("Data berhasil disimpan");
            i++;
        }while (idx !=0);
        }
    }


