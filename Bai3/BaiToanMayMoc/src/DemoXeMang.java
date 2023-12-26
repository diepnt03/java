/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DemoXeMang {

    static Xe dsXe[];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============Quan ly xe == == == == == == == ");
        int chon;
        do {
            System.out.print("1\tNhập danh sách xe\n");
            System.out.print("2\tIn danh sách xe\n");
            System.out.print("3\tTìm kiếm xe có trọng tải max\n");
            System.out.print("4\tXóa xe theo stt\n");
            System.out.print("5\tThoát\n");
            chon = sc.nextInt();
            switch (chon) {
                case 1 -> nhapXe();
                case 2 -> inDSXe();
                case 3 -> timXeTrongTaiMax();
                case 4 -> {
                    System.out.print("Nhập số xe cần xóa:");
                    int stt = sc.nextInt();
                    xoaXe(stt);
                }
            }
        } while (chon != 5);
    }

    public static void nhapXe() {
        Scanner s = new Scanner(System.in);
        System.out.println("nhập số lượng xe=");
        n = s.nextInt();
        dsXe = new Xe[n];
        for (int i = 0; i < n; i++) {
            Xe xe = new Xe();
            xe.nhap();
            dsXe[i] = xe;
        }
    }

    public static void inDSXe() {
        Xe.inTieuDe();
        for (Xe dsXe1 : dsXe) {
            dsXe1.inDL();
        }
    }

    public static boolean xoaXe(int stt) {
        if ((stt >= 0) && (stt < dsXe.length)) {
            //sinh viên tự hoàn thiện xóa 1 phần tử trong mảng
            return true;
        } else {
            System.out.println("vi tri xe ngoai pham vi");
            return false;
        }
    }

    public static void timXeTrongTaiMax() {
        Comparator<Xe> c = (Xe t, Xe t1) -> Float.compare(t.getTrongTai(), t1.getTrongTai());
        Xe x = Collections.max(Arrays.asList(dsXe), c);
        System.out.println("DS xe co trong tai max=");
        Xe.inTieuDe();
        float max = x.getTrongTai();
        for (Xe dsXe1 : dsXe) {
            if (dsXe1.getTrongTai() == max) {
                dsXe1.inDL();
            }
        }
    }
}
