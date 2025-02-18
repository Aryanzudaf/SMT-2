package minggu2;

public class DosenMain08 {
    public static void main(String[] args) {
        Dosen08 dosen1 = new Dosen08();
        dosen1.idDosen = "AA";
        dosen1.nama = "Ali Ahmad";
        dosen1.statusAktif = true;
        dosen1.tahunbergabung = 2020;
        dosen1.bidangKeahlian = "Bahasa Inggris";

        dosen1.tampilInformasi();
        dosen1.setstatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("bahasa arab");

        Dosen08 dosen2 = new Dosen08("BB","Bella Billa",true,2021,"matematika");
        dosen2.tampilInformasi();
    }
}
