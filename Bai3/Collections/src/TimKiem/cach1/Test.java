/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimKiem.cach1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList();
        a1.add(new Student(100, "Nguyen Van Anh"));
        a1.add(new Student(103, "Nguyen thi hong"));
        a1.add(new Student(102, "Nguyen Van manh"));

        //tìm sinh viên có id là 103
        int pos = Collections.binarySearch(a1, new Student(103, null));

        if (pos >= 0) {
            System.out.println("Ten cua sv co id 103 la: " + a1.get(pos).getName());
        } else {
            System.out.println("Khong co sv nao co id 103");
        }

    }
}
