package KuisCM2;

public class Pembeli06 {
    String namaPembeli;
    String noHp;

    public Pembeli06(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampilPembeli() {
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("No HP        : " + noHp);
    }
}