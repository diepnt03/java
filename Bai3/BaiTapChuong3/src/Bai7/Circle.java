/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author ADMIN
 */
public class Circle implements GeometricObject{
    protected double radius = 1.0;

   
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    } 
    
}
