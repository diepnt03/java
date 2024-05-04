
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class CongNhan implements Serializable{
    private String maCN;
    private String tenCN;
    private CaType caLamViec;
    private int tongGioLam;

    public CongNhan() {
    }

    public CongNhan(String maCN, String tenCN, CaType caLamViec, int tongGioLam) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.caLamViec = caLamViec;
        this.tongGioLam = tongGioLam;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) throws Exception{
        if(tenCN == null) throw new Exception("Tên phải khác rỗng");
        this.tenCN = tenCN;
    }

    public CaType getCaLamViec() {
        return caLamViec;
    }

    public void setCaLamViec(CaType caLamViec) {
        this.caLamViec = caLamViec;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) throws Exception{
        if (tongGioLam < 10) throw new Exception("Tổng số giờ làm >= 10");
        this.tongGioLam = tongGioLam;
    }

    @Override
    public String toString() {
        return "CongNhan{" + "maCN=" + maCN + ", tenCN=" + tenCN + ", caLamViec=" + caLamViec + ", tongGioLam=" + tongGioLam + '}';
    }
    
    
    
    
}
