/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class XeDemo {

    //khai báo mảng đối tượng Xe
    static Xe dsXe[];
    static int n;//số lượng xe 

    //Xây dựng hàm nhập mảng
    static void nhap() {
        System.out.print("nhap so luong xe");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.nextLine();
        //xin cấp phát mảng
        dsXe = new Xe[n];
        for (int i = 0; i < n; i++) {
            //xin cấp phát cho phần tử mảng thứ i
            dsXe[i] = new Xe();
            dsXe[i].nhap();
        }
    }

    //Xây dựng hàm in danh sách xe
    static void inDSXe() {
        //in danh sach
        Xe.xuatTieuDe();
        for (Xe x : dsXe) {
            x.xuatDL();
        }
    }

    //Xây dựng hàm main
    public static void main(String[] args) {
        int chon;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("1.Nhap thong tin xe");
            System.out.println("2.Xuat bang ke thue truoc han");
            System.out.println("3.Thoat");
            System.out.print("Lua chon");
            chon = s.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    inDSXe();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (chon != 3);
    }

}//kết thúc lớp XeDemo.
