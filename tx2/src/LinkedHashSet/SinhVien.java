/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedHashSet;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SinhVien extends Nguoi implements Serializable {

    private String lop;
    private String nganh;

    public SinhVien() {
    }

    public SinhVien(String lop, String nganh) {
        this.lop = lop;
        this.nganh = nganh;
    }

    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return super.toString() + ", lop=" + lop + ", nganh=" + nganh + '}';
    }

}
