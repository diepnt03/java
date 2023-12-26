/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienForm;

/**
 *
 * @author ADMIN
 */
public class SinhVienDTO {

    private String masv, hoten, malop, ketqua;
    private float diem1, diem2, diemtb;

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getMalop() {
        return malop;
    }

    public String getKetqua() {
        return ketqua;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public boolean ketQua() {
        if (TongDiem() < 5) {
            return true;
        } else {
            return false;
        }
    }

    public float TongDiem() {
        float tong = 0f;
        tong = (diem1 + diem2) / 2;
        return tong;
    }

    public String DanhGia() {
        return (ketQua() ? "Rot" : "Dau");
    }

    public SinhVienDTO() {
    }

    public SinhVienDTO(String masv, String hoten, String malop, float diem1, float diem2, float diemtb, String kq) {
        this.masv = masv;
        this.hoten = hoten;
        this.malop = malop;
        this.ketqua = kq;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diemtb = TongDiem();
        this.ketqua = DanhGia();
    }

}
