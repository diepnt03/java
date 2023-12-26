/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
//set sẽ không bao giờ có hai phần tử giống nhau
//nghĩa là thêm cùng 1 đối tượng ở lần thêm t2 sẽ kh có tác dụng
public class Demo {

    //HashSet không duy trì thứ tự phần tử khi add
    static HashSet<HocVienLT> hs = new HashSet<HocVienLT>();
    private static DBEngine db = new DBEngine();

    public static void fakeHVLT() {
        HocVienLT hv1 = new HocVienLT("Nguyễn Thị Điệp", "Vĩnh Phúc", 10, 25000, 1);
        HocVienLT hv2 = new HocVienLT("Nguyễn Thị Linh", "Hà Nội", 19, 22000, 2);
        HocVienLT hv3 = new HocVienLT("Nguyễn Văn Thuật", "Hà Nam", 15, 25000, 1);

        hs.add(hv1);
        hs.add(hv2);
        hs.add(hv3);
        hs.add(hv3); //câu lệnh này kh có tác dụng

    }

    public static void xuat() {
        Iterator bir = hs.iterator();
        while (bir.hasNext()) {
            System.out.println(bir.next());
        }
    }

    public static void nhapBS() {
        Scanner s = new Scanner(System.in);

        /*while (true) {
            System.out.println("\nDừng nhập nếu đơn giá = 0");
            HocVienLT x = new HocVienLT();
            x.nhap();
            if (x.getDonGia() == 0) {
                return;
            }
            hs.add(x);
        }*/
        
        //check trùng tên
        HocVienLT x = new HocVienLT();
            x.nhap();
            if (hs.contains(x)) {
                System.out.println("Tên đã tồn tại");
                return;
            }
            hs.add(x);
        
    }

    public static void hvUTL1() {
        System.out.println("Danh sách học viên ưu tiên loại 1");
        /*for (HocVienLT x : hs) {
            if (x.getLoaiUuTien() == 1) {
                System.out.println(x);
            }
        }*/

        Iterator<HocVienLT> bir = hs.iterator();
        while (bir.hasNext()) {
            HocVienLT x = bir.next();
            if (x.getLoaiUuTien() == 1) {
                System.out.println(x);
            }
        }
    }

    //sắp xếp theo tăng dần số buổi
    public static void sapXep() {
        ArrayList<HocVienLT> list = new ArrayList(hs);
        SapXep sx = new SapXep();
        Collections.sort(list, sx);
        System.out.println("Danh sách học viên sau khi sắp xếp tăng dần số buổi");
        Iterator bir = list.iterator();
        while (bir.hasNext()) {
            System.out.println(bir.next());
        }
    }

    //tìm học viên có số buổi lớn nhất
    public static void MaxSoBuoi() {
        //  ArrayList<HocVienLT> list = new ArrayList(hs);
        HocVienLT max = Collections.max(hs, new SapXep());
        System.out.println("Danh sách học viên có số buổi lớn nhất");
        Iterator<HocVienLT> bir = hs.iterator();
        while (bir.hasNext()) {
            HocVienLT x = bir.next();
            if (x.getSoBuoi() == max.getSoBuoi()) {
                System.out.println(x);
            }
        }
    }

    //luu phòng thi vào file
    public static void luuFile() {
        try {
            db.LuuFile("D:\\hocVienLT.txt", hs);
            System.out.println("Lưu file thành công");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    //đọc file lưu trở lại phòng thi
    public static void docFile() {
        try {
            hs = (HashSet) db.docFile("D:\\hocVienLT.txt");
            Iterator ir = hs.iterator();
            while (ir.hasNext()) {
                System.out.println(ir.next());
            }
            System.out.println("Doc file thanh cong");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }

    public static void main(String[] args) {
        fakeHVLT();
        xuat();

        nhapBS();
        System.out.println("\nDanh sách sau khi nhập bổ sung");
        xuat();

        hvUTL1();

        sapXep();
        
        MaxSoBuoi();
        luuFile();
        docFile();

    }
}
