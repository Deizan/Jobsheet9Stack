public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa16() {}

    public Mahasiswa16(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}