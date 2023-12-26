/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class KySu extends NguoiLaoDong {

    private double luongCB;
    private double heSoLuong;
    private int soNgayCong;

    public KySu() {
    }

    public KySu(double luongCB, double heSoLuong, int soNgayCong) {
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
    }

    public KySu(String hoTen, String diaChi, String loaiLaoDong, double luongCB, double heSoLuong, int soNgayCong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public String toString() {
        return super.toString() + "KySu{" + "luongCB=" + luongCB + ", heSoLuong=" + heSoLuong + ", soNgayCong=" + soNgayCong + '}';
    }

    public void nhap() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong co ban: ");
        luongCB = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
        System.out.print("Nhap so ngay cong: ");
        soNgayCong = sc.nextInt();
    }

    @Override
    public double tinhLuong() {
        double thuong;
        if (soNgayCong >= 25) {
            thuong = 2000000;
        } else if (soNgayCong < 25 && soNgayCong > 15) {
            thuong = 1000000;
        } else {
            thuong = 0;
        }
        return luongCB * heSoLuong + thuong;
    }

}
