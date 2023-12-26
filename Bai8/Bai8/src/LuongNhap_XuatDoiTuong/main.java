/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuongNhap_XuatDoiTuong;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) throws ClassNotFoundException {
        FileOutputStream fo;
        ObjectOutputStream out;
        try {
            fo = new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai8\\Bai8\\src\\LuongNhap_XuatDoiTuong\\test.txt");
            out = new ObjectOutputStream(fo);
            Person p1 = new Person(100, "Nguyễn Văn An", "Nam Định", 'M');
            Person p2 = new Person(101, "Nguyễn Thị Anh", "Nam Định", 'F');
            out.writeObject(p1);
            out.writeObject(p2);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fi;
        ObjectInputStream in;
        try {
            fi = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai8\\Bai8\\src\\LuongNhap_XuatDoiTuong\\test.txt");
            in = new ObjectInputStream(fi);
            Person p3 = (Person) in.readObject();
            Person p4 = (Person) in.readObject();
            System.out.println(p3);
            System.out.println(p4);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
