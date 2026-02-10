public class fungsi {

    public static int hitung(int pnj[]){
        int agl = 75000;
        int kld = 50000;
        int alo = 60000;
        int mwr = 10000;
        int jml = 0;
        int jmlA=0, jmlK=0, jmlAl=0, jmlM=0;
        for (int i = 0; i < pnj.length; i++) {
            jmlA = pnj[i]*agl;
            jmlK = pnj[i]*kld;
            jmlAl = pnj[i]*alo;
            jmlM = pnj[i]*mwr;
        }
        jml = jmlA+jmlAl+jmlK+jmlM;
        return jml;
    }
    public static void main(String[] args) {
        String stats = null;
        int tot = 0;
        int pnj [][] = {{10, 5, 15, 7},
                        {6, 11, 9, 12},
                        {2, 10, 10, 5},
                        {2, 7, 12, 6}};

        for (int i = 0; i < 4; i++) {
            tot = hitung(pnj[i]);
            if (tot>1500000) {
                stats = "Sangat baik";
            }
            else{
                stats = "perlu evaluasi";
            }
            System.out.println("Penjualan cabang ke-"+(i+1)+": "+tot+", "+stats);
        }
    }
}
