/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai11;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        GVCoHuu ch = new GVCoHuu();
        ch.nhap();

        GVThinhGiang tg = new GVThinhGiang();
        tg.nhap();
        
        title();
        ch.inThongTin();
        tg.inThongTin();
    }

    public static void title() {
        System.out.printf("\n %20s %20s %20s %15s", "Ho Ten", "Dia Chi", "Loai Giang Vien", "Luong Thang");
    }
}
