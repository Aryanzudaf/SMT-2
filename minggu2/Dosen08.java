package minggu2;

public class Dosen08 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunbergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Kode: " + idDosen);
        System.out.println("tahun bergabung: " + tahunbergabung);
        System.out.println("bidang keahlian: " + bidangKeahlian);
    }

    void setstatusAktif(boolean status){
        if (status == true) {
            System.out.println("status dosen : aktif");
        } else {
            System.out.println("status dosen : tidak aktif");
        }
        statusAktif = status;
        return;
    }

    void hitungMasaKerja(int thnSkrg){
        int totalMasakerja = thnSkrg - tahunbergabung;
        System.out.println( "masa kerja: " + totalMasakerja + " tahun");
        return;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        return;
    }

    public Dosen08(){
    }

    public Dosen08(String idDosen, String nama, boolean statusAktif, int tahunbergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunbergabung = tahunbergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

}
