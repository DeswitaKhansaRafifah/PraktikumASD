package CaseMethod;
import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa06[] mhs = {
            new Mahasiswa06("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa06("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa06("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku06[] buku = {
            new Buku06("B001", "Algoritma", 2020),
            new Buku06("B002", "Basis Data", 2019),
            new Buku06("B003", "Pemrograman", 2021),
            new Buku06("B004", "Fisika", 2024)
        };

        Peminjaman06[] pinjam = {
            new Peminjaman06(mhs[0], buku[0], 7),
            new Peminjaman06(mhs[1], buku[1], 3),
            new Peminjaman06(mhs[2], buku[2], 10),
            new Peminjaman06(mhs[2], buku[3], 6),
            new Peminjaman06(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa06 m : mhs)
                        m.tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku06 b : buku)
                        b.tampilBuku();
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman06 p : pinjam)
                        p.tampilPeminjaman();
                    break;

                case 4:
                    for (int i = 1; i < pinjam.length; i++) {
                        Peminjaman06 temp = pinjam[i];
                        int j = i -1;
                        while (j >= 0 && pinjam[j].denda < temp.denda) {
                            pinjam[j+1] = pinjam[j];
                            j--;
                        }
                        pinjam[j+1] = temp;
                    }
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman06 p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    sc.nextLine();
                    String cari = sc.nextLine();

                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = i + 1; j < pinjam.length; j++) {
                            if (pinjam[i].mhs.nim.compareTo(pinjam[j].mhs.nim) > 0) {
                                Peminjaman06 temp = pinjam[i];
                                pinjam[i] = pinjam[j];
                                pinjam[j] = temp;
                            }
                        }
                    }

                    int left = 0;
                    int right = pinjam.length - 1;
                    boolean ketemu = false;
                    
                    while (left <= right) {
                        int mid = (left + right) / 2;
                        
                        if (pinjam[mid].mhs.nim.equals(cari)) {
                            pinjam[mid].tampilPeminjaman();
                            ketemu = true;
                            break;
                        } else if (pinjam[mid].mhs.nim.compareTo(cari) < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }
                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                
                case 0:
                   System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");  
            }

        } while (pilih != 0);
    }
}