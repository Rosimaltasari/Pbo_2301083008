/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083008;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class NamaBulan {
    public static void main(String[]args){
        int nobulan;
        char ulang;
        Scanner in = new Scanner(System.in);
        System.out.println("==Program Menentukan Nama Bulan==");
        do  
        {
            System.out.println("Nomor bulan = ");
            nobulan = in.nextInt();
            switch(nobulan)
            {
                case 1 :System.out.println("Bulan januari");break;
                case 2 :System.out.println("Bulan februari"); break;
                case 3 :System.out.println("Bulan maret"); break;
                case 4 :System.out.println("Bulan april"); break;
                case 5 :System.out.println("Bulan mei"); break;
                case 6 :System.out.println("Bulan juni"); break;
                case 7 :System.out.println("Bulan juli"); break;
                case 8 :System.out.println("Bulan agustus"); break;
                case 9 :System.out.println("Bulan September"); break;
                case 10 :System.out.println("Bulan Oktober"); break;
                case 11 :System.out.println("Bulan november"); break;
                case 12 :System.out.println("Bulan Desember"); break;
                default:System.out.println("Nomor bulan anda salah");
            }
            System.out.println("Apakah ingin mengulang ?(Y/T)");
            ulang = in.next().charAt(0);
        }while (ulang=='Y'||ulang=='y');
            }
}
