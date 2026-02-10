package Jobsheet1;

import java.util.Scanner;
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTgs, nilaiKuis, nilaiUts, nilaiUas;

        System.out.println("\nProgram Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas \t: ");
        nilaiTgs = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis \t: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS \t: ");
        nilaiUts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS \t: ");
        nilaiUas = sc.nextInt();

        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTgs < 0 || nilaiTgs > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100 ) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");
            return;
        }

        double nilaiAkhir;
        String status;
        String nilaiHuruf = "";

        nilaiAkhir = (nilaiTgs * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir <= 39){
            nilaiHuruf = "E";
        } else {
            System.out.println("nilai tidak valid");
        }

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        
        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiAkhir >= 51) {
            status = "SELAMAT ANDA LULUS";
        } else {
            status = "ANDA TIDAK LULUS";
        }

        System.out.println(status);
    }
    
}