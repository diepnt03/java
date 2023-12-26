/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Demo {

    public static void main(String[] args) {
        ArrayList<BenhNhan> bn = new ArrayList<>();
        System.out.println("Danh sach benh nhan ban dau: ");
        title();
        fakeData(bn);

        nhapBS(bn);
        System.out.println("Danh sach benh nhan sau khi nhap them: ");
        title();
        for (BenhNhan bn1 : bn) {
            bn1.xuat();
        }
        
        sapXep(bn);
        System.out.println("\nDanh sach benh nhan sau khi sap xep: ");
        title();
        for (BenhNhan bn1 : bn) {
            bn1.xuat();
        }
        
        bn.remove(2);
        System.out.println("\nDanh sach benh nhan sau khi xoa: ");
        title();
        for (BenhNhan bn1 : bn) {
            bn1.xuat();
        }
        
        int pos = Collections.binarySearch(bn,new BenhNhan(null,30,' ',null,null), new TimKiem());
        System.out.println("\nDanh sach benh nhan 30 tuoi: ");
        title();
        for(BenhNhan b:bn){
            if(b.getTuoi() == bn.get(pos).getTuoi())
                b.xuat();
        }

    }

    public static void fakeData(ArrayList<BenhNhan> bn) {
        BenhNhan b1 = new BenhNhan("Nguyen Van A", 40, 'M', "Benh Tim", "Ung Thu 1");
        BenhNhan b2 = new BenhNhan("Nguyen Thi B", 25, 'F', "Benh Gan", "Ung Thu 2");
        BenhNhan b3 = new BenhNhan("Nguyen Van C", 30, 'M', "Benh Phoi", "Ung Thu 3");

        bn.add(b1);
        bn.add(b2);
        bn.add(b3);

        for (BenhNhan bn1 : bn) {
            bn1.xuat();
        }
    }

    public static void title() {
        System.out.printf("\n%20s %10s %15s %20s %20s", "Ten", "Tuoi", "Gioi Tinh", "Tien Su", "Chan Doan");
    }

    public static void nhapBS(ArrayList<BenhNhan> bn) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("\nNhap so luong benh nhan can bo sung: ");
        n = sc.nextInt();
        int i = 0;

        do {
            System.out.println("Benh nhan " + (i + 1));
            BenhNhan b = new BenhNhan();
            b.nhap();
            if (b.getTen().isEmpty()) {
                return;
            }
            bn.add(b);
            i++;
        } while (i < n);
    }

    public static void sapXep(ArrayList<BenhNhan> bn) {
        Collections.sort(bn, new Comparator<BenhNhan>() {
            @Override
            public int compare(BenhNhan b1, BenhNhan b2) {
                if (b1.getTuoi() != b2.getTuoi()) {
                    return b1.getTuoi() - b2.getTuoi();
                }
                return b1.getChanDoan().compareTo(b2.getChanDoan());
            }
        });
    }
    
   
    
}
