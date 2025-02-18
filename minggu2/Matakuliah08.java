package minggu2;

public class Matakuliah08 {
    String nama;
    String kodeMK;
    int jumlahJam;
    int sks;

    void tampilinformasi() {
        System.out.println("nama matkul: " + nama);
        System.out.println("kode matkul: " + kodeMK);
        System.out.println("jumlah jam: " + jumlahJam);
        System.out.println("jumlah sks: " + sks);
    }

    void ubahSKS (int sksBaru) {
        sks = sksBaru;
        if (sksBaru > 0) {
            System.out.println("SKS telah berhasil diperbarui menjadi " + sksBaru);
        }
    }

    void tambahJam (int jam) {
        jumlahJam = jumlahJam + jam;
    }

    void kurangiJam (int jam) {
        jumlahJam = jumlahJam - jam;
        if (jumlahJam < 0) {
            System.out.println("jumlah jam sudah tidak bisa dikurangi");
        }
    }

    public Matakuliah08 (){
    }

    public Matakuliah08 (String kodMK, String nma, int sks, int jmlJam){
        kodeMK = kodMK;
        nama = nma;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
}
