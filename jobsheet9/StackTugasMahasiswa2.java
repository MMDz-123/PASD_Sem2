package jobsheet9;

public class StackTugasMahasiswa2 {
    mahasiswa2[] stack;
    int top, size;

    public StackTugasMahasiswa2(int size){
        this.size = size;
        stack = new mahasiswa2[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size-1) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }
    }

    public void push(mahasiswa2 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }
    }

    public mahasiswa2 pop(){
        if (!isEmpty()) {
            mahasiswa2 m = stack[top];
            top--;
            return m;
        }
        else{
            System.out.println("Stack kosong");
            return null;
        }
    }

    public mahasiswa2 peek(){
        if (!isEmpty()) {
            return stack[top];
        }
        else{
            System.out.println("Stack kosong");
            return null;
        }
    }

    public mahasiswa2 peekBelow(){
        if (!isEmpty()) {
            return stack[0];
        }
        else{
            System.out.println("Stack kosong");
            return null;
        }
    }
    

    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].kelas + "\t" + stack[i].nim + "\t");
        }
    }

    public int jml(){
        int jumlah = top+1;
        return jumlah;
    }

}
