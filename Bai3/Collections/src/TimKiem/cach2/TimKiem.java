
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimKiem.cach2;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class TimKiem implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
