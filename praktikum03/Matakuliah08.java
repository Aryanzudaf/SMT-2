package praktikum03;
import java.util.Scanner;
public class Matakuliah08 {
    Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah08(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        for (int i = 0; i < 3; i++) {
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
        }
    }

    void cetakInfo() {
        System.out.println("kode : " + this.kode);
        System.out.println("nama : " + this.nama);
        System.out.println("jumlah jam : " + this.jumlahJam);
    }
}
