package Kuis;

import java.util.Scanner;

public class kuisA2 {

    public String item;
    public int hrg, jml, tot;

    public void input(Scanner scanner){
        String abc, def;
        System.out.println("=============================");
        System.out.print("Masukkan nama item: ");
        item = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Jumlah: ");
        def = scanner.nextLine();
        scanner.nextLine();
        jml = Integer.parseInt(def);
        System.out.print("Harga:");
        abc = scanner.nextLine();
        scanner.nextLine();
        hrg = Integer.parseInt(abc);
        tot = jml*hrg;
        System.out.println("=============================");

    } 

    public void tampil(){
        System.out.println("Item: "+item);
        System.out.println("Jumlah: "+jml);
        System.out.println("Harga: "+hrg);
        System.out.println("Total: " + tot);
        System.out.println("=============================");

    }
}

