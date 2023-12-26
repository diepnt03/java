/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList_DuLieuTuTao;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class NguoiDemo {

    //Khai báo danh sách
    static ArrayList<Nguoi> list = new ArrayList<Nguoi>();

    static void fakeData() {
        Nguoi p1 = new Nguoi("001", "Hong", 20);
        Nguoi p2 = new Nguoi("002", "lan", 21);
        Nguoi p3 = new Nguoi("003", "Hương", 22);
        Nguoi p4 = new Nguoi("004", "Hải", 23);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
    }

    public void nhapDS() {
        /*nhập minh họa ds người có số cmnd không trùng nhau 
        nhập ds người dừng lại khi tên là trống*/
         
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Dừng nhập nếu tên trống");
            System.out.print("Nhap cmnd=");
            Nguoi p5 = new Nguoi(s.nextLine());
            if (list.contains(p5)) {
                System.out.println("CMND đã tồn tại");
            } else {
                System.out.print("nhập tên:");
                p5.setTen(s.nextLine());
                if (p5.getTen().trim().length() == 0) {
                    break;
                }
                System.out.print("nhập tuổi:");
                p5.setTuoi(s.nextInt());
                list.add(p5);
                s.nextLine();
            }
        }
    }
    
    //In danh sách sử dụng Iterator
    static void inDS() {
        Iterator<Nguoi> myIt = list.iterator();
        while (myIt.hasNext()) {
            System.out.println(myIt.next() + ",");
        }
    }

    //sắp xếp theo tên sử dụng lớp tiện ích Comparator
    static void sapXep() {
        Comparator<Nguoi> c = new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi t, Nguoi t1) {
                return t.getTen().compareToIgnoreCase(t1.getTen());
                //so sánh không phân biệt chữ hoa thường
            }
        };
        Collections.sort(list, c);
    }

    //Tìm kiếm người có chứng minh nhân dân nhập vào sử dụng contains
    static void timKiem(String cmtndTim) {
        int vitri;
        Nguoi pTim = new Nguoi(cmtndTim);
        vitri = list.indexOf(pTim);
        if (list.contains(pTim)) {
            System.out.println("\n CMND=" + cmtndTim + " thấy ở vị trí:" + vitri);
            System.out.println(list.get(vitri).toString());
        } else {
            System.out.println("khong tim duoc thong tin");
        }
    }

    //hàm main vận hành
    public static void main(String[] args) {

        fakeData();
        Scanner s = new Scanner(System.in);

        //nhapDS();
        System.out.println("Danh sách sau khi nhập");
        inDS();
        System.out.println("Nhập CMND cần tìm");
        String cmtndTim = s.nextLine();
        timKiem(cmtndTim);
        sapXep();
        System.out.println("DS sau khi sắp theo tên:");
        inDS();
    }

}//end of class NguoiDemo

