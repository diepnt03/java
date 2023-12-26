/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeSet;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class MaxHocPhi implements Comparator<HocVienDH>{
     @Override
     public int compare(HocVienDH o1, HocVienDH o2) {
        return (int) (o1.hocPhi() - o2.hocPhi());
    }
}
