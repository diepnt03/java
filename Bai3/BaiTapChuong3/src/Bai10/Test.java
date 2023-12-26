/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        HocVienDH dh = new HocVienDH();
        dh.nhap();
        

        HocVienLT lt = new HocVienLT();
        lt.nhap();
        
        title();
        dh.inThongTin();
        lt.inThongTin();
    }

    public static void title() {
        System.out.printf("\n%20s %20s %20s %8s %15s", "Ho Ten", "Dia Chi", "Loai CT","Loai UT", "Hoc Phi" );

    }
}
