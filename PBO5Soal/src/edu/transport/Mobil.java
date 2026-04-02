
package edu.transport;

public class Mobil extends Kendaraan {

    public Mobil(String nama, double kecepatanMaks) {
        super(nama, kecepatanMaks);
    }

    @Override
    public double hitungWaktuTempuh(double jarak) {
        double kecepatanEfektif = kecepatanMaks * 0.8;
        return jarak / kecepatanEfektif;
    }
}