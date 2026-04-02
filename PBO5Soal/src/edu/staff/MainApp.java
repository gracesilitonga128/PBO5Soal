package edu.university.staff;

public class MainApp {
    public static void main(String[] args) {
        Pegawai[] daftarPegawai = new Pegawai[4];
        daftarPegawai[0] = new Dosen("Prof. Dr. Ahmad Budiman", 5000000, 12);
        daftarPegawai[1] = new Dosen("Dr. Siti Nurhaliza", 4500000, 10);
        daftarPegawai[2] = new StafAdministrasi("Budi Raharjo", 3500000, 15);
        daftarPegawai[3] = new StafAdministrasi("Ani Wijaya", 3000000, 8);
        System.out.println("DATA PEGAWAI");

        for (int i = 0; i < daftarPegawai.length; i++) {
            Pegawai pegawai = daftarPegawai[i];

            if (pegawai instanceof Dosen) {
                Dosen dosen = (Dosen) pegawai;
                System.out.println("Jenis       : Dosen");
                System.out.println("Nama        : " + dosen.getNama());
                System.out.println("Gaji Pokok  : Rp " + String.format("%,d", (int)dosen.getGajiPokok()));
                System.out.println("Jumlah SKS  : " + dosen.getJumlahSKS());
                System.out.println("Total Gaji  : Rp " + String.format("%,d", (int)dosen.hitungGaji()));

            } else if (pegawai instanceof StafAdministrasi) {
                StafAdministrasi staf = (StafAdministrasi) pegawai;  // Downcasting
                System.out.println("Jenis       : Staf Administrasi");
                System.out.println("Nama        : " + staf.getNama());
                System.out.println("Gaji Pokok  : Rp " + String.format("%,d", (int)staf.getGajiPokok()));
                System.out.println("Jam Lembur  : " + staf.getJamLembur() + " jam");
                System.out.println("Total Gaji  : Rp " + String.format("%,d", (int)staf.hitungGaji()));
            }
        }
    }
}