package praktikum5;
public class dosent08 {
    String kode, nama;
    boolean jenKel;
    int usia;

    public dosent08(String kd, String name, boolean jk, int age){
        this.kode = kd;
        this.nama = name;
        this.jenKel = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenKel ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("-----------------------");
    }
}
