/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedHashSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Demo {
    //giống HashSet ngoại trừ thứ tự các phần tử trong set là thứ tự khi add
    static LinkedHashSet<SinhVien> lhs = new LinkedHashSet<SinhVien>();
    private static DBEngine db = new DBEngine();

    public static void fakeData() {
        SinhVien sv1 = new SinhVien("Nguyễn Thị Điệp", 19, 'F', "HTTT01", "Hệ thống thông tin");
        SinhVien sv2 = new SinhVien("Nguyễn Văn Thuật", 21, 'M', "DD02", "Dinh dưỡng");
        SinhVien sv3 = new SinhVien("Nguyễn Thị Linh", 18, 'F', "CD04", "Sale");

        lhs.add(sv1);
        lhs.add(sv2);
        lhs.add(sv3);
    }

    public static void xuat() {
        Iterator ir = lhs.iterator();
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }
    }

    public static void nhapBS() {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nDừng nhập nếu tên rỗng");
            SinhVien x = new SinhVien();
            System.out.print("Nhập tên: ");
            x.setTen(s.nextLine());
            if (x.getTen().trim().length() == 0) {
                return;
            }
            try {
                System.out.print("Nhập tuổi: ");
                x.setTuoi(s.nextInt());
            } catch (Exception ex) {
                System.out.println("Có lỗi: " + ex.toString());
                return;
            }
            System.out.print("Nhập giới tính (M: Nam / F: Nữ): ");
            x.setGioiTinh(s.next().charAt(0));
            s.nextLine();
            System.out.print("Nhập lớp: ");
            x.setLop(s.nextLine());
            System.out.print("Nhập ngành: ");
            x.setNganh(s.nextLine());
            lhs.add(x);
        }
    }
    
    //những sinh viên có tuổi cao nhất
    public static void maxTuoi(){
       SinhVien x = Collections.max(lhs,new MaxTuoi());
       Iterator<SinhVien> ir = lhs.iterator();
        while (ir.hasNext()) {
            SinhVien a=ir.next();
            if(a.getTuoi()== x.getTuoi())
                System.out.println(a);
        }
    }

    //luu phòng thi vào file
    public static void luuFile() {
        try {
            db.LuuFile("D:\\SinhVien.txt", lhs);
            System.out.println("Lưu file thành công");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    //đọc file lưu trở lại phòng thi
    public static void docFile() {
        try {
            lhs = (LinkedHashSet) db.docFile("D:\\SinhVien.txt");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }
    
    public static void main(String[] args) {
        fakeData();
        System.out.println("Dữ liệu mẫu");
        xuat();
        
        nhapBS();
        System.out.println("Danh sách sinh viên sau khi nhập bổ sung");
        xuat();
        
        System.out.println("Danh sách sinh viên có tuổi bằng sinh viên lớn tuổi nhất");
        maxTuoi();
        
        luuFile();
        docFile();
    }
}
