/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author ADMIN
 */
public class ResizableCircle extends Circle implements Resizable{
    
    public ResizableCircle(double radius){
        super(radius);
    }
    
    @Override
    public void resize(int percent){
        radius = radius * percent / 100;
    }

    

}
