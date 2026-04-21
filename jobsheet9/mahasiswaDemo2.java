package jobsheet9;

import java.util.Scanner;


public class mahasiswaDemo2 {
    public static void main(String[] args) {
        
        StackTugasMahasiswa2 stack = new StackTugasMahasiswa2(5);
        Scanner scanner = new Scanner(System.in);
        int menu;
        
        do{
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratass");
            System.out.println("4. Lihat daftar tugasa");
            System.out.println("5. Lihat tugas terbawah");
            System.out.print("pilihan:");
            menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (menu) {
            case 1:
                System.out.print("Nama : ");
                String nama = scanner.nextLine();
                System.out.print("Kelas : ");
                String nim = scanner.nextLine();
                System.out.print("NIM : ");
                String kelas = scanner.nextLine();
                mahasiswa2 mhs = new mahasiswa2(nama, nim, kelas);
                stack.push(mhs);
                System.out.println("Tugas "+ nama + " Berhasil dikumpulkan");
                break;
                
                case 2:
                    mahasiswa2 dinilai = stack.pop();
                    if(dinilai !=null){
                        System.out.println("menilai tygas dari: " + dinilai.nama);
                        System.out.print("Masukkan nilai 1-100: ");
                        int nilai = scanner.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("nilai tugas %s dinilai %d\n", dinilai.nama, nilai);
                    }
                    break;
                    
                case 3:
                    mahasiswa2 Lihat = stack.peek();
                    if (Lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh: " + Lihat.nama);
                    }
                    break;
                        
                case 4:
                    System.out.println("Daftar tugas");
                    System.out.println("Nama\tNIM\tkels");
                    stack.print();
                    break;

                case 5:
                    mahasiswa2 tahiL = stack.peekBelow();
                    if (tahiL != null) {
                        System.out.println("Tugas pertama: " + tahiL.nama);
                    }

                            
                default:
                System.out.println("Pilihan tidak valid");
                }
            }while(menu >=1 && menu <=6);
    }     
}