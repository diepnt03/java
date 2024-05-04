/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class TimMin implements Comparator<CongNhan>{
    @Override
    public int compare(CongNhan o1, CongNhan o2){
        int gioLam1 = o1.getTongGioLam();
        int gioLam2 = o2.getTongGioLam();

        // So sánh theo số giờ làm trước
        int compareGioLam = Integer.compare(gioLam2, gioLam1);
        if (compareGioLam != 0) {
            return compareGioLam;
        } else {
            // Nếu số giờ làm bằng nhau, so sánh theo ca làm việc
            return o1.getCaLamViec().compareTo(o2.getCaLamViec());
        }
    }
}