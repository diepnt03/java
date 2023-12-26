/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList_DuLieuTuTao;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Nguoi {

    private String soCMND;
    private String ten;
    private int tuoi;
    
    //Xây dựng hàm tạo
    public Nguoi(String soCMND) {
        this.soCMND = soCMND;
    }

    public Nguoi(String soCMND, String ten, int tuoi) {
        this.soCMND = soCMND;
        this.ten = ten;
        this.tuoi = tuoi;
    }
    
    //xây dựng các hàm get/set
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }
    
    //Ghi đè hàm hashCode & equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.soCMND);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nguoi other = (Nguoi) obj;
        return Objects.equals(this.soCMND, other.soCMND);
    }

    @Override
    public String toString() {
        return "soCMND=" + soCMND + ", ten="
                + ten + ", tuoi=" + tuoi;
    }
}//end of class Nguoi
