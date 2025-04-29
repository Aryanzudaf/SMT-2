package minggu4;

public class KuisKafe08 {
    public String namaMenu;
    public int jumlah;
    public double harga;

    public KuisKafe08 (String namaMenu, int jumlah, Double harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.jumlah = jumlah;   

    }

    void tampilkanMenu () {
        System.out.println("nama makanan / minuman : " + this.namaMenu);
        System.out.println("harga : " + this.harga);
        System.out.println("jumlah pesanan : " + this.jumlah);
    }

    double totalharga () {
        System.out.println("jumlah harga per menu : "+jumlah * harga);
        System.out.println("-----------------------------------------");
        return harga;
    }
}
