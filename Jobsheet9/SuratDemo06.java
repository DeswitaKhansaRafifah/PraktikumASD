package Jobsheet9;
import java.util.Scanner;

public class SuratDemo06 {
    public static void main(String[] args) {
        StackSurat06 stack = new StackSurat06(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();

                    Surat06 s = new Surat06(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan!");
                    break;

                case 2:
                    Surat06 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat06 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat dalam stack");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 4);
    }
}