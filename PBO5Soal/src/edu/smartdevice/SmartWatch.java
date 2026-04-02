package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {
    private int batteryLevel;
    private boolean connected;
    private String ssid;

    public SmartWatch() {
        this.batteryLevel = 0;
        this.connected = false;
        this.ssid = "";
    }

    @Override
    public void chargeBattery(int menit) {
        batteryLevel += menit;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        System.out.println("Mengisi baterai selama " + menit + " menit...");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void connectWifi(String ssid) {
        if (ssid != null && !ssid.trim().isEmpty()) {
            this.ssid = ssid;
            this.connected = true;
            System.out.println("Berhasil terhubung ke WiFi: " + ssid);
        } else {
            this.connected = false;
            System.out.println("Gagal terhubung: SSID tidak boleh kosong!");
        }
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    public String getSsid() {
        return ssid;
    }
}