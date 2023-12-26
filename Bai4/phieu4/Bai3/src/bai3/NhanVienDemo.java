/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NhanVienDemo {

    static int soNV, loaiNV;
    static double tongLuong = 0f;
    static NhanVien myNV[] = new NhanVien[soNV];

    static void nhapDSNV() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien=");
        soNV = s.nextInt();
        //cấp phát n biến mảng theo lớp cha
        for (int i = 0; i < soNV; i++) {
            System.out.print("1.Nhập NVSX, 2.NVVP");
            loaiNV = s.nextInt();
            if (loaiNV == 1) {
                myNV[i] = new NhanVienSX();
            } else {
                myNV[i] = new NhanVienVP();
            }
            myNV[i].nhap();
            //tính tổng lương
            tongLuong = tongLuong + myNV[i].tinhLuong()
                    + myNV[i].tinhPhuCap();
        }
    }

    static void inDSNV() {
        System.out.println("\nDanh sach nhan vien SX cong ty la ");
        NhanVienSX.inTieuDe();
        for (int i = 0; i < soNV; i++) {
            if (myNV[i] instanceof NhanVienSX) {
                myNV[i].xuatDL();
            }
        }
        System.out.println("\nDanh sach nhan vien VP cong ty la ");
        NhanVienVP.inTieuDe();
        for (int i = 0; i < soNV; i++) {
            if (myNV[i] instanceof NhanVienVP) {
                myNV[i].xuatDL();
            }
        }
        DecimalFormat f = new DecimalFormat("###,###.0#");
        System.out.println("Tong luong nhan vien:" + f.format(tongLuong));
    }

    public static void main(String[] args) {
        nhapDSNV();
        inDSNV();
    }

}
