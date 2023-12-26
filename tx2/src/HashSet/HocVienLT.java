/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HocVienLT extends HocVien implements Serializable {

    private int soBuoi;
    private float donGia;
    private int loaiUuTien;

    public HocVienLT() {
    }

    public HocVienLT(int soBuoi, float donGia, int loaiUuTien) {
        this.soBuoi = soBuoi;
        this.donGia = donGia;
        this.loaiUuTien = loaiUuTien;
    }

    public HocVienLT(String hoTen, String diaChi, int soBuoi, float donGia, int loaiUuTien) {
        super(hoTen, diaChi);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
        this.loaiUuTien = loaiUuTien;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public float getDonGia() {
        return donGia;
    }

    //bắt lỗi đơn giá > 10000
    public void setDonGia(float donGia) throws Exception {
        if (donGia <= 10000) {
            throw new Exception("Đơn giá phải > 10000");
        }
        this.donGia = donGia;
    }

    public int getLoaiUuTien() {
        return loaiUuTien;
    }

    public void setLoaiUuTien(int loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }

    public void nhap() {
        try {
            super.nhapThongTin();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số buổi: ");
            setSoBuoi(sc.nextInt());
            System.out.print("Nhập đơn giá: ");
            setDonGia(sc.nextFloat());
            if(getDonGia()==0) return;
            System.out.print("Nhap loai uu tien: ");
            setLoaiUuTien(sc.nextInt());
        } catch (Exception ex) {
            System.out.println("Có lỗi: " + ex.toString());
        }
    }

    @Override
    public float hocPhi() {
        float ut = 0;
        if (loaiUuTien == 1) {
            ut = 1000000;
        } else if (loaiUuTien == 2) {
            ut = 800000;
        }
        return soBuoi * donGia - ut;
    }

    @Override
    public String toString() {
        return super.toString() + ", soBuoi= " + soBuoi + ", donGia= " + donGia + ", loaiUuTien= " + loaiUuTien + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%20s %20s %15s", soBuoi, donGia, loaiUuTien);
    }
}
