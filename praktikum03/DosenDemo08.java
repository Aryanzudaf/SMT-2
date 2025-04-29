package praktikum03;
import java.util.Scanner;
public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen08[] arrayOfDosen08 = new Dosen08[3];
        String kode,nama;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data dosen ke- " + (i+1));
            System.out.print("kode  : ");
            kode = sc.nextLine();
            System.out.print("Nama  : ");
            nama = sc.nextLine();
            System.out.print("Jenis kelamin   : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("usia : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------------");

            arrayOfDosen08[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        System.out.println(" DATA DOSEN YANG SUDAH DI INPUT");
        int indeks = 1;
        for (Dosen08 dosen08 : arrayOfDosen08) {
            System.out.println("data dosen ke- " + indeks);
            System.out.println("kode : " + dosen08.kode);
            System.out.println("nama : " + dosen08.nama);
            System.out.print("jenis kelamin : ");

            if (dosen08.jenisKelamin = true) {
                System.out.println("laki-laki");
            } else {
                System.out.println("perempuan");
            }

            System.out.println("usia :" + dosen08.usia);
            System.out.println("--------------------------");
            
            indeks++;
        }
        
    }
}
