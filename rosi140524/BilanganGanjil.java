/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi140524;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BilanganGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;

        while (true) {
            try {
                System.out.print("Masukkan angka dari 0 sampai 10: ");
                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                    if (input < 0) {
                        throw new IllegalArgumentException("Input tidak boleh negatif.");
                    } else if (input > 10) {
                        System.out.println("Angka harus antara 0 dan 10. Silakan coba lagi.");
                    } else {
                        System.out.println("Anda telah memasukkan angka yang benar: " + input);
                        break;
                    }
                } else {
                    System.out.println("Input tidak valid. Masukkan angka.");
                    scanner.next(); // Clear the invalid input
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
