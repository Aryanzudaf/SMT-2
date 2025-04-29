package praktikum5;
import java.util.Scanner;
public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner input8 = new Scanner(System.in);
        System.out.println("masukkan jumlah mahasiswa yg akan diinput");
        int jumlah = input8.nextInt();
        input8.nextLine();
        int left;
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData mahasiswa ke-" +(i + 1));
            System.out.print("NIM   : ");
            String nim = input8.nextLine();
            System.out.print("Nama  : ");
            String nama = input8.nextLine();
            System.out.print("Kelas : ");
            String kelas = input8.nextLine();
            System.out.print("IPK   : ");
            String ip = input8.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------");
 
            list.tambah(new Mahasiswa08(nim, nama, kelas, ipk));
        }
            list.tampil();
            // //melakukan pencarian sequential
            // System.out.println("-------------------");
            // System.out.println("pencarian data");
            // System.out.println("-------------------");
            // System.out.println("masukkan ipk mahasiswa yg dicari: ");
            // System.out.print("IPK");
            // String cariStr = input8.nextLine();
            // double cari = Double.parseDouble(cariStr);
            
            // System.out.println("menggunakn sequential searching");
            // double posisi = list.sequentialSearching(cari);
            // int pss = (int)posisi;
            // list.tampilPosisi(cari, pss);
            // list.tampilDataSearch(cari, pss);

            //melakukan pencarian data binary
            System.out.println("-------------------------------------------");
            System.out.println("Pencarian Data");
            System.out.println("-------------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang ingin dicari: ");
            System.out.println("IPK");
            String cariStr = input8.nextLine();
            double cari = Double.parseDouble(cariStr);
            System.out.println("--------------------------------");
            System.out.println("menggunakan binary search");
            System.out.println("--------------------------------");
            double posisi2 = list.findBinarySearch(cari, left=0, jumlah-1);
            int pss2= (int)posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);
    }
}
