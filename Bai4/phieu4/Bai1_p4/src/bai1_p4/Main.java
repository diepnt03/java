/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_p4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HinhTron ht = new HinhTron();
        System.out.println("Hinh tron");
        System.out.print("Nhap vao ban kinh hinh tron: ");
        ht.r = s.nextDouble();
        System.out.println("Chu vi cua hinh tron la: "+ht.tinhCV());
        System.out.println("Dien tich cua hinh tron la: "+ht.tinhDT());
        
        System.out.println("Hinh vuong");
        System.out.print("Nhap vao canh hinh vuong: ");
        HinhVuong hv = new HinhVuong();
        hv.c = s.nextDouble();
        System.out.println("Chu vi cua hinh vuong la: "+hv.tinhCV());
        System.out.println("Dien tich cua hinh vuong la: "+hv.tinhDT());
        
        System.out.println("Hinh chu nhat");
        System.out.print("Nhap vao chieu dai chieu rong hcn: ");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.a = s.nextDouble();
        hcn.b = s.nextDouble();
        System.out.println("Chu vi cua hinh chu nhat la: "+hcn.tinhCV());
        System.out.println("Dien tich cua hinh chu nhat la: "+hcn.tinhDT());
    }
}
