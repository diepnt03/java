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
public abstract class NguoiLaoDong {
    private String hoTen;
    private String diaChi;
    private String loaiLaoDong;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLaoDong = loaiLaoDong;
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

    public String getLoaiLaoDong() {
        return loaiLaoDong;
    }

    public void setLoaiLaoDong(String loaiLaoDong) {
        this.loaiLaoDong = loaiLaoDong;
    }

    @Override
    public String toString() {
        return "NguoiLaoDong{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiLaoDong=" + loaiLaoDong + '}';
    }
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        do{
            System.out.print("\tNhap loai lao dong:\n1. Lao dong pho thong\n2. Ky su\n");
            this.loaiLaoDong = sc.nextLine();
        }while(this.loaiLaoDong.compareTo("Lao dong pho thong") != 0 && this.loaiLaoDong.compareTo("Ky su") != 0);
    }
    
    public abstract double tinhLuong();
    
    public void inThongTin(){
        System.out.printf("\n %20s %20s %20s %15s",hoTen,diaChi, loaiLaoDong,tinhLuong());
    }
    
}
