package CaseMethod;

public class Mahasiswa06 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa06 (String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}