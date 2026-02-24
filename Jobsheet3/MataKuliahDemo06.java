package Jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        MataKuliah06[] arrayOfMatakuliah = new MataKuliah06[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mata kuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Sks           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");
            arrayOfMatakuliah[i] = new MataKuliah06(kode, nama, sks, jumlahJam);
        }

         for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        System.out.println("== Tambah Data Matakuliah Baru ==");
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("Sks        : ");
        sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        jumlahJam = Integer.parseInt(sc.nextLine());

        arrayOfMatakuliah[0].tambahData(kode, nama, sks, jumlahJam);

        System.out.println("Data ke-1 setelah ditambah:");
        arrayOfMatakuliah[0].cetakInfo();
    }
}
