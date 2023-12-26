/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXep.cach2;

/**
 *
 * @author ADMIN
 */
public class Student {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }    
    
    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", yob=" + yob + ", mark=" + mark + '}';
    }
  
}
