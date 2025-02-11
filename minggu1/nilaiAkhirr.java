package minggu1;
import java.util.Scanner;
public class nilaiAkhirr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalNilai=0;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==================");
        System.out.println("masukkan nilai tugas: ");
        double tugas = sc.nextInt();
        System.out.println("masukkan nilai kuis: ");
        double kuis = sc.nextInt();
        System.out.println("masukkan nilai UTS: ");
        double uts = sc.nextInt();
        System.out.println("masukkan nilai UAS: ");
        double uas = sc.nextInt();

        totalNilai = (tugas*0.2) + (kuis*0.2) + (uts*0.3) + (uas*0.4);

        System.out.println("==================");
        System.out.println("==================");
        System.out.println("nilai akhir :" + totalNilai);

        if (totalNilai < 0 || totalNilai > 100) {
            System.out.println("masukkan nilai yang benar");
        } else if (totalNilai >= 80 && totalNilai <= 100) {
            System.out.println("nilai huruf : A");
        } else if (totalNilai > 73 && totalNilai <= 80) {
            System.out.println("nilai huruf : B+");
        } else if (totalNilai > 65 && totalNilai <= 73) {
            System.out.println("nilai huruf : B");
        } else if (totalNilai > 60 && totalNilai <= 65) {
            System.out.println("nilai huruf : C+");
        } else if (totalNilai > 50 && totalNilai <= 60) {
            System.out.println("nilai huruf : C");
        } else if (totalNilai > 39 && totalNilai <=50) {
            System.out.println("nilai huruf : D");
        } else if (totalNilai <= 39) {
            System.out.println("nilai huruf : D");
        }

        System.out.println("==================");
        System.out.println("==================");

        if (totalNilai > 50) {
            System.out.println("SELAMAT, ANDA LULUS");
        } else if (totalNilai < 50) {
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}
