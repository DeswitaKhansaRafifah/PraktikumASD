package Jobsheet2;

public class MataKuliah06 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah06 () {

    }

    public MataKuliah06(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi () {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
        System.out.println("-------------------------");
    }

    void ubahSKS (int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam (int jumlahJamBaru) {
        jumlahJam += jumlahJamBaru;
        System.out.println("Jumlah jam berhasil ditambahkan.");
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam (int kurangiJam) {
        if (jumlahJam >= kurangiJam) {
            jumlahJam -= kurangiJam;
            System.out.println("Jumlah jam berhasil dikurangi.");
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi.");
        }
    }
    
}
