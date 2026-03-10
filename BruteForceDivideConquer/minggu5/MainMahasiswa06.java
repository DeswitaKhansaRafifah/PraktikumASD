package BruteForceDivideConquer.minggu5;

public class MainMahasiswa06 {
    public static void main(String[] args) {
        Mahasiswa06[] mhs = {
            new Mahasiswa06("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa06("Budi",  "220101002", 2022, 85, 88),
            new Mahasiswa06("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa06("Dian",  "220101004", 2021, 76, 79),
            new Mahasiswa06("Eko",   "220101005", 2023, 92, 95),
            new Mahasiswa06("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa06("Gina",  "220101007", 2023, 80, 83),
            new Mahasiswa06("Hadi",  "220101008", 2020, 82, 84)
        };

        NilaiMahasiswa06 hitung = new NilaiMahasiswa06();
        int n = mhs.length;

        Mahasiswa06 tertinggi = hitung.utsTertinggi(mhs, 0, n - 1);
        Mahasiswa06 terendah = hitung.utsTerendah(mhs, 0, n - 1);

        System.out.println("========================================");
        System.out.println("      HASIL ANALISIS DATA MAHASISWA     ");
        System.out.println("========================================");

        System.out.println("\nNilai UTS Tertinggi:");
        System.out.println("Nama       : " + tertinggi.nama);
        System.out.println("NIM        : " + tertinggi.nim);
        System.out.println("Tahun Masuk: " + tertinggi.tahunMasuk);
        System.out.println("Nilai UTS  : " + tertinggi.nilaiUTS);
        System.out.println("----------------------------------------");

        System.out.println("Nilai UTS Terendah:");
        System.out.println("Nama       : " + terendah.nama);
        System.out.println("NIM        : " + terendah.nim);
        System.out.println("Tahun Masuk: " + terendah.tahunMasuk);
        System.out.println("Nilai UTS  : " + terendah.nilaiUTS);
        System.out.println("----------------------------------------");

        System.out.println("Rata-rata Nilai UAS : " + hitung.rataRataUAS(mhs));
    }

}