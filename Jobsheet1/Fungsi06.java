package Jobsheet1;

public class Fungsi06 {

    static int[][] stok = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},  
        {2, 10, 10, 5},   
        {5, 7, 12, 9}    
    };

    static int[] harga = {75000, 50000, 60000, 10000};

    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void main(String[] args) {
        tampilTabelStok();
        System.out.println();

        tampilPendapatanDanStatus();
    }

    static void tampilTabelStok() {
        System.out.println("TABEL STOK BUNGA");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n",
                "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");

        for (int i = 0; i < stok.length; i++) {
            System.out.printf("RoyalGarden %-3d", (i + 1));
            for (int j = 0; j < stok[i].length; j++) {
                System.out.printf(" %-10d", stok[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
    }

    static void tampilPendapatanDanStatus() {
        System.out.println("=====PENDAPATAN SETIAP CABANG ROYAL GARDEN=====");

        for (int i = 0; i < stok.length; i++) {
            int total = hitungPendapatan(i);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + total);

            if (total > 1500000) {
                System.out.println("Status     : Sangat Baik");
            } else {
                System.out.println("Status     : Perlu Evaluasi");
            }
            System.out.println();
        }
    }

    static int hitungPendapatan(int cabang) {
        int total = 0;
        for (int j = 0; j < stok[cabang].length; j++) {
            total += stok[cabang][j] * harga[j];
        }
        return total;
    }
}