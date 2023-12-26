/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuongNhap_XuatDoiTuong;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Person implements Serializable{
    private int id;
    private String name;
    private String address;
    private char gender;

    public Person() {
    }

    public Person(int id, String name, String address, char gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + '}';
    }
    
    
}
