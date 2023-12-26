/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NhanVienDemo {

    static NhanVien dsnv[];//=new NhanVien();
    static int n;//so phan tu mang

    static void nhapDSNV() {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap so phan tu mang n=");
        n = s.nextInt();
        //xin caps phat n phan tu cho mang
        dsnv = new NhanVien[n];
        //nhap mang
        for (int i = 0; i < n; i++) {
            System.out.print("nhap nhan vien thu" + (i + 1) + ":");
            dsnv[i] = new NhanVien();
            dsnv[i].nhap();
        }
    }

    static void inDSNV() {
        System.out.println("DS nhan vien sau khi nhap:");
        //goij ham tinh in tieu de
        NhanVien.xuatTieuDe();
        for (NhanVien nv : dsnv) {
            nv.xuat();
        }
    }

    public static void main(String[] args) {
        nhapDSNV();
        inDSNV();
    }
}
