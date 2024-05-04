/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeSet;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Demo {
//các đối tượng của TreeSet được lưu trữ theo thứ tự tăng dần

    static TreeSet<HocVienDH> ts = new TreeSet<HocVienDH>();
    private static DBEngine db = new DBEngine();

    public static void fakeHocVien() {
        HocVienDH hv1 = new HocVienDH("Nguyễn Thị Điệp", "Vĩnh Phúc", "Đồ Họa", 1, 10, 25000);
        HocVienDH hv2 = new HocVienDH("Nguyễn Thị Linh", "Hà Nội", "Đồ Họa", 2, 19, 25000);
        HocVienDH hv3 = new HocVienDH("Nguyễn Văn Thuật", "Hà Nam", "Đồ Họa", 1, 15, 22000);
        HocVienDH hv4 = new HocVienDH("Nguyễn Văn Thuật", "Hà Nam", "Đồ Họa", 1, 15, 22000);

        ts.add(hv1);
        ts.add(hv2);
        ts.add(hv3);
        ts.add(hv4);

    }

    public static void title() {
        System.out.printf("\n%20s %20s %15s %15s", "Họ Tên", "Địa Chỉ", "Loại CT", "Học Phí");
    }

    public static void xuat() {
        Iterator bir = ts.iterator();
        while (bir.hasNext()) {
            System.out.println(bir.next());
        }
    }

    public static void nhapBS() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\nDừng nhập nếu tên trống");
            HocVienDH x = new HocVienDH();
            x.nhap();
            if (x.getHoTen().trim().length() == 0) {
                return;
            }
            ts.add(x);
            return;
        }
    }

    //đưa ra tên học viên có địa chỉ nhập từ bàn phím
    public static void ttinSV(String que) {
        Iterator<HocVienDH> bir = ts.iterator();
        while (bir.hasNext()) {
            HocVienDH a = bir.next();
            if (a.getDiaChi().trim().compareToIgnoreCase(que) == 0) {
                System.out.println(a);
            }
        }
    }

    //luu phòng thi vào file
    public static void luuFile() {
        try {
            db.LuuFile("D:\\hocVienDH.txt", ts);
            System.out.println("Lưu file thành công");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    //đọc file lưu trở lại phòng thi
    public static void docFile() {
        try {
            ts = (TreeSet) db.docFile("D:\\hocVienDH.txt");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //title();
        fakeHocVien();
        xuat();

        nhapBS();
        System.out.println("\nDanh sách sau khi nhập bổ sung");
        xuat();

        System.out.println("Học viên có học phí cao nhất");
        HocVienDH maxHP = Collections.max(ts, new MaxHocPhi());
        System.out.println(maxHP);

        String dc;
        System.out.print("Nhập địa chỉ sinh viên muốn tìm: ");
        dc = s.nextLine();
        ttinSV(dc);

        luuFile();
        docFile();
    }
}
