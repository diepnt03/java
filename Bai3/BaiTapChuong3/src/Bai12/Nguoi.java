/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai12;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public abstract class Nguoi {

    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String loaiSV;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSV) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiSV = loaiSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiSV() {
        return loaiSV;
    }

    public void setLoaiSV(String loaiSV) {
        this.loaiSV = loaiSV;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", loaiSV=" + loaiSV + '}';
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap vao ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap vao dia chi: ");
        diaChi = sc.nextLine();
        do {
            System.out.println("Nhap vao loai sinh vien: \n1. Sinh vien cao dang nghe(SVCDN).\n2. Sinh vien cao dang chinh quy(SVCDCQ)");
            loaiSV = sc.nextLine();
        } while (loaiSV.compareTo("SVCDN") != 0 && loaiSV.compareTo("SVCDCQ") != 0);
    }

    public abstract double tinhDiem();

    public void inThongTin() {
        System.out.printf("\n %20s %20s %20s %20s %15s", hoTen,ngaySinh, diaChi, loaiSV, tinhDiem());
    }
}
