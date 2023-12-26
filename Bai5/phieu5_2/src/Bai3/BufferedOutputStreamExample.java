/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author ADMIN
 */
public class BufferedOutputStreamExample {

    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai5\\phieu5_2\\src\\Bai3\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to javaTpoint.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
