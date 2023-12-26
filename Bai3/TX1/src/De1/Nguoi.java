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
public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + (gioiTinh == 'M' ? "Nam" : (gioiTinh == 'F' ? "Nu" : "Unknown"))+ '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap vao tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap vao gioi tinh: ");
        gioiTinh = sc.next().charAt(0);        
    }
    
    public void xuat(){
        System.out.printf("\n%20s %10d %15s",ten,tuoi,(gioiTinh == 'M' ? "Nam" : (gioiTinh == 'F' ? "Nu" : "Unknown")));
    }
}
