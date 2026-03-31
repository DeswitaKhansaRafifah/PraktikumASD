package Praktikum05;

public class DataDosen06 {

    Dosen06[] dataDosen = new Dosen06[10];
    int idx;

    void tambah(Dosen06 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Bubble Sort
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen06 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = tmp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan ASC (termuda - tertua)");
    }

    // Selection Sort
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen06 tmp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = tmp;
        }
        System.out.println("Data berhasil diurutkan DSC (tertua - termuda)");
    }

    void insertionSort() {
    for (int i = 1; i < idx; i++) {
        Dosen06 temp = dataDosen[i];
        int j = i - 1;

        while (j >= 0 && dataDosen[j].usia > temp.usia) {
            dataDosen[j + 1] = dataDosen[j];
            j--;
        }
        dataDosen[j + 1] = temp;
    }
    System.out.println("Data berhasil diurutkan dengan Insertion Sort (ASC)");
    }
}