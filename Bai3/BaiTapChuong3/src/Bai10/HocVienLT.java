/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HocVienLT extends HocVien {

    private int loaiUuTien;
    private int soBuoi;
    private double donGiaLT;

    public HocVienLT() {
    }

    public HocVienLT(int loaiUuTien, int soBuoi, double donGia) {
        this.loaiUuTien = loaiUuTien;
        this.soBuoi = soBuoi;
        this.donGiaLT = donGia;
    }

    public HocVienLT(int loaiUuTien, int soBuoi, double donGia, String hoTen, String diaChi, String loaiChuongTrinh) {
        super(hoTen, diaChi, loaiChuongTrinh);
        this.loaiUuTien = loaiUuTien;
        this.soBuoi = soBuoi;
        this.donGiaLT = donGia;
    }

    public int getLoaiUuTien() {
        return loaiUuTien;
    }

    public void setLoaiUuTien(int loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public double getDonGia() {
        return donGiaLT;
    }

    public void setDonGia(double donGia) {
        this.donGiaLT = donGia;
    }

    @Override
    public String toString() {
        return super.toString() + "HocVienLT{" + "loaiUuTien=" + loaiUuTien + ", soBuoi=" + soBuoi + ", donGia=" + donGiaLT + '}';
    }

    public void nhap() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai uu tien: ");
        loaiUuTien = sc.nextInt();
        System.out.print("Nhap so buoi: ");
        soBuoi = sc.nextInt();
        System.out.print("Nhap don gia lap trinh: ");
        donGiaLT = sc.nextDouble();
    }

    @Override
    public double hocPhi() {
        double uuTien;
        uuTien = switch (loaiUuTien) {
            case 1 ->
                1000000;
            case 2 ->
                800000;
            default ->
                0;
        };
        return soBuoi * donGiaLT - uuTien;
    }
    
    
}
