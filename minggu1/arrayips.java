package minggu1;
import java.util.Scanner;
public class arrayips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matkul = {
            "Pancasila", "Konsep teknologi informasi", "Critical thinking dan problem solving",
            "Matematika dasar", "Bahasa Inggris", "Dasar pemrograman",
            "Praktikum dasar pemrograman", "Keselamatan dan kesehatan kerja"
        };
        
        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] bobotNilai = new double[matkul.length];
       
        System.out.println("Program Menghitung IP Semester");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            nilaiHuruf[i] = konversiHuruf(nilaiAngka[i]);
            bobotNilai[i] = bobotDariHuruf(nilaiHuruf[i]);
        }

        System.out.println("\nHasil Konversi Nilai");
        System.out.printf("%-40s %-12s %-12s %-12s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f%n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
      
        double totalBobot = 0;
        for (double bobot : bobotNilai) {
            totalBobot += bobot;
        }
        double ipSemester = totalBobot / matkul.length;
        System.out.printf("\nIP : %.2f%n", ipSemester);
    }

    public static String konversiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "A-";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "C+";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }

        public static double bobotDariHuruf(String huruf) {
        switch (huruf) {
            case "A": return 4.00;
            case "A-": return 3.75;
            case "B+": return 3.50;
            case "B": return 3.00;
            case "C+": return 2.50;
            case "C": return 2.00;
            case "D": return 1.00;
            case "E": return 0.00;
            default: return 0.00;
        }
    }
}
