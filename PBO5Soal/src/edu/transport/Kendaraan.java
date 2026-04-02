package edu.transport;

public abstract class Kendaraan {
    protected String nama;
    protected double kecepatanMaks;

    public Kendaraan(String nama, double kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    public abstract double hitungWaktuTempuh(double jarak);

    public String getNama() {
        return nama;
    }

    public double getKecepatanMaks() {
        return kecepatanMaks;
    }
}
