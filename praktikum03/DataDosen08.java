package praktikum03;
class DataDosen {

    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        for (Dosen08 dosen : arrayOfDosen) {
            dosen.cetakInfoDosen();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equals("Pria")) {
                pria++;
            } else if (dosen.jenisKelamin.equals("Wanita")) {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equals("Pria")) {
                totalPria += dosen.usia;
                jumlahPria++;
            } else if (dosen.jenisKelamin.equals("Wanita")) {
                totalWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            System.out.println("Rata-rata usia Dosen Pria: " + (totalPria / jumlahPria));
        } else {
            System.out.println("Tidak ada dosen pria.");
        }

        if (jumlahWanita > 0) {
            System.out.println("Rata-rata usia Dosen Wanita: " + (totalWanita / jumlahWanita));
        } else {
            System.out.println("Tidak ada dosen wanita.");
        }
    }

    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 dosenTertua = arrayOfDosen[0];
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        dosenTertua.cetakInfoDosen();
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 dosenTermuda = arrayOfDosen[0];
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        dosenTermuda.cetakInfoDosen();
    }
}
