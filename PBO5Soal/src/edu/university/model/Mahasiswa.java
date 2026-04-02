package edu.university.model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.ipk = 0.0;
    }

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getKategoriIPK() {
        if (ipk >= 3.5) {
            return "Cumlaude";
        } else if (ipk >= 3.0) {
            return "Sangat Memuaskan";
        } else if (ipk >= 2.5) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }
}