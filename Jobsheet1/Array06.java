package Jobsheet1;

import java.util.Scanner;
public class Array06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        int[] sks = new int[jumlahMK];
        String[] mk = new String[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalNilai = 0;
        double totalSks = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke- " + (i + 1));

            System.out.print("Nama MK\t\t: ");
            mk[i] = sc.nextLine();

            System.out.print("Jumlah SKS\t: ");
            sks[i] = sc.nextInt();

            System.out.print("Nilai Angka\t: ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 75) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 70) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalNilai += nilaiSetara[i] * sks[i];
            totalSks += sks[i];
        }

        double ip = totalNilai / totalSks;

        System.out.println("\n==============================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ip);
    }
    
}