/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
//tìm kiếm bênh nhân 30 tuổi
public class TimKiem implements Comparator<BenhNhan>{
    @Override
    public int compare(BenhNhan o1, BenhNhan o2){
        return o1.getTuoi() - o2.getTuoi();
    }
}
