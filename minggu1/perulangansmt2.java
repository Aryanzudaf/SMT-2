package minggu1;
import java.util.Scanner;
public class perulangansmt2 {
    public static void main(String[] args) {
        int n;
        String nim;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("masukkan NIM: ");
        nim = sc2.nextLine();
        System.out.print("n : ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else if (i == 5) {
                System.out.print("*");
            } else if (i == 9) {
                System.out.print("*");
            } else {
                System.out.print((i+1));
            }
        }
    }
}