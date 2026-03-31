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
    }

}
