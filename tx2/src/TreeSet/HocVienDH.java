/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeSet;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
//các đối tượng thêm vào TreeSet phải được tạo ra từ lớp thực thi interface Comparable
//và viết đè phương thức compareTo()
public class HocVienDH extends HocVien implements Comparable<HocVienDH> ,Serializable{

    private int loaiUuTien;
    private int soBuoi;
    private double donGiaDH;

    public HocVienDH() {
    }

    public HocVienDH(int loaiUuTien, int soBuoi, double donGia) {
        this.loaiUuTien = loaiUuTien;
        this.soBuoi = soBuoi;
        this.donGiaDH = donGia;
    }

    public HocVienDH(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, int soBuoi, double donGia) {
        super(hoTen, diaChi, loaiChuongTrinh);
        this.loaiUuTien = loaiUuTien;
        this.soBuoi = soBuoi;
        this.donGiaDH = donGia;
    }

    public int getLoaiUuTien() {
        return loaiUuTien;
    }

    public void setLoaiUuTien(int loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    //số buổi > 0
    public void setSoBuoi(int soBuoi) throws Exception {
        if (soBuoi <= 0) {
            throw new Exception("Số buổi phải > 0");
        }
        this.soBuoi = soBuoi;
    }

    public double getDonGia() {
        return donGiaDH;
    }

    public void setDonGia(double donGia) {
        this.donGiaDH = donGia;
    }

    @Override
    public String toString() {
        return super.toString() + ", loaiUuTien=" + loaiUuTien + ", soBuoi=" + soBuoi + ", donGiaDH=" + donGiaDH + ", hocPhi=" + hocPhi()+'}';
    }

    public void nhap() {
        try {
            super.nhapThongTin();
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap loai uu tien: ");
            setLoaiUuTien ( sc.nextInt());
            System.out.print("Nhap so buoi: ");
            setSoBuoi ( sc.nextInt());
            System.out.print("Nhap don gia do hoa: ");
            setDonGia ( sc.nextDouble());
        } catch (Exception ex) {
            System.out.print("có lỗi: " + ex.toString());
        }
    }

    @Override
    public double hocPhi() {
        float uuTien;
        uuTien = switch (loaiUuTien) {
            case 1 ->
                1000000;
            case 2 ->
                500000;
            default ->
                0;
        };
        return soBuoi * donGiaDH - uuTien;
    }

    @Override
    public int compareTo(HocVienDH o) {
        return this.getSoBuoi() - o.getSoBuoi();
    }
}
