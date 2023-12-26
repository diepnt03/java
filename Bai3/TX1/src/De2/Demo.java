/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class Demo {

    public static void main(String[] args) {
        ArrayList<KySu> ks = new ArrayList<>();
        System.out.println("Danh sach ky su ban dau: ");
        title();
        fakeData(ks);

        nhapBS(ks);
        System.out.println("Danh sach ky su sau khi nhap them: ");
        title();
        for (KySu ks1 : ks) {
            ks1.inThongTin();
        }

        System.out.println("\nKy su co luong thap nhat:");
        title();
        for (KySu ks1 : ks) {
            if (ks1.tinhLuong() == min(ks).tinhLuong()) {
                ks1.inThongTin();
            }
        }
    }

    public static void fakeData(ArrayList<KySu> ks) {
        KySu k1 = new KySu("Nguyen Van A", "Ha Noi", "Ky Su", 7000000, 1.2, 27);
        KySu k2 = new KySu("Nguyen Van B", "Hai Phong", "Ky Su", 6000000, 1.1, 25);
        KySu k3 = new KySu("Nguyen Van C", "Ha Nam", "Ky Su", 5000000, 1.0, 28);

        ks.add(k1);
        ks.add(k2);
        ks.add(k3);

        for (KySu ks1 : ks) {
            ks1.inThongTin();
        }
    }

    public static void title() {
        System.out.printf("\n %20s %20s %20s %15s", "Ho Ten", "Dia Chi", "Loai LD", "Luong Thang");
    }

    public static void nhapBS(ArrayList<KySu> ks) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("\nNhap them ky su: ");
        while (true) {
            System.out.println("\nKy su " + (i + 1));
            KySu b = new KySu();
            b.nhap();
            if (b.getHeSoLuong() < 0) {
                return;
            }
            ks.add(b);
            i++;
        }
    }

    public static KySu min(ArrayList<KySu> ks) {
         KySu nguoiLuongThapNhat = Collections.min(ks, new Comparator<KySu>() {
            @Override
            public int compare(KySu k1, KySu k2) {
                return Double.compare(k1.tinhLuong(), k2.tinhLuong());
            }
        });

        return nguoiLuongThapNhat;
    }
}
