import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char PLAT;
        int cnt=0;
        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char KOTA[][] = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}};
        System.out.print("Plat: ");
        PLAT = scanner.nextLine().charAt(0);
        for (int i = 0; i < KODE.length; i++) {
            if (PLAT==KODE[i]) {
                break;
            }
            ++cnt;
        }
        for (int i = 0; i < KOTA[cnt].length; i++) {
            System.out.print(KOTA[cnt][i]);
        }
    }
}
