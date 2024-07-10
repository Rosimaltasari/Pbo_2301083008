/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pratikum02042024;

/**
 *
 * @author DELL
 */
public class Balok {
   private int panjang;
   private int lebar;
   private int tinggi;
   
   public Balok(){
   
   }
   public Balok(int panjang){
   this.panjang=panjang;
   }
   
   public Balok(int panjang, int lebar, int tinggi){
       this.panjang = panjang;
       this.lebar = lebar;
       this.tinggi = tinggi;
   }
   
   public int getPanjang(){
   return panjang;
   }
   
   public void setPanjang(int panjang){
       this.panjang = panjang;
   }
   
   public int getLebar(){
   return lebar;
   }
   
   public void setLebar(int lebar){
   this.lebar = lebar;
   }
   
   public int getTinggi(){
   return tinggi;
   }
   
   public void setTinggi(int tinggi){
       this.tinggi = tinggi;
   }
   
   public int HitungLuasAlas(){
   return panjang * lebar;
   }
   
   public int HitungLuasPermukaan(){
    int lspermukaan;
   lspermukaan = 2 * ((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
   return lspermukaan;
   }
   
   public int HitungVolume(){
   return panjang * lebar * tinggi;
   }
   
   public int HitungVolume(int la){
   return la*tinggi;
   }
   
   public void printBalok(){
   System.out.println("Panjang : "+panjang);
   System.out.println("Lebar : "+lebar);
   System.out.println("Tinggi : "+tinggi);
   }
   
   public void printBalok(int la,int lp,int vol){
   System.out.println("Luas alas = "+la);
   System.out.println("Luas permukaan = "+lp);
   System.out.println("Volume = "+vol);
   }
}

   
   
   
   
    

