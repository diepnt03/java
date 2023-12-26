/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableGUI;

/**
 *
 * @author ADMIN
 */
public class SinhVien {

    private String maSV, hoTen;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int tuoi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {

        this.maSV = maSV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "maSV=" + maSV + ", hoTen=" + hoTen + "tuoi:" + tuoi;
    }

}
