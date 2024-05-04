/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ADMIN
 */
public class DBEngine {

    public void LuuFile(String fileName, Object obj) throws Exception {
        ObjectOutputStream os;
        try (FileOutputStream fs = new FileOutputStream(fileName)) {
            os = new ObjectOutputStream(fs);
            os.writeObject(obj);
        }
        os.close();
    }

    public Object docFile(String fileName) throws Exception {
        Object kq = null;
        ObjectInputStream ois;
        try (FileInputStream fi = new FileInputStream(fileName)) {
            ois = new ObjectInputStream(fi);
            kq = (Object) ois.readObject();
            System.out.println(kq);
        }
        ois.close();
        return kq;
    }
}