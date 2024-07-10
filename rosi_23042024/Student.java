/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rosi_23042024;

/**
 *
 * @author DELL
 */
public class Student extends Person {
    public Student(){
        super();
      //  super("Ali","Padang");
      super.name = "Ali";
      super.address = "Padang";
      
    System.out.println("Student Constructor");
    
    } 
    
    @Override
    public String getName(){
    System.out.println("Student : getName");
    return name;
    }
}
