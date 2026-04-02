package edu.university.staff;

public class StafAdministrasi extends Pegawai {
    private int jamLembur;

    public StafAdministrasi(String nama, double gajiPokok, int jamLembur) {
        super(nama, gajiPokok);  // memanggil constructor parent
        this.jamLembur = jamLembur;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jamLembur * 50000);
    }

    public int getJamLembur() {
        return jamLembur;
    }
}
