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
public class GVThinhGiang extends GiangVien {

    private int soTietDay;
    private double donGia;

    public GVThinhGiang() {
    }

    public GVThinhGiang(int soTietDay, double donGia) {
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    public GVThinhGiang(int soTietDay, double donGia, String hoTen, String diaChi, String loaiGiangVien) {
        super(hoTen, diaChi, loaiGiangVien);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return super.toString() + "GVThinhGiang{" + "soTietDay=" + soTietDay + ", donGia=" + donGia + '}';
    }
    
    public void nhap() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tiet day: ");
        soTietDay = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();       
    }

    @Override
    public double tinhLuong() {
        return soTietDay*donGia - 0.15*(soTietDay*donGia);
    }

}
