package praktikum03;

public class Dosen08 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen08 (String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfoDosen() {
        System.out.println("Nama: " + nama + ", Jenis Kelamin: " + jenisKelamin + ", Usia: " + usia);
        
    }
}
