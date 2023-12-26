/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NhanVienVP extends NhanVien {

    private int soNgayNghi;
    private float mucLuong;

    @Override
    public double tinhLuong() {
        return mucLuong - soNgayNghi * 10000;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so ngay nghi=");
        soNgayNghi = s.nextInt();
        System.out.print("Muc luong=");
        mucLuong = s.nextInt();
    }

    public static void inTieuDe() {
        NhanVien.inTieuDe();
        System.out.printf("%10s %15s %15s %15s%n", " So ngay ngi", " muc luong", " phu cap", " Luong ");
    }

    @Override
    public final void xuatDL() {
        super.xuatDL();
        System.out.printf("%10d %15f %15.2f %15.2f%n", soNgayNghi, mucLuong, tinhPhuCap(), tinhLuong());
    }

    @Override
    public String toString() {
        return super.toString() + "\t so ngay nghi =" + soNgayNghi + "\tmuc luong=" + mucLuong;
    }

}
