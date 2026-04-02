package edu.transport;

public class MainApp {
    public static void main(String[] args) {
        double jarak = 120;

        Mobil mobil = new Mobil("Toyota Avanza", 120);
        Motor motor = new Motor("Honda Beat", 90);

        double waktuMobil = mobil.hitungWaktuTempuh(jarak);
        double waktuMotor = motor.hitungWaktuTempuh(jarak);

        System.out.println("PERHITUNGAN WAKTU TEMPUH");
        System.out.println("Jarak tempuh: " + jarak + " km");
        System.out.println("Kendaraan        : " + mobil.getNama());
        System.out.println("Kecepatan Maks   : " + mobil.getKecepatanMaks() + " km/jam");
        System.out.println("Kecepatan Efektif: " + (mobil.getKecepatanMaks() * 0.8) + " km/jam (80%)");
        System.out.println("Waktu Tempuh     : " + String.format("%.2f", waktuMobil) + " jam");
        System.out.println("Kendaraan        : " + motor.getNama());
        System.out.println("Kecepatan Maks   : " + motor.getKecepatanMaks() + " km/jam");
        System.out.println("Kecepatan Efektif: " + (motor.getKecepatanMaks() * 0.9) + " km/jam (90%)");
        System.out.println("Waktu Tempuh     : " + String.format("%.2f", waktuMotor) + " jam");
    }
}
