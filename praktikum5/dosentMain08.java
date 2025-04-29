package praktikum5;
import java.util.Scanner;
public class dosentMain08 {
   public static void main(String[] args) {
    Scanner sc08 = new Scanner(System.in);
        dataDosent08 daftarDosen08 = new dataDosent08();
        int pilihMenu;
        int left=0,right=-1;
        String namaCari="";
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Menambah Data Dosen");
            System.out.println("2. Menampilkan Data Dosen");
            System.out.println("3. Sorting Usia ASC (termuda ke tertua)");
            System.out.println("4. Sorting Usia DSC (tertua ke termuda)");
            System.out.println("5. cari dosen dg nama");
            System.out.println("6. cari dosen dg usia");
            System.out.println("7. keluar");
            System.out.println("Pilih menu: ");
            pilihMenu = sc08.nextInt();
            sc08.nextLine();

            switch (pilihMenu) {
                case 1:
                    if (daftarDosen08.idx < 10) {
                        System.out.print("Kode: ");
                        String kode = sc08.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc08.nextLine();
                        System.out.print("Jenis Kelamin (true=laki-laki, false=perempuan): ");
                        boolean jenKel = sc08.nextBoolean();
                        System.out.print("Usia: ");
                        int usia = sc08.nextInt();

                        dosent08 dsn = new dosent08(kode, nama, jenKel, usia);
                        daftarDosen08.tambah(dsn);
                        System.out.println("Data dosen berhasil ditambahkan");
                    } else {
                        System.out.println("Data dosen sudah penuh");
                    }
                    break;
                case 2:
                    System.out.println("\nData Dosen:");
                    daftarDosen08.tampil();
                    break;
                case 3:
                    daftarDosen08.SortingBubbleASC();
                    break;
                case 4:
                    daftarDosen08.SortingSelecDSC();
                    break;
                case 5:
                    System.out.print("Masukkan nama dosen yang ingin dicari: ");
                    String cariNama = sc08.nextLine();
                    daftarDosen08.pencarianDataSequential08(cariNama);
                    break;
                case 6:
                    System.out.print("Masukkan usia dosen yang ingin dicari: ");
                    int cariUsia = sc08.nextInt();
                    daftarDosen08.PencarianDataBinary08(cariUsia);
                    break;
                case 7:
                    System.out.println("Terimakasih.");
                    break;
                default:
                System.out.println(" ");
                break;       
            }
        } while (pilihMenu != 7);
    } 
}


