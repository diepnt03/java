/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author ADMIN
 */
public class InputStreamExample {

    public static void main(String args[]) throws Exception {
        FileInputStream input1 = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai5\\phieu5_2\\src\\Bai3\\testout.txt");
        FileInputStream input2 = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai5\\phieu5_2\\src\\Bai1\\testout.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char) j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
