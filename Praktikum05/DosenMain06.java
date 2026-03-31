package Praktikum05;
import java.util.Scanner;

public class DosenMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen06 list = new DataDosen06();

        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda - Tertua, Bubble sort)");
            System.out.println("4. Sorting DSC (Tertua - Termuda, Selection Sort)");
            System.out.println("5. Insertion Sort (ASC)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode          : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama          : ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jkChar = sc.next().charAt(0);
                    boolean jk = (jkChar == 'L' || jkChar == 'l');
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen06 d = new Dosen06(kd, nm, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 5:
                    list.insertionSort();
                    list.tampil();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 6);

    }
}