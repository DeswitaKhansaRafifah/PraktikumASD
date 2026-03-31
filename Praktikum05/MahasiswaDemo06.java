package Praktikum05;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        Mahasiswa06 m1 = new Mahasiswa06("123", "Zidan", "2A", 3.2);
        Mahasiswa06 m2 = new Mahasiswa06("124", "Ayu",   "2A", 3.5);
        Mahasiswa06 m3 = new Mahasiswa06("125", "Sofi",  "2A", 3.1);
        Mahasiswa06 m4 = new Mahasiswa06("126", "Sita",  "2A", 3.9);
        Mahasiswa06 m5 = new Mahasiswa06("127", "Miki",  "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

    }
}