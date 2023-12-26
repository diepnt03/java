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
public abstract class GiangVien {
    private String hoTen;
    private String diaChi;
    private String loaiGiangVien;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGiangVien = loaiGiangVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiGiangVien() {
        return loaiGiangVien;
    }

    public void setLoaiGiangVien(String loaiGiangVien) {
        this.loaiGiangVien = loaiGiangVien;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiGiangVien=" + loaiGiangVien + '}';
    }
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap loai giang vien: ");
        loaiGiangVien = sc.nextLine();
    }
    
    public abstract double tinhLuong();
    
    public void inThongTin(){
        System.out.printf("\n %20s %20s %20s %15s",hoTen,diaChi, loaiGiangVien,tinhLuong());
    }
}
