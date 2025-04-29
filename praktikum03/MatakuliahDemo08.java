package praktikum03;
import java.util.Scanner;

public class MatakuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah08[] arrayOfMatakuliah08 = new Matakuliah08[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data matakuliah ke- " + (i+1));
            System.out.print("kode  : ");
            kode = sc.nextLine();
            System.out.print("Nama  : ");
            nama = sc.nextLine();
            System.out.print("Sks   : ");
            sks = sc.nextInt();
            System.out.print("jumlah jam : ");
            jumlahJam = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------------");

            arrayOfMatakuliah08[i] = new Matakuliah08(kode, nama, sks, jumlahJam);
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data matakuliah ke-" + (i+1));
                arrayOfMatakuliah08[i].cetakInfo();
                arrayOfMatakuliah08[i].tambahData();
        }
    }
}
