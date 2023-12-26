/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXep.cach1;

/**
 *
 * @author ADMIN
 */
public class Student implements Comparable<Student> { //so sánh được

    private String code;
    private String name;
    private int yob; // nam sinh
    private int mark;

    public Student(String code, String name, int yob, int mark) {
        this.code = code;
        this.name = name;
        this.yob = yob;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", yob=" + yob + ", mark=" + mark + '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.mark > o.mark) {
            return 1;
        } else if (this.mark < o.mark) {
            return -1;
        } else {
            return 0;
        }
    }

}
