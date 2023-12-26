/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DoanhNghiep {

    private String tenDN;
    private String soDT;
    private String diaChi;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên DN, số điện thoại, địa chỉ:");
        tenDN = sc.nextLine();
        soDT = sc.nextLine();
        diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "(" + tenDN + "," + soDT + "," + diaChi + ")";
    }
}
