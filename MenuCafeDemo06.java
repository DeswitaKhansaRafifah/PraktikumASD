import java.util.Scanner;

public class MenuCafeDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Menu: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MenuCafe06[] arrayOfMenuCafe = new MenuCafe06[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Menu ke-" + (i + 1));
            System.out.print("Kode Menu : ");
            String kode = sc.nextLine();
            System.out.print("Nama Menu : ");
            String nama = sc.nextLine();
            System.out.print("Harga     : ");
            double harga = sc.nextDouble();
            System.out.print("Stok      : ");
            int stok = sc.nextInt();
            System.out.println("----------------------------");
            sc.nextLine(); 

            arrayOfMenuCafe[i] = new MenuCafe06(kode, nama, harga, stok);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Menu ke-" + (i + 1));
            arrayOfMenuCafe[i].tampilInfo();
        }

        if (jumlah > 0) {
            System.out.println("\n===== PROSES PERUBAHAN STOK =====");
            arrayOfMenuCafe[0].tambahStok(5);

            if (jumlah > 1) {
                arrayOfMenuCafe[1].kurangiStok(2);
            }
        }

        System.out.println("\n===== DATA SETELAH PERUBAHAN =====");
        for (MenuCafe06 m : arrayOfMenuCafe) {
            m.tampilInfo();
        }
    }
}