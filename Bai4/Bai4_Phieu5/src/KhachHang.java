/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class KhachHang {

    private String hoTen, diaChi;

    public KhachHang(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public KhachHang() {
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

    @Override
    public String toString() {
        return "KhachHang{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + '}';
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten khach hang: ");
        this.hoTen = s.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = s.nextLine();
    }

    public void xuat() {
        System.out.printf("%-30s%30s%n", "Khach hang: " + this.hoTen, "Dia chi: " + this.diaChi);

    }

}
