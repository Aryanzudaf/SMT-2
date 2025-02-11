package minggu1;

public class tokoBunga {
        static final int HARGA_AGLONEMA = 75000;
        static final int HARGA_KELADI = 50000;
        static final int HARGA_ALOCASIA = 60000;
        static final int HARGA_MAWAR = 10000;
    
        public static void main(String[] args) {
            int[][] stokBunga = {
                {10,5,15,7},
                {6,11,9,12},  
                {2,10,10,5},  
                {5,7,12,9}    
            };
    
            String[] cabang = {"royalgarden 1", "royalgarden 2", "royalgarden 3", "royalgarden 4"};
            tampilkanPendapatan(stokBunga, cabang);
            tampilkanTotalStok(stokBunga);
        }
    
        public static void tampilkanPendapatan(int[][] stok, String[] cabang) {
            System.out.println("Pendapatan setiap cabang jika semua bunga terjual:");
    
            for (int i = 0; i < stok.length; i++) {
                int pendapatan = (stok[i][0] * HARGA_AGLONEMA) + (stok[i][1] * HARGA_KELADI) +
                                 (stok[i][2] * HARGA_ALOCASIA) + (stok[i][3] * HARGA_MAWAR);

                System.out.println(cabang[i] + ": Rp " + pendapatan);
            }
        }

        public static void tampilkanTotalStok(int[][] stok) {
            int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;
    
            for (int i = 0; i < stok.length; i++) {
                totalAglonema += stok[i][0];
                totalKeladi += stok[i][1];
                totalAlocasia += stok[i][2];
                totalMawar += stok[i][3];
            }
    
            System.out.println("\nTotal stok bunga di seluruh cabang:");
            System.out.println("Aglonema  : " + totalAglonema);
            System.out.println("Keladi    : " + totalKeladi);
            System.out.println("Alocasia  : " + totalAlocasia);
            System.out.println("Mawar     : " + totalMawar);
        }
    }