/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        Person n1 = new Person();
        System.out.println(n1.getName());
        System.out.println(n1.getDob());
        System.out.println(n1.getPob());
        System.out.println(n1.getGender());
        System.out.println(n1.getEmail());
        System.out.println(n1.getPhone());
        System.out.println(n1);
        
        System.out.println("nguoi thu hai");
        Person n2 = new Person("nguyen van b","12/11/2003","vĩnh phúc",'M',"diepp12112003@gmail.com","0877346549");
        System.out.println(n2.getName());
        System.out.println(n2.getDob());
        System.out.println(n2.getPob());
        System.out.println(n2.getGender());
        System.out.println(n2.getEmail());
        System.out.println(n2.getPhone());
        System.out.println(n2);

    }
}
