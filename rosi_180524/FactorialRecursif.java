/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi_180524;

/**
 *
 * @author DELL
 */
public class FactorialRecursif {
    
    static int factorial(int n) {
    if(n==1)  {
    /*The base case */
    return 1;
    }
    
    /*recursive defiinition; self-invocation */
    return factorial(n - 1)* n;
    }
    
    /**
     *@param  args the command line arguments
     */
    public static void main(String[] args) {
    //TODO code application logic here
    int n = 4;
    System.out.println(factorial(n));
    
    }
    
}
