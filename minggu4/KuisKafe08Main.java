package minggu4;

import java.util.Scanner;

public class KuisKafe08Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KuisKafe08[] arrayOfKafe08 = new KuisKafe08[3];
        String nama;
        int jumlah;
        double harga;
 
        for (int i = 0; i < arrayOfKafe08.length; i++) {
            System.out.println("Masukkan pesanan ke- " + (i+1));
            System.out.print("Masukkan Nama makanan/minuman : ");
            nama = sc.nextLine();
            System.out.print("masukkan harga   : ");
            harga = sc.nextDouble();
            System.out.print(" masukkan jumlah pesanan: ");
            jumlah = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------------");
    
            arrayOfKafe08[i] = new KuisKafe08 (nama, jumlah, harga);
        }

        for (int i = 0; i < arrayOfKafe08.length; i++) {
            System.out.println("pesanan ke- " + (i+1));
            arrayOfKafe08[i].tampilkanMenu();
            arrayOfKafe08[i].totalharga();  
        }

    }   
}
