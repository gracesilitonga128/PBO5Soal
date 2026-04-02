package edu.university.staff;

public class Dosen extends Pegawai {
    private int jumlahSKS;

    public Dosen(String nama, double gajiPokok, int jumlahSKS) {
        super(nama, gajiPokok);  // memanggil constructor parent
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jumlahSKS * 150000);
    }

    public int getJumlahSKS() {
        return jumlahSKS;
    }
}
