package minggu9;
import java.util.Scanner;
public class MahasiswaDemo_8 {
    public static void main(String[] args) {
        StackTugasMahasiswa_8 stack = new StackTugasMahasiswa_8(5);
        Scanner scan8 = new Scanner(System.in);
        int pilih = 0;


        do{
            System.out.println("\nMENU:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("Pilih: ");
            pilih = scan8.nextInt();
            scan8.nextLine();

        switch (pilih) {
            case 1:
                System.out.print("Nama: ");
                String nama = scan8.nextLine();
                System.out.print("NIM: ");
                String nim = scan8.nextLine();
                System.out.print("Kelas: ");
                String kelas = scan8.nextLine();
                Mahasiswa_8 mhs = new Mahasiswa_8(nim,nama,kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;
            case 2:
                Mahasiswa_8 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.print("Masukkan nilai (0-100): ");
                    int nilai = scan8.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai tugas %s adalah %d\n ", dinilai.nama, nilai);
                }
                break;
            case 3:
                Mahasiswa_8 lihat = stack.peek();
                if (lihat != null) {
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;
            case 4:
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tKelas");
                stack.print();
                break;
            case 5:
                Mahasiswa_8 tugaspertama = stack.peekBottom();
                if (tugaspertama != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh " + tugaspertama.nama);
                }
                break;
            case 6:
                System.out.println("Jumlah tugas yang dikumpulkan adalah " + stack.hitungJml());
                break;
            default:
                System.out.println("Pilihan menu tidak valid");
                break;
        }
        } while (pilih >= 1 && pilih <= 6);
    }
}
