/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Hang {

    private String tenHang;
    private float soLuong, donGia;

    public Hang(String tenHang, float soLuong, float donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public Hang() {
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Hang{" + "tenHang=" + tenHang + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

    public double ThanhTien() {
        return this.soLuong * this.donGia;
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten hang: ");
        this.tenHang = s.nextLine();
        System.out.print("Nhap so luong: ");
        this.soLuong = s.nextFloat();
        System.out.print("Nhap don gia: ");
        this.donGia = s.nextFloat();
    }


    public static void inTieuDe() {
        System.out.printf("%-20s %-15s %-15s %-15s %n", "Ten hang", "Don gia", "So luong", "Thanh tien");
    }


    public void inDL() {
        System.out.printf("%-20s %-15.1f %-15.1f %-15.1f%n", this.tenHang, this.donGia, this.soLuong, ThanhTien());

    }
}
