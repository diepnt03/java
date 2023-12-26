/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        DiaChi d1 = new DiaChi("Go Dai","Hai Luu","Song Lo","Vinh Phuc");
        System.out.println(d1); 
        
        NhanVien n1 = new NhanVien("Nguyen Thi Diep",d1,"12/11/2003",'F');
        System.out.println(n1);
    }
}
