package CaseMethod2;
import java.util.Scanner;

public class MainRoyalDelish06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DoubleLinkedListPembeli06 antrian = new DoubleLinkedListPembeli06();
        DoubleLinkedListPesanan06 daftarPesanan = new DoubleLinkedListPesanan06();

        int pilih;
        do {
            System.out.println("================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli  : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP         : ");
                    String hp = sc.nextLine();

                    Pembeli06 pembeli = new Pembeli06(nama, hp);
                    antrian.tambahAntrian(pembeli);
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    NodePembeli06 dipanggil = antrian.hapusAntrian();
                    if (dipanggil != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga         : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan06 pesanan = new Pesanan06(kode, namaPesanan, harga);

                        daftarPesanan.tambahPesanan(pesanan);

                        System.out.println( dipanggil.data.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                case 4:
                    daftarPesanan.tampilPesanan();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
            System.out.println();
        } while (pilih != 0);
    }
}