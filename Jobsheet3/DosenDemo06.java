package Jobsheet3;
import java.util.Scanner;

public class DosenDemo06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen: ");
        int jml = sc.nextInt();
        sc.nextLine();

        Dosen06[] arrayOfDosen = new Dosen06[jml];

        for (int i = 0; i < jml; i++) {

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");

            arrayOfDosen[i] = new Dosen06(kode, nama, jenisKelamin, usia);
            
        }

        System.out.println();

        int i = 1;
        for (Dosen06 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + dsn.jenisKelamin);
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("-----------------------------");
            i++;
        }

        DataDosen06 dataDosen = new DataDosen06();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
    
}