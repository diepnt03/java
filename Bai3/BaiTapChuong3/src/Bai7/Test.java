/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        
        ResizableCircle r1 = new ResizableCircle(1.0);
        r1.resize(30);
        
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        

    }

}
