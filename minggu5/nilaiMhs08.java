package minggu5;
public class nilaiMhs08 {
    static int cariMaxUts(int uts[], int l, int r){
        if (l==r) {
            return uts[l];
        }

        int mid = (l+r)/2;
        int lmax = cariMaxUts(uts, l, mid);
        int rmax = cariMaxUts(uts, mid+1, r);

        if (lmax > rmax) {
            return lmax;
        }else{
            return rmax;
        }
    }

    static int cariMinUts(int uts[], int l, int r){
        if (l==r) {
            return uts[l];
        }

        int mid = (l+r)/2;
        int lmin = cariMaxUts(uts, l, mid);
        int rmin = cariMaxUts(uts, mid+1, r);

        if (lmin < rmin) {
            return lmin;
        }else{
            return rmin;
        }
    }
    

    public static double rataUAS(int[] uas) {
        int total = 0;
        for (int i = 0; i < uas.length; i++) {
            total = total + uas[i];
        }
        return (double) total / uas.length;
    }
}

