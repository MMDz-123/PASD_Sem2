import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n, m=0, nim;
        nim= scanner.nextLong();
        n= nim%100;
        if (n<10) {
            m=(n+10);
        }
        else if(n>10)
        {m=n;}
        for (int i = 0; i < m; i++) {
  
            if((i+1)==10||(i+1)==15){
                continue;
            }
            if(((i+1)%2==0)){
                if ((i+1)%3==0) {
                    System.out.print("#");
                    continue;
                } 
                System.out.print(i+1);
            }
            if ((i+1)%3==0) {
               
                System.out.print("#");
                continue;
            }                          
            if(!((i+1)%2==0)) {
                
                System.out.print("*");
                continue;
                }
    }
    scanner.close();
}
}
