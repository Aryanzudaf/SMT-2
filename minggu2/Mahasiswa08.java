package minggu2;

public class Mahasiswa08 {
    String nama;
    String nim;
    String kelas;
    double ipk;    

    void tampilkanInfotmasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk (double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKerja() {
        if (ipk < 0 || ipk > 4) {
            return "IPK tidak valid, harus antara 0.0 dan 4.0";
        } else if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
