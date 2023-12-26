/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai5\\phieu5_2\\src\\Bai1\\testout.txt");
            String s = "Welcome to javaTpoint.";
            byte b[] = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
