package edu.university.main;
import edu.university.model.Mahasiswa;
public class MainApp {
    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
        daftarMahasiswa[0] = new Mahasiswa("20230001", "Budi Santoso", 3.75);
        daftarMahasiswa[1] = new Mahasiswa("20230002", "Siti Aminah", 3.20);
        daftarMahasiswa[2] = new Mahasiswa("20230003", "Joko Widodo", 2.30);
        System.out.println("DATA MAHASISWA");
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            Mahasiswa mhs = daftarMahasiswa[i];
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("NIM        : " + mhs.getNim());
            System.out.println("Nama       : " + mhs.getNama());
            System.out.println("IPK        : " + mhs.getIpk());
            System.out.println("Kategori   : " + mhs.getKategoriIPK());
        }
    }
}