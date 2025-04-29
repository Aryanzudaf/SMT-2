package minggu5;
import java.util.Scanner;
public class MainPangkat08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen: ");
        int elemen = input08.nextInt();


        pangkat08[] png = new pangkat08[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input08.nextInt();
            System.out.print("masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input08.nextInt();
            png[i] = new pangkat08(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (pangkat08 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+":"+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (pangkat08 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+":"+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
