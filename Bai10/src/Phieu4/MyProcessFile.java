/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ADMIN
 */
//dùng để xử lý tập tin: lưu và đọc đối tượng trên ổ cứng
public class MyProcessFile {

    public static void saveData(Object list, String fileName) {
        try {
            FileOutputStream fOut = new FileOutputStream(fileName);
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);
            oOut.writeObject(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object openData(String fileName) {
        try {
            FileInputStream fIn = new FileInputStream(fileName);
            ObjectInputStream oIn = new ObjectInputStream(fIn);
            return oIn.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
