/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author ADMIN
 */
public class CongNhanManagement implements IUtils {

    private static final DBEngine db = new DBEngine();
    public static LinkedHashSet<CongNhan> lhs = new LinkedHashSet<CongNhan>();

    @Override
    public void saveDataToFile() {
        try {
            db.LuuFile("D:\\CongNhan.txt", lhs);
            System.out.println("Lưu file thành công");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public void getDataFromFile() {
        try {
            lhs = (LinkedHashSet) db.docFile("D:\\CongNhan.txt");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }

    @Override
    public void inputData() {
        CongNhan cn1 = new CongNhan("CN1", "Nguyễn Thị Điệp", CaType.Ca1, 20);
        CongNhan cn2 = new CongNhan("CN2", "Nguyễn Thị Linh", CaType.Ca2, 40);
        CongNhan cn3 = new CongNhan("CN3", "Nguyễn Thị Đông", CaType.Ca3, 30);

        lhs.add(cn1);
        lhs.add(cn2);
        lhs.add(cn3);
    }

    @Override
    public void outputData() {
        Iterator ir = lhs.iterator();
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }
    }

    //những cong nhan co so gio lam thap
    public static void timMin() {
        CongNhan x = Collections.max(lhs, new TimMin());
        System.out.println(x);
    }

}
