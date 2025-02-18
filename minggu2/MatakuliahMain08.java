package minggu2;

public class MatakuliahMain08 {
    public static void main(String[] args) {
        Matakuliah08 matkul = new Matakuliah08();
        matkul.nama = "Bahasa Inggris";
        matkul.kodeMK = "BING";
        matkul.jumlahJam = 4;
        matkul.sks = 2;

        matkul.tampilinformasi();
        matkul.tambahJam(2);
        matkul.ubahSKS(3);
        matkul.kurangiJam(10);
        matkul.tampilinformasi();

        Matakuliah08 matkul2 = new Matakuliah08("BING","Bahasa Inggris",4,8);
        matkul2.tampilinformasi();
    }
}
