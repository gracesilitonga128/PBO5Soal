package edu.smartdevice;

public class MainApp {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();

        System.out.println("\n--- STATUS AWAL ---");
        System.out.println("Battery Level: " + smartWatch.getBatteryLevel() + "%");
        System.out.println("WiFi Connected: " + smartWatch.isConnected());

        System.out.println("\n--- MENGISI BATERAI ---");
        smartWatch.chargeBattery(30);
        System.out.println("Battery Level: " + smartWatch.getBatteryLevel() + "%");

        smartWatch.chargeBattery(80);
        System.out.println("Battery Level setelah charge lagi: " + smartWatch.getBatteryLevel() + "%");

        System.out.println("\n--- KONEKSI WiFi ---");
        smartWatch.connectWifi("Kampus_WiFi");
        System.out.println("Status Koneksi: " + (smartWatch.isConnected() ? "Terhubung" : "Tidak Terhubung"));
        System.out.println("SSID: " + smartWatch.getSsid());

        System.out.println("\n--- MENCOBA SSID KOSONG ---");
        smartWatch.connectWifi("");
        System.out.println("Status Koneksi: " + (smartWatch.isConnected() ? "Terhubung" : "Tidak Terhubung"));

        System.out.println("\n--- STATUS AKHIR ---");
        System.out.println("Battery Level: " + smartWatch.getBatteryLevel() + "%");
        System.out.println("WiFi Connected: " + (smartWatch.isConnected() ? "Ya (SSID: " + smartWatch.getSsid() + ")" : "Tidak"));
    }
}