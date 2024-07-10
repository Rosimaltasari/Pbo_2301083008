/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pratikum02042024;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class KaryawanExample {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menguji beberapa objek Karyawan
        System.out.println("Masukkan data untuk Karyawan 1:");
        System.out.print("Nama: ");
        String nama1 = scanner.nextLine();
        System.out.print("NIP: ");
        String NIP1 = scanner.nextLine();
        System.out.print("Masa Kerja (tahun): ");
        int masaKerja1 = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        
        Karyawan karyawan1 = new Karyawan(nama1, NIP1, masaKerja1);
        
        System.out.println("Masukkan data untuk Karyawan 2:");
        System.out.print("Nama: ");
        String nama2 = scanner.nextLine();
        System.out.print("NIP: ");
        String NIP2 = scanner.nextLine();
        System.out.print("Masa Kerja (tahun): ");
        int masaKerja2 = scanner.nextInt();
        
        Karyawan karyawan2 = new Karyawan(nama2, NIP2, masaKerja2);

        // Mencetak informasi karyawan
        System.out.println("\nInformasi Karyawan 1:");
        karyawan1.cetakKaryawan();
        
        System.out.println("\nInformasi Karyawan 2:");
        karyawan2.cetakKaryawan();
    }
}
