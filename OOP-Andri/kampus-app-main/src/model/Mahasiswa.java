package model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private Prodi idProdi; // Tambahkan atribut Prodi

    public Mahasiswa(String nim, String nama, String idProdi) {
        this.nim = nim;
        this.nama = nama;
        this.idProdi = new Prodi(idProdi, "");
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Prodi getProdi() {
        return idProdi;
    }
}
