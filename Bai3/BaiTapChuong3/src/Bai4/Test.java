/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        BenhVien b1 = new BenhVien("da khoa","ha noi","Nguyen van a");
        BenhNhan bn1 = new BenhNhan("Benh tim","ung thu",b1,"Nguyen thi b",20,'M');
        System.out.println(bn1);
    }
}
