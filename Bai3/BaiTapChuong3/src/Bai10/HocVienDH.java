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
public class HocVienDH extends HocVien {

    private int loaiUuTien;
    private int soBuoi;
    private double donGiaDH;

    public HocVienDH() {
    }

    public HocVienDH(int loaiUuTien, int soBuoi, double donGia) {
        this.loaiUuTien = loaiUuTien;
        this.soBuoi = soBuoi;
        this.donGiaDH = donGia;
    }

    public HocVienDH(int loaiUuTien, int soBuoi, double donGia, String hoTen, String diaChi, String loaiChuongTrinh) {
        super(hoTen, diaChi, loaiChuongTrinh);
        this.loaiUuTien = loaiUuTien;
        this.soBuoi = soBuoi;
        this.donGiaDH = donGia;
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
        return donGiaDH;
    }

    public void setDonGia(double donGia) {
        this.donGiaDH = donGia;
    }

    @Override
    public String toString() {
        return super.toString()+"HocVienDH{" + "loaiUuTien=" + loaiUuTien + ", soBuoi=" + soBuoi + ", donGia=" + donGiaDH + '}';
    }

    public void nhap() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai uu tien: ");
        loaiUuTien = sc.nextInt();
        System.out.print("Nhap so buoi: ");
        soBuoi = sc.nextInt();
        System.out.print("Nhap don gia do hoa: ");
        donGiaDH = sc.nextDouble();
    }

    @Override
    public double hocPhi() {
        double uuTien;
        uuTien = switch (loaiUuTien) {
            case 1 ->
                1000000;
            case 2 ->
                500000;
            default ->
                0;
        };
        return soBuoi * donGiaDH - uuTien;
    }   
    

}
