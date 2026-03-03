public class MenuCafe06 {
    String kodeMenu;
    String namaMenu;
    double harga;
    int stok;

    public MenuCafe06(String kodeMenu, String namaMenu, double harga, int stok) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.stok = stok;
    }

    void tampilInfo() {
        System.out.println("Kode Menu : " + kodeMenu);
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Harga     : Rp " + harga);
        System.out.println("Stok      : " + stok);
        System.out.println("----------------------------");
    }

    void tambahStok(int jumlah) {
        stok += jumlah;
        System.out.println("Stok " + namaMenu + " berhasil ditambah " + jumlah);
    }

    void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            this.stok -= jumlah;
            System.out.println("Stok " + namaMenu + " berhasil dikurangi " + jumlah);
        } else {
            System.out.println("Stok " + namaMenu + " tidak mencukupi!");
        }
    }
}