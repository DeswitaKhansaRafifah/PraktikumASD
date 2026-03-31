package Praktikum05;

public class Dosen06 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen06() {
    }
    
    Dosen06(String kd, String nm, boolean jk, int umur) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = umur;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------");
    }
}