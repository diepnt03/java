/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedHashSet;

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
        //Tạo luồng ghi file
        FileOutputStream fs = new FileOutputStream(fileName);
        //Tạo luồng để serial đối tượng
        ObjectOutputStream os = new ObjectOutputStream(fs);
        //chuyển tải đối tượng tới đích (tập tin)
        os.writeObject(obj);
        //đóng luồng
        fs.close();
        os.close();
    }

    /*
     * Khôi phục(deserial) 1 đối tượng đã được serial trước đó lên bộ nhớ.
     * @param fileName: file chỉ định
     * @return đối tượng đã được phục hồi
     * @throws Exception
     */
    public Object docFile(String fileName) throws Exception {
        Object kq = null;
        //Tạo luồng đọc file đã được serial
        FileInputStream fi = new FileInputStream(fileName);
        //Tạo luồng để Deserialize đối tượng
        ObjectInputStream ois = new ObjectInputStream(fi);
        //Tiến hành khôi phục đối tượng
        kq = (Object) ois.readObject();
        System.out.println(kq);
        //đóng luồng
        fi.close();
        ois.close();
        return kq;
    }
}
