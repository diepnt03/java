/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2_th$;
import java.util.Scanner;
public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private double diemLyThuyet;
    private double diemThucHanh;
    public static Scanner scanner = new Scanner(System.in);

    public SinhVien(){};
    public SinhVien(int maSinhVien, String hoTen, double diemLyThuyet, double diemThucHanh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public double tinhDiemTrungBinh() {
        return (diemLyThuyet + diemThucHanh) / 2;
    }
    public String xepLoai(){
        if(this.tinhDiemTrungBinh() >= 5)
            return "Dat";
        else 
            return "Truot";
    }
    public void input(){
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Diem ly thuyet: ");
        diemLyThuyet = scanner.nextDouble();
        System.out.print("Diem thuc hanh: ");
        diemThucHanh = scanner.nextDouble();
        
    }
    public void output(){
        System.out.printf("%-15s%-20s%-15s%-15s%-15s%-15s\n",this.maSinhVien,hoTen,diemLyThuyet,this.diemThucHanh, this.tinhDiemTrungBinh(), this.xepLoai());
    }
    
    @Override
    public String toString() {
        return "Ma sinh vien: " + this.maSinhVien + ", Ho ten: " + this.hoTen + ", Diem ly thuyet: " + this.diemLyThuyet
                + ", Diem thuc hanh: " + this.diemThucHanh + ", Diem trung binh: " + tinhDiemTrungBinh()+ "Xep loai: "+xepLoai();
    }
}