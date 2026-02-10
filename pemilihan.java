import java.util.Scanner;

public class pemilihan {

public static void out(int[]array){
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]+"\t");
    }
}

public static int rata(int[]val){
    int val1, val2, val3, val4, tot;
    val1 = (int) (val[0]*(0.2));
    val2 = (int) (val[1]*(0.2));
    val3 = (int) (val[2]*(0.3));
    val4 = (int) (val[3]*(0.3));
    tot  = (int) (val1+val2+val3+val4);
    return tot;
}

public static String nHrf(int val){
    String nil = null;

    if (val<=100 && val>80) {
        nil="A";
    }
    else if (val<=80 && val>73){
        nil="B+";
    }
    else if (val<=73 && val>65){
        nil="B";
    }
    else if (val<=65 && val>60){
        nil="C+";
    }
    else if (val<=60 && val>50){
        nil="C";
    }
    else if (val<=50 && val>39){
        nil="D";
    }
    else if (val<=39 && val>0){
        nil="E";
    }
    System.out.println("Nilai huruf: "+nil);
    return nil;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nil[] = new int[4];
    int tot;
    while (true) {
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas: ");
        nil[0] = scanner.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        nil[1] = scanner.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nil[2] = scanner.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nil[3] = scanner.nextInt();
        System.out.println("==============================");
        
        if (nil[0]<0||nil[1]<0||nil[2]<0||nil[3]<0) {
            System.out.println("=================");
            System.out.println("nilai harus bernilai positif");
            System.out.println("=================");
            continue;
        }

        else if(nil[0]>100||nil[1]>100||nil[2]>100||nil[3]>100){
            System.out.println("=================");
            System.out.println("nilai harus kurang dari atau sama dengan 100");
            System.out.println("=================");
            continue;
        }

        else{
            break;
        }
    }

    out(nil);
    System.out.println();
    tot= rata(nil);
    System.out.println();
    nHrf(tot);
    System.out.println("Nilai rata-rata: ");
    System.out.println(tot);

    if (nHrf(tot).equalsIgnoreCase("A")||
        nHrf(tot).equalsIgnoreCase("B+")||
        nHrf(tot).equalsIgnoreCase("B")||
        nHrf(tot).equalsIgnoreCase("C+")||
        nHrf(tot).equalsIgnoreCase("C")) {
        System.out.println("============================");
        System.out.println("Selamat anda lulus");
        System.out.println("============================");
    }
    else{
        System.out.println("============================");
        System.out.println("Anda dinyatakan tidak lulus");
        System.out.println("============================");
    }
    scanner.close();
    }
}