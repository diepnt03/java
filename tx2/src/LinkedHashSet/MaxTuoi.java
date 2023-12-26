/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedHashSet;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class MaxTuoi implements Comparator<SinhVien>{
    @Override
    public int compare(SinhVien o1, SinhVien o2){
        return o1.getTuoi() - o2.getTuoi();
    }
}