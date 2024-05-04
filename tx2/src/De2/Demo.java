/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Demo {
    static CongNhanManagement test = new CongNhanManagement();
    public static void nhapBS() {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nDừng nhập nếu mã rỗng");
            CongNhan x = new CongNhan();
            System.out.print("Nhập mã công nhân: ");
            x.setMaCN(s.nextLine());
            if (x.getMaCN().trim().length() == 0) {
                return;
            }
            try {
                System.out.print("Nhập tên công nhân: ");
                x.setTenCN(s.nextLine());
            } catch (Exception ex) {
                System.out.println("Có lỗi: " + ex.toString());
                return;
            }

            System.out.print("Nhập ca làm việc (1: ca 1 / 2: ca 2 / 3 : ca 3): ");
            int ca = s.nextInt();
            switch (ca) {
                case 1 -> x.setCaLamViec(CaType.Ca1);
                case 2 -> x.setCaLamViec(CaType.Ca2);
                case 3 -> x.setCaLamViec(CaType.Ca3);
                default -> {
                }
            }
            s.nextLine();
            try {
                System.out.print("Nhập tong gio lam: ");
                x.setTongGioLam(s.nextInt());
            } catch (Exception ex) {
                System.out.println("Có lỗi: " + ex.toString());
                return;
            }
            s.nextLine();
            CongNhanManagement.lhs.add(x);
        }
    }
    
    public static void main(String[] args) {
        test.inputData();
        System.out.println("Dữ liệu mẫu");
        test.outputData();
        
        nhapBS();
        System.out.println("Danh sách công nhân sau khi nhập bổ sung");
        test.outputData();
        
        System.out.println("Công nhân có số giờ làm nhỏ nhất");
        CongNhanManagement.timMin();
        
        test.saveDataToFile();
        test.getDataFromFile();
    }

}
