/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_th$;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    private static Scanner scanner= new Scanner(System.in);
    
    public static void main(String[] args) {

        SinhVien sv1 = new SinhVien(1, "Nguyen Van D", 8.5, 7.5);
        SinhVien sv2 = new SinhVien(2, "Tran Thi B", 6.5, 8.0);
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhap thong tin sinh vien 3:");
        sv3.input();
    // Add the SinhVien objects to the danhSachSinhVien ArrayList
    danhSachSinhVien.add(sv1);
    danhSachSinhVien.add(sv2);
    danhSachSinhVien.add(sv3);

//Ham hien thi danh sach sinh vien
         System.out.println("----------Danh sach sinh vien------");
        xuatSV();
         System.out.println("Thong tin sinh vien co diem trung binh thap nhat");
         hienThiSinhVienDiemTBMin();
         System.out.println("Thong tin sinh vien co diem trung binh cao nhat");
         hienThiSinhVienDiemTBMax();
//ham xet dau hay rot

//Sap xep danh sach
System.out.println("Danh sach sinh vien sau khi sap xep");
    sapXep(danhSachSinhVien);
    xuatSV();
    }

    private static void xuatSV(){
         System.out.printf("%-15s%-20s%-15s%-15s%-15s%-15s\n","Ma SV","Ho ten","Diem LT","Diem TH","Diem TB","Xep loai");
         for(int i  =  0; i <  danhSachSinhVien.size(); i++){
             danhSachSinhVien.get(i).output();
         }
    }
    //Tim nguoi co diem cao nhat
        private static double findMin(){
            double min =  danhSachSinhVien.get(0).tinhDiemTrungBinh();
            for(SinhVien sv:danhSachSinhVien){
                min = (sv.tinhDiemTrungBinh() < min ) ?sv.tinhDiemTrungBinh() : min;
            }
            return min;
        }
        private static void hienThiSinhVienDiemTBMin(){
            double min = findMin();
          System.out.printf("%-15s%-20s%-15s%-15s%-15s%-15s\n","Ma SV","Ho ten","Diem LT","Diem TH","Diem TB","Xep Loai");
          for(SinhVien sv:danhSachSinhVien){
              if(sv.tinhDiemTrungBinh() == min){
                  sv.output();
              }
          }
        }
           //Tim nguoi co diem cao nhat
        private static double findMax(){
            double max=  danhSachSinhVien.get(0).tinhDiemTrungBinh();
            for(SinhVien sv:danhSachSinhVien){
                max= (sv.tinhDiemTrungBinh() >  max ) ?sv.tinhDiemTrungBinh() : max;
            }
            return max;
        }
        private static void hienThiSinhVienDiemTBMax(){
            double max = findMax();
          System.out.printf("%-15s%-20s%-15s%-15s%-15s%-15s\n","Ma SV","Ho ten","Diem LT","Diem TH","Diem TB","Xep Loai");
          for(SinhVien sv:danhSachSinhVien){
              if(sv.tinhDiemTrungBinh() ==  max){
                  sv.output();
              }
          }
        }
        //Sap xep theo ten
private static void sapXep(ArrayList<SinhVien> danhSachSinhVien) {
    for (int i = 0; i < danhSachSinhVien.size() - 1; i++) {
        for (int j = i + 1; j < danhSachSinhVien.size(); j++) {
            if (danhSachSinhVien.get(i).getHoTen().length() == danhSachSinhVien.get(j).getHoTen().length()) {
                if (danhSachSinhVien.get(i).getDiemLyThuyet() > danhSachSinhVien.get(j).getDiemLyThuyet()) {
                    SinhVien temp = danhSachSinhVien.get(i);
                    danhSachSinhVien.set(i, danhSachSinhVien.get(j));
                    danhSachSinhVien.set(j, temp);
                }
            } else if (danhSachSinhVien.get(i).getHoTen().length() > danhSachSinhVien.get(j).getHoTen().length()) {
                SinhVien temp = danhSachSinhVien.get(i);
                danhSachSinhVien.set(i, danhSachSinhVien.get(j));
                danhSachSinhVien.set(j, temp);
            }
        }
    }
}
        
}