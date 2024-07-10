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
public class BalokExamp {
 public static void main(String[]args){
 int pj,lbr,tg,la;
 Scanner in = new Scanner(System.in);
 System.out.println("==Balok 1==");
 Balok b1 = new Balok();
 System.out.print("Panjang  = "); pj = in.nextInt();
 b1.setPanjang(pj);
 System.out.print("Lebar = "); lbr = in.nextInt();
 b1.setLebar(lbr);
 System.out.print("Tinggi = "); tg = in.nextInt();
 b1.setTinggi(tg);
 la = b1.HitungLuasAlas();
 b1.printBalok(la, b1.HitungLuasPermukaan(), b1.HitungVolume());
 
 //buat balok b2 --> konstruktor 2
 System.out.println("==Balok 2==");
 Balok b2 = new Balok(10);
 b2.setLebar(4);
 b2.setTinggi(5);
 b2.printBalok();
 b2.printBalok(b2.HitungLuasAlas(), b2.HitungLuasPermukaan(), b2.HitungVolume(b2.HitungLuasAlas()));
 
 //buat balok b2 --> konstruktor 2
 System.out.println("==Balok 3==");
 System.out.print("Panjang = "); pj = in.nextInt();
 System.out.print("Lebar = "); lbr = in.nextInt();
 System.out.print("Tinggi = "); tg = in.nextInt();
 Balok b3 = new Balok(pj,lbr,tg);
 la = b3.HitungLuasAlas();
 b3.printBalok(la, b3.HitungLuasPermukaan(), b3.HitungVolume(la));
 
    
 }
}
