/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NhanVien {

    private String hoDem;
    private String ten;
    private NgayThang ngaySinh = new NgayThang();
    private NgayThang ngayVaoLam = new NgayThang();
    //xây dựng phương thức nhập thông tin nhân viên

    void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print(" ho dem=");
        hoDem = s.nextLine();
        System.out.print("nhap ten nhan vien=");
        ten = s.nextLine();
        System.out.println("nhap ngay, tháng, năm sinh=:");
        ngaySinh.nhap();
        System.out.println("nhap ngay, tháng, năm vao lam=:");
        ngayVaoLam.nhap();
    }
//xuất tiêu đề

    static void xuatTieuDe() {
        System.out.printf("%-15s%-10s%15s%15s%n",
                "Ho dem", "Ten", "Ngay sinh", "Ngay vao lam");
    }
//in dữ liệu

    public void xuat() {
        System.out.printf("%-15s%-10s%15s%15s%n",
                hoDem, ten, ngaySinh, ngayVaoLam);
    }

}
