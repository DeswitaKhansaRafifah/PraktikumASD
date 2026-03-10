package BruteForceDivideConquer.minggu5;

public class NilaiMahasiswa06 {
    
    public Mahasiswa06 utsTertinggi(Mahasiswa06[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        Mahasiswa06 leftTertinggi = utsTertinggi(arr, l, mid);
        Mahasiswa06 rightTertinggi = utsTertinggi(arr, mid + 1, r);
        return (leftTertinggi.nilaiUTS > rightTertinggi.nilaiUTS) ? leftTertinggi : rightTertinggi;
    }

    public Mahasiswa06 utsTerendah(Mahasiswa06[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        Mahasiswa06 leftTerendah = utsTerendah(arr, l, mid);
        Mahasiswa06 rightTerendah = utsTerendah(arr, mid + 1, r);
        return (leftTerendah.nilaiUTS < rightTerendah.nilaiUTS) ? leftTerendah : rightTerendah;
    }

    public double rataRataUAS(Mahasiswa06[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}