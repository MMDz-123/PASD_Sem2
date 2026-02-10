import java.util.Scanner;

public class Tugas2 {

    static void inputJadwal(String[][] jadwal, int n) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = scanner.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = scanner.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = scanner.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = scanner.nextLine();
        }
    }

    static void tampilkanSemua(String[][] jadwal, int n) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n","Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    static void tampilkanBerdasarkanHari(String[][] jadwal, int n, String hari) {
        System.out.println("\n=== JADWAL HARI " + hari.toUpperCase() + " ===");
        boolean nemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
                nemu = true;
            }
        }

        if (!nemu) {
            System.out.println("Tidak ada jadwal");
        }
    }

    static void tampilkanBerdasarkanMatkul(String[][] jadwal, int n, String matkul) {
        System.out.println("\n=== JADWAL MATA KULIAH: " + matkul.toUpperCase() + " ===");
        boolean nemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][2] + " | " +
                                   jadwal[i][3]);
                nemu = true;
            }
        }

        if (!nemu) {
            System.out.println("Mata kuliah tidak ada");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        int menus;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Cari jadwal berdasarkan hari");
            System.out.println("3. Cari jadwal berdasarkan mata kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menus = scanner.nextInt();
            scanner.nextLine();

            switch (menus) {
                case 1:
                    tampilkanSemua(jadwal, n);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hari = scanner.nextLine();
                    tampilkanBerdasarkanHari(jadwal, n, hari);
                    break;
                case 3:
                    System.out.print("Masukkan nama matkul: ");
                    String matkul = scanner.nextLine();
                    tampilkanBerdasarkanMatkul(jadwal, n, matkul);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("tidak valid!!!");
            }
        } while (menus != 0);
    }
}
