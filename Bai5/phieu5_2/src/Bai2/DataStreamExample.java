/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.io.FileInputStream;

/**
 *
 * @author ADMIN
 */
public class DataStreamExample {

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai5\\phieu5_2\\src\\Bai1\\testout.txt");
//            int i = fin.read();
//            System.out.print((char) i);
//            System.out.println("");

            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
