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
public abstract class HocVien {
    private String hoTen;
    private String diaChi;
    private String loaiChuongTrinh;

    public HocVien() {
    }

    public HocVien(String hoTen, String diaChi, String loaiChuongTrinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiChuongTrinh = loaiChuongTrinh;
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

   

    public String getLoaiChuongTrinh() {
        return loaiChuongTrinh;
    }

    public void setLoaiChuongTrinh(String loaiChuongTrinh) {
        this.loaiChuongTrinh = loaiChuongTrinh;
    }

    @Override
    public String toString() {
        return "HocVien{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiChuongTrinh=" + loaiChuongTrinh + '}';
    }
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap loai chuong trinh dang ki: ");
        loaiChuongTrinh = sc.nextLine();
    }
    
    public abstract double hocPhi();
    
    public void inThongTin(){
        System.out.printf("\n %20s %20s %20s %15s",hoTen,diaChi, loaiChuongTrinh,hocPhi());
    }
    
}
