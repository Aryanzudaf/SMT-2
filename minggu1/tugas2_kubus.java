package minggu1;
import java.util.Scanner;
public class tugas2_kubus {

    public static void tampilkanMenu() {
        System.out.println("\nPENGHITUNG KUBUS");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();

            if (pilihan == 4) {
                System.out.println("Terima kasih..");
                break;
            }

            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = scanner.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus (Total Panjang Rusuk): " + hitungKeliling(sisi));
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
