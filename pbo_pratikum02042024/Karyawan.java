/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pratikum02042024;

/**
 *
 * @author DELL
 */
public class Karyawan {
    private String nama;
    private String NIP;
    private int masaKerja;
    private double gaji;

    public Karyawan(String nama, String NIP, int masaKerja) {
        this.nama = nama;
        this.NIP = NIP;
        this.masaKerja = masaKerja;
        this.gaji = hitungGaji();
    }

    private double hitungGaji() {
        double gajiPokok = 2000000; // Gaji pokok 2 juta
        double tunjangan = 0;

        if (masaKerja <= 5) {
            tunjangan = masaKerja * 300000;
        } else if (masaKerja > 5) {
            tunjangan = masaKerja * 500000;
        }

        return gajiPokok + tunjangan;
    }

    public void cetakKaryawan() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Gaji: " + gaji);
    }
    
}
