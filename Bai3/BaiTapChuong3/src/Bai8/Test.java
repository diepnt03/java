/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15, 8);
        System.out.println(r1);
        System.out.println("Dien tich cua hcn: " + r1.getArea());

        Triangle t1 = new Triangle(10, 8);
        System.out.println(t1);
        System.out.println("Dien tich cua hinh tam giac: " + t1.getArea());
        
        //Bai 9: Tao mang doi tương
        Shape []h = new Shape[5];
        
        h[0] = r1;
        h[1] = t1;
        
        System.out.println("Danh sach cac doi tuong duoc tao ra tu lop Rectangle");
        for (Shape h1 : h) {
            if (h1 instanceof Rectangle) {
                System.out.println(h1);
            }
        }
                
        
        

    }
}
