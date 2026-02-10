import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n, nim;
        nim= scanner.nextLong();
        n= nim%100;
        for (int i = 0; i < n; i++) {
            if(((i+1)%2==0)){
                if ((i+1)%3==0) {
                    System.out.print("#");
                    continue;
                } 
                if(i==10||1==15){
                    continue;
                }
                System.out.print(i+1);
            }
            if ((i+1)%3==0) {
                if(i==10||1==15){
                    continue;
                }                
                System.out.print("#");
                continue;
            }                          
            if(!((i+1)%2==0)) {
                if(i==10||1==15){
                    continue;
                }                  
                System.out.print("*");
                continue;
                }
    }
    scanner.close();
}
}
