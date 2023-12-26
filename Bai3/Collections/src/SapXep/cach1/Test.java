/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXep.cach1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList();
        Student s1 = new Student("100", "Nguyen Thi Lan", 1997, 9);
        Student s2 = new Student("101", "Nguyen Van Hung", 1997, 10);
        Student s3 = new Student("102", "Nguyen Thi Hnag", 1997, 8);

        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        
        System.out.println("Danh sach sinh vien truoc khi sap xep");
        for(Student s:a1){
            System.out.println(s);
        }
        Collections.sort(a1);
        
        System.out.println("Danh sach sinh vien sap xep theo diem tang dan");
        for(Student s:a1){
            System.out.println(s);
        }
    }
}
