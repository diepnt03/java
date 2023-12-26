/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai11;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class GVCoHuu extends GiangVien {

    private double LCB;
    private double heSoLuong;
    private int thamNien;

    public GVCoHuu() {
    }

    public GVCoHuu(double LCB, double heSoLuong, int thamNien) {
        this.LCB = LCB;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }

    public GVCoHuu(double LCB, double heSoLuong, int thamNien, String hoTen, String diaChi, String loaiGiangVien) {
        super(hoTen, diaChi, loaiGiangVien);
        this.LCB = LCB;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }

    public double getLCB() {
        return LCB;
    }

    public void setLCB(double LCB) {
        this.LCB = LCB;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    @Override
    public String toString() {
        return super.toString() + "GVCoHuu{" + "LCB=" + LCB + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + '}';
    }
    
    
    public void nhap() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong co ban: ");
        LCB = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
        System.out.print("Nhap tham nien: ");
        thamNien = sc.nextInt();
    }

    @Override
    public double tinhLuong() {
        double phuCap;
        if (thamNien < 5) {
            phuCap = 0;
        } else {
            phuCap = (double) thamNien / 100 * LCB;
        }
        return LCB*heSoLuong+phuCap;
    }

}
