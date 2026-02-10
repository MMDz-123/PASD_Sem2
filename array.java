import java.util.Scanner;

public class array {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nil[][]= new double[4][8];
        String MK[][]= new String[2][8];
        int SKS, nSet;
        float IPS;

        for (int i = 0; i < MK[1].length; i++) {
            System.out.print("Masukkan nama matkul ke-"+ (i+1)+ " ");
            MK[0][i]= scanner.next();
            scanner.nextLine();
            System.out.print("masukkan milai matkul "+MK[0][i]+ ": ");
            nil[0][i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("masukkan jumlah SKS: ");
            nil[2][i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("==========================");
        }
        System.out.println("=====================================");
        for (int i = 0; i < MK[1].length; i++) {
            if (nil[0][i]<=100 && nil[0][i]>80) {
                MK[1][i]="A";
                nil[3][i]= 4;
            }
            else if (nil[0][i]<=80 && nil[0][i]>73){
                MK[1][i]="B+";
                nil[3][i]= 3.5;
            }
            else if (nil[0][i]<=73 && nil[0][i]>65){
                MK[1][i]="B";
                nil[3][i] = 3;
            }
            else if (nil[0][i]<=65 && nil[0][i]>60){
                MK[1][i]="C+";
                nil[3][i] = 2.5;
            }
            else if (nil[0][i]<=60 && nil[0][i]>50){
                MK[1][i]="C";
                nil[3][i] = 2;
            }
            else if (nil[0][i]<=50 && nil[0][i]>39){
                MK[1][i]="D";
                nil[3][i] = 1;
            }
            else if (nil[0][i]<=39 && nil[0][i]>0){
                MK[1][i]="E";
                nil[3][i] = 0;
            }
        }

       nSet = ((int)nil[2][0]*(int)nil[3][0])+
              ((int)nil[2][1]*(int)nil[3][1])+
              ((int)nil[2][2]*(int)nil[3][2])+
              ((int)nil[2][3]*(int)nil[3][3])+
              ((int)nil[2][4]*(int)nil[3][4])+
              ((int)nil[2][5]*(int)nil[3][5])+
              ((int)nil[2][6]*(int)nil[3][6])+
              ((int)nil[2][7]*(int)nil[3][7]);
        SKS = (int)nil[2][0]+(int)nil[2][1]+(int)nil[2][2]+(int)nil[2][3]+(int)nil[2][4]+(int)nil[2][5]+(int)nil[2][6]+(int)nil[2][7];
        IPS = nSet/SKS;

        for (int i = 0; i < MK[1].length; i++) {
            System.out.println("Nilai Matkul "+ MK[0][i]+ ": \t\t"+(int)nil[0][i]+ "\t"+ MK[1][i]+ "\t" + (int)nil[2][i] + "\t" + nil[3][i]);
        }
        System.out.println("=========================");
        System.out.println("IP= "+IPS);
    }
}