/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi_180524;

/**
 *
 * @author DELL
 */
public class DecToOthersRecur {
    static void printBase(int num, int base) {
    String digits = "0123456789abcdef";
    /*Recursive step */
    if (num >= base ) {
    printBase (num/base, base);
    }
    /* Base case :num < base */
    System.out.print(digits.charAt(num%base));
    }
    public static void main(String args[]) {
    int num = 5;
    int base = 7;
    printBase(num, base);
    }
    
}
