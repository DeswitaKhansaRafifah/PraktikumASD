package KuisCM2;

public class Pesanan06 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan06(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public void tampilPesanan() {
        System.out.println(kodePesanan + "\t" + namaPesanan + "\t" + harga);
    }
}