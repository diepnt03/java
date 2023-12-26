/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
//để đọc và ghi đối tượng vào file thì đối tượng phải được
//tạo ra từ lớp thực thi interface Serializable
public abstract class HocVien implements Serializable {

    private String hoTen;
    private String diaChi;
   // private String loaiChuongTrinh;
    private enum loaiChuongTrinh{
        LapTrinh, DoHoa;
    };


    public HocVien() {
    }

    public HocVien(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

   

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

   

    @Override
    public String toString() {
        return "HocVien{" + "hoTen= " + hoTen + ", diaChi= " + diaChi + ", loaiChuongTrinh= " + loaiChuongTrinh.LapTrinh;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        setDiaChi(sc.nextLine());
    }

    public abstract float hocPhi();

    public void inThongTin() {
        System.out.printf("\n%20s %20s %15s %15s", hoTen, diaChi, loaiChuongTrinh.LapTrinh, hocPhi());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HocVien other = (HocVien) obj;
        return Objects.equals(this.hoTen, other.hoTen);
    }
    
    
}
