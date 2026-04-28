package TugasJobsheet10;

public class AntrianKRS06 {
    MahasiswaKRS06[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahProses = 0;
    int kuotaDPA = 30;

    public AntrianKRS06(int max) {
        this.max = max;
        data = new MahasiswaKRS06[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(MahasiswaKRS06 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Memproses KRS 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            if (!isEmpty() && sudahProses < kuotaDPA) {
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahProses++;
            }
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Daftar Antrian: ");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihat2Depan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("2 Mahasiswa Terdepan:");
        for (int i = 0; i < 2 && i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void CetakStatistikAntrian() {
        System.out.println("Jumlah antrian: " + size);
        System.out.println("Sudah proses KRS: " + sudahProses);
        int sisa = kuotaDPA - sudahProses;
        System.out.println("Sisa kuota proses: " + sisa);
    }
}