/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList_DulieuNguyenThuy;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Arr_Mang {
    static ArrayList<Integer> dayso = new ArrayList<Integer>();
    
    //Xây dựng hàm nhập sinh số ngẫu nhiên không trùng nhau
    public static void nhapDS() {
        Random rd = new Random();
        int i, dem = 0;
        while (dem < 10) {
            i = rd.nextInt(100) + 1;
            if (dayso.contains(i)) {
                System.out.println("phần tử: " + i + "đã tồn tại:");
            } else {
                dayso.add(i);
            }
            dem++;
        }
    }

    // Xây dựng hàm in dãy số sử dụng Iterator
    public static void inDaySo() {
        Iterator<Integer> myIt = dayso.iterator();
        while (myIt.hasNext()) {
            System.out.print(myIt.next() + ", ");
        }
    }
    
    //Sử dụng lớp tiện ích hỗ trợ sắp xếp phần tử tăng dần
    public static void sapDaySo() {
        Collections.sort(dayso);
        System.out.println("ds sau khi sắp là:");
        inDaySo();
    }
    
    //Sử dụng lớp tiện ích tìm phần tử nhỏ nhất trong dãy
    public static int timMin() {
        int min = Collections.min(dayso);
        return min;
    }
    
    //xóa phần tử trong dãy số
    public static void xoaPhanTu() {
        System.out.println("\nNhập vị trí xóa= ");
        Scanner s = new Scanner(System.in);
        int vitri = s.nextInt();
        if ((vitri < 0) || (vitri > dayso.size())) {
            System.out.println("Chỉ số không đúng!");
        } else {
            dayso.remove(vitri);
        }
        System.out.println("Danh sách sau khi xóa:");
        inDaySo();
    }
    
    //Hàm main vận hành bài toán.
    public static void main(String[] args) {
        nhapDS();
        System.out.println("Dãy số sau khi nhập:");
        inDaySo();
        System.out.println("\nphan tu nho nhat: " + timMin());
        sapDaySo();
        xoaPhanTu();
    }
}
