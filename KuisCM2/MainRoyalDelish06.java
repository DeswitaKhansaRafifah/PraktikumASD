package KuisCM2;
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
            System.out.println("1. Tambah Antrian (Normal)");
            System.out.println("2. Tambah Antrian (Prioritas)");
            System.out.println("3. Cetak Antrian");
            System.out.println("4. Hapus Antrian dan Pesan");
            System.out.println("5. Laporan Pesanan");
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

                    Pembeli06 pembeli1 = new Pembeli06(nama, hp);
                    antrian.tambahAntrian(pembeli1);
                    break;
                case 2:
                    System.out.print("Nama Pembeli  : ");
                    String namaPrioritas = sc.nextLine();
                    System.out.print("No HP         : ");
                    String hpPrioritas = sc.nextLine();

                    Pembeli06 pembeli2 = new Pembeli06(namaPrioritas, hpPrioritas);
                    antrian.tambahAntrianPrioritas(pembeli2);
                    break;
                case 3:
                    antrian.cetakAntrian();
                    break;
                case 4:
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
                case 5:
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