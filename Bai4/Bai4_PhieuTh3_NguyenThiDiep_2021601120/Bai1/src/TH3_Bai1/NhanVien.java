/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH3_Bai1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String maNV;
    private int soSP;
    public NhanVien(){
    }
    public NhanVien(String ma, int soSP){
        this.maNV = ma;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String ma) {
        if(maNV.length() != 0) this.maNV = ma;
        else{
            System.out.println("Ma nhan vien khong duoc bo trong!");
        }
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if(soSP > 0) this.soSP = soSP;
        else{
            System.out.println("So san pham pahi lon hon 0!");
        }  
    }
    public boolean coVuotChuan(){
        return soSP > 500;
    } 
    public String getTongKet(){
        if(coVuotChuan()) return "Vuot";
        else return "";
    }
    public double getLuong(){
        if(coVuotChuan()){
            return (double)500*20000 + (soSP-500)*30000;
        } 
        else{
            return (double)soSP*20000;
        }
    }
    public static void XuatTieuDe(){
        //System.out.println("Ma nhan vien \t So san pham \t Luong \t\t Tong ket");
        System.out.printf("%-15s%-10s%15s%15s%n","Ma nhan vien", "So san pham", "Luong", "Tong ket");
    }
    @Override
    public String toString(){
        return maNV + "\t" + soSP + "\t" + getLuong() + "\t" +  getTongKet();
    }
    public void inDL(){
        //long luong = getLuong();
        //String a = Long.toString(luong);
        System.out.printf("%-15s%-10s%15s%15s%n",maNV, soSP, getLuong(), getTongKet());
       // System.out.println(maNV + "\t\t" + soSP + "\t\t" + getLuong().toPlainString + "\t\t" +  getTongKet());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien[] NV= new NhanVien[2];
        for(int i=0; i<2; i++){
            NV[i] = new NhanVien();
            System.out.println("Nhap thong tin sinh vien thu " + (i+1) + ":");
            System.out.print("Ma nhan vien: ");
            NV[i].maNV = sc.nextLine();
            System.out.print("So san pham: ");
            NV[i].soSP = sc.nextInt();
            sc.nextLine();
        }
        //Xuat TT:
        System.out.println("\tTHONG TIN NHAN VIEN");
        XuatTieuDe();
        for(int i=0; i<2; i++){
            NV[i].inDL();
        }
        //DS nVien vuowt chuan:
        System.out.println("\tDANH SACH NHAN VIEN VUOT CHUAN");
        XuatTieuDe();       
        for(int i=0; i<2; i++){
            if(NV[i].coVuotChuan()) NV[i].inDL();
        }
    }
}
