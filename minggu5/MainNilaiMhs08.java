package minggu5;
import java.util.Scanner;
public class MainNilaiMhs08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.print("masukkan jumlah mahasiswa: ");
        int jumlah = input08.nextInt();

        int[] uts = new int[jumlah];
        int[] uas = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("masukkan nilai UTS mahasiswa ke-" +(i + 1)+ ": ");
            uts[i] = input08.nextInt();
            System.out.print("masukkan nilai UAS mahasiswa ke-" +(i + 1)+ ": ");
            uas[i] = input08.nextInt();
        }

        System.out.println("Hasil Perhitungan:");
        System.out.println("Nilai UTS tertinggi: " + nilaiMhs08.cariMaxUts(uts, 0, uts.length - 1));
        System.out.println("Nilai UTS terendah: " + nilaiMhs08.cariMinUts(uts, 0, uts.length - 1));
        System.out.println("Rata-rata nilai UAS: " + nilaiMhs08.rataUAS(uas));
    }
}
