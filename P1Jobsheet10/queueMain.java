package P1Jobsheet10;

import java.util.Scanner;

import jobsheet9.stKonv;

    public class queueMain {
        public static void menu(){
            System.out.println("Menu");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("====================================");
        }
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan kapasitas Queue:");
            
            int n = scanner.nextInt();
            queue q = new queue(n);
            do {
                menu();
                int plh = scanner.nextInt();
                switch (plh) {
                    case 1:
                        System.out.print("Masukkan data baru: ");
                        int dat = scanner.nextInt();
                        q.enqueue(dat);
                        break;
                    
                    case 2:
                        int datout = q.dequeue();
                        if(datout !=0){
                            System.out.println("Data keluar:"  + datout);
                            break;
                        }

                    case 3:
                        q.print();
                        System.out.println("==============");
                    break;

                    case 4:
                        q.peek();
                        System.out.println("==============");
                    break;
                    case 5:
                        q.clear();
                        System.out.println("==============");
                    break;
                
                    default:
                        break;
                }
            } while (n>=1 && n <=5);
        }
}
