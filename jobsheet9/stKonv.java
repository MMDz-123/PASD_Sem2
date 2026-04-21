package jobsheet9;

public class stKonv {
    int[] stBin;
    int size, top;

    public stKonv(){
        this.size = 32;
        stBin = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public void push(int dat){
        if (isFull()){
            System.out.println("Stack penuh");
        }
        else{
            top++;
            stBin[top] = dat;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack kosong");
            return -1;
        }
        else{
            int dat = stBin[top];
            top--;
            return dat;
        }
    }
}
