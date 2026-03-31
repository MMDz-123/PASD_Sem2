package praktikum05;

public class SortingMain02 {
    public static void main(String[] args) {    
        int a[] = {20, 10, 2, 7, 12};
        Sorting02 dataurut1 = new Sorting02(a, a.length);
        
        System.out.println("data awal 1");
        dataurut1.tmpl();
        dataurut1.bubbleSort();
        System.out.println("data sudah diurutkan dengan BUBBLE SORT (ASCEND)");
        dataurut1.tmpl();
        
        int b[] = {30, 20, 2, 8, 14};
        Sorting02 dataurut2 = new Sorting02(b, b.length);

        System.out.println("data awal 2");
        dataurut2.tmpl();
        dataurut2.SelectionSort();
        System.out.println("data sudah diurutkan dengan BUBBLE SORT (ASCEND)");
        dataurut2.tmpl();

        int c[] = {40, 10, 4, 9, 3};
        Sorting02 dataurut3 = new Sorting02(c, c.length);

        System.out.println("data awal 2");
        dataurut3.tmpl();
        dataurut3.SelectionSort();
        System.out.println("data sudah diurutkan dengan BUBBLE SORT (ASCEND)");
        dataurut3.tmpl();        
    }

}
