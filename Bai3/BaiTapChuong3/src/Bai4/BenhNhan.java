/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author ADMIN
 */
public class BenhNhan extends Nguoi{
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;

    public BenhNhan() {
    }

    public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien) {
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }

    public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien, String ten, int tuoi, char gioiTinh) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
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

    public BenhVien getBenhVien() {
        return benhVien;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    @Override
    public String toString() {
        return super.toString() + "BenhNhan{" + "tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + '}';
    }

    
    
    
    
            
}
