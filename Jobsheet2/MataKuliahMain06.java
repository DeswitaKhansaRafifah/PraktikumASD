package Jobsheet2;

public class MataKuliahMain06 {
    public static void main(String[] args) {

        MataKuliah06 mk1 = new MataKuliah06();
        mk1.kodeMK = "PASD";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah06 mk2 = new MataKuliah06("ASD", "Algoritma dan Struktur Data", 2, 4);

        System.out.println("===== DATA AWAL =====");
        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();

        System.out.println("===== PERUBAHAN MATKUL 1 =====");
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println();

        System.out.println("===== PERUBAHAN MATKUL 2 =====");
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);

        System.out.println();

        System.out.println("===== DATA AKHIR =====");
        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();
    }
    
}