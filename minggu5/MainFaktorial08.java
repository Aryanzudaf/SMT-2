package minggu5;
import java.util.Scanner;
public class MainFaktorial08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = input08.nextInt();

        faktorial08 fk = new faktorial08();
        System.out.println("nilai faktorial " + nilai +
         " menggunakan BF:" +fk.faktorialBF(nilai));
        System.out.println("nilai faktorial " + nilai +
         " menggunakan DC:" +fk.faktorialDC(nilai));
        System.out.println("nilai faktorial " + nilai +
         " menggunakan BF_While :" +fk.faktorialBF_While(nilai));
    }
}
