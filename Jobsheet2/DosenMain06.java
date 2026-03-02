package Jobsheet2;

public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 dsn1 = new Dosen06();
        dsn1.idDosen = "DS001";
        dsn1.nama = "Dr. Andi";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Algoritma";

        Dosen06 dsn2 = new Dosen06("DS002", "Dr. Budi", true, 2018, "Basis Data");

        System.out.println("===== DATA AWAL DOSEN =====");
        dsn1.tampilInformasi();
        dsn2.tampilInformasi();

        System.out.println("===== PERUBAHAN DOSEN 1 =====");
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Struktur Data");

        System.out.println();

        System.out.println("===== PERUBAHAN DOSEN 2 =====");
        dsn2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.ubahKeahlian("Sistem Informasi");

        System.out.println();

        System.out.println("===== DATA AKHIR DOSEN =====");
        dsn1.tampilInformasi();
        dsn2.tampilInformasi();
    }
    
}