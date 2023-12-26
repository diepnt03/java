/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String args[]) throws Exception {
        FileInputStream fin1 = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai5\\phieu5_2\\src\\Bai6\\testin1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai5\\phieu5_2\\src\\Bai6\\testin2.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\hk5\\JAVA\\Bai5\\phieu5_2\\src\\Bai6\\testout.txt");
        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        int i;
        while ((i = sis.read()) != -1) {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");
    }
}

