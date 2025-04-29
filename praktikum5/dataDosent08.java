package praktikum5;
public class dataDosent08 {
    dosent08[] dataDosent08 = new dosent08[10];
    int idx =0;

    public void tambah(dosent08 dsnt) {
        if (idx < dataDosent08.length) {
            dataDosent08[idx] = dsnt;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("belum ada data dosen");
        }
        for (int i = 0; i < idx; i++) {
            dataDosent08[i].tampil();
        }
    }

    public void SortingBubbleASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosent08[j].usia > dataDosent08[j + 1].usia) {
                    dosent08 temp = dataDosent08[j];
                    dataDosent08[j] = dataDosent08[j + 1];
                    dataDosent08[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan dari termuda ke tertua (ASC).");
    }

    public void SortingSelecDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosent08[j].usia > dataDosent08[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            dosent08 temp = dataDosent08[maxIdx];
            dataDosent08[maxIdx] = dataDosent08[i];
            dataDosent08[i] = temp;
        }
        System.out.println("Data telah diurutkan dari tertua ke termuda (DESC).");
    }

    void pencarianDataSequential08(String namaCari) {
        int jumDitemukan = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosent08[i].nama.equalsIgnoreCase(namaCari)) {
                System.out.println("\nDosen ditemukan pada indeks ke-" + i);
                System.out.println("Kode : " + dataDosent08[i].kode);
                System.out.println("Nama : " + dataDosent08[i].nama);
                System.out.println("Jenis Kelamin : " + dataDosent08[i].jenKel);
                System.out.println("Usia : " + dataDosent08[i].usia);
                jumDitemukan++;
            }
        }
    
        if (jumDitemukan == 0) {
            System.out.println("\tData dosen dengan nama " + namaCari + " tidak ditemukan.");
        } else if (jumDitemukan > 1) {
            System.out.println("\tDitemukan lebih dari satu dosen dengan nama " + namaCari);
        }
    }

    void PencarianDataBinary08(int usiaCari) {
        int left = 0, right = idx - 1;
        int posisi = -1;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosent08[mid].usia == usiaCari) {
                posisi = mid;
                break;
            } else if (dataDosent08[mid].usia < usiaCari) { 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        if (posisi != -1) {
            System.out.println("Dosen dengan usia " + usiaCari + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Data dosen dengan usia " + usiaCari + " tidak ditemukan.");
        }
    }


}
