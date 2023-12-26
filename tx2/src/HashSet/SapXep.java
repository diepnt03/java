/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSet;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
//sắp xếp theo tăng dần số buổi
public class SapXep implements Comparator<HocVienLT>{
    @Override
    public int compare(HocVienLT o1, HocVienLT o2){
        return o1.getSoBuoi() - o2.getSoBuoi();
    }
}
