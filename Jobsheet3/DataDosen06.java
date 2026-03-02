package Jobsheet3;

public class DataDosen06 {
    void dataSemuaDosen(Dosen06[] arrayOfDosen) {

        System.out.println("\n===== MENAMPILKAN DATA SEMUA DOSEN =====");
        for (Dosen06 dsn : arrayOfDosen) {
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + dsn.jenisKelamin);
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("-------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen06[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen06 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else if (dsn.jenisKelamin.equalsIgnoreCase("Wanita")) {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen06[] arrayOfDosen) {
        int totalUsiaPria = 0, jmlPria = 0;
        int totalUsiaWanita = 0, jmlWanita = 0;

        for (Dosen06 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalUsiaPria += dsn.usia;
                jmlPria++;
            } else if (dsn.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalUsiaWanita += dsn.usia;
                jmlWanita++;
            }
        }
        
        System.out.println("Rerata Usia Pria    : " + (jmlPria > 0 ? (double) totalUsiaPria / jmlPria : 0));
        System.out.println("Rerata Usia Wanita  : " + (jmlWanita > 0 ? (double) totalUsiaWanita / jmlWanita : 0));
    }

    void infoDosenPalingTua(Dosen06[] arrayOfDosen) {
        Dosen06 tertua = arrayOfDosen[0];
        for (Dosen06 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }
        System.out.println("Dosen Paling Tua    : " + tertua.nama + " (" + tertua.usia + " tahun)");
    }

    void infoDosenPalingMuda(Dosen06[] arrayOfDosen) {
        Dosen06 termuda = arrayOfDosen[0];
        for (Dosen06 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
    
        System.out.println("Dosen Paling Muda   : " + termuda.nama + " (" + termuda.usia + " tahun)");

    }
}