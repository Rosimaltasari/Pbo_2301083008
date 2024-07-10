/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi_210524;

/**
 *
 * @author DELL
 */
import java.io.*;
public class Sort {
     public static void main(String args[]) throws IOException{
        System.out.println("Nama file yang akan dibaca?");
        String filename;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("membaca file"+ filename +"...");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex){
            System.out.println("File not found.");
        }
        try{
            char data;
            int temp;
            int temp1;
            do{
                temp = fis.read();
                temp1=temp;
                temp1=temp1 ^ 25;
                data = (char) temp1;
                if (temp != -1){
                    System.out.print(data);
                }
            }while (temp != -1);
        }catch (IOException ex){
            System.out.println("Problem in reading from the file.");
        }
     }
}
