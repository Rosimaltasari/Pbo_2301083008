/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rosi_27042024;

/**
 *
 * @author DELL
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle (double radius){
    }
    public double getRadius(){
    return radius;
    }
    public void getRadius(double radius){
    this.radius = radius;
    }
    public String getName(){
      return "Circle";
    }
      
    public float getArea(){
      return (float) (Math.PI * radius * radius);
    
    }
    
}
