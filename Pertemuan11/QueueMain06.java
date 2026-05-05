package Pertemuan11;
import java.util.Scanner;

public class QueueMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList06 q = new QueueLinkedList06();

        int pilih;
        do {
            System.out.println("\n=== MENU ANTRIAN MAHASISWA ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat Antrian (Terdepan & Terakhir)");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    DataMahasiswa06 mhs = new DataMahasiswa06(nim, nama, kelas, ipk);
                    q.enqueue(mhs);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.print();
                    break;

                case 4:
                    System.out.println("Antrian Terdepan:");
                    q.peekFront();
                    System.out.println("Antrian Terakhir:");
                    q.peekRear();
                    break;

                case 5:
                    System.out.println("Jumlah antrian: " + q.getSize());
                    break;

                case 6:
                    q.clear();
                    break;
                
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        } while (pilih != 0);
    }
}