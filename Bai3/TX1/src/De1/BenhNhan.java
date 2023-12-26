/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BenhNhan extends Nguoi {

    private String tienSu;
    private String chanDoan;

    public BenhNhan() {
    }

    public BenhNhan(String tienSu, String chanDoan) {
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
    }

    public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan.toUpperCase();
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    @Override
    public String toString() {
        return super.toString() + "BenhNhan{" + "tienSu=" + tienSu + ", chanDoan=" + chanDoan + '}';
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tien su: ");
        tienSu = sc.nextLine();
        System.out.print("Nhap vao chan doan: ");
        chanDoan = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%20s %20s", tienSu, chanDoan);
    }
}
