package minggu9;

public class Mahasiswa_8 {
    String nim,nama,kelas;
    int nilai;

    Mahasiswa_8 () {

    }

    Mahasiswa_8 (String nim, String nama, String kelas){
        this.nama=nama;
        this.nim=nim;
        this.kelas=kelas;
        nilai= -1;
    }

    void tugasDinilai(int nilai){
        this.nilai=nilai;
    }

}
