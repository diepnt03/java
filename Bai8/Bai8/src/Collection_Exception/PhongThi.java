/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection_Exception;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
//Khai báo lớp và thuộc tính
public class PhongThi implements Serializable {

    //các thuộc tính của đối tượng phòng thi
    private String msPT;
    private String diachiPT;
    private int luongTS;

    //đối tượng dùng chứa tập các thí sinh
    private ArrayList<ThiSinh> dsTS;

    // đinh nghĩa các phương thức khởi tạo
    public PhongThi(String msPT, String diachiPT, int luongTS) {
        this.msPT = msPT;
        this.diachiPT = diachiPT;
        this.luongTS = luongTS;
        dsTS = new ArrayList<ThiSinh>();
    }

    //get/set danh sách thí sinh
    public ArrayList<ThiSinh> getDsTS() {
        return dsTS;
    }

    public void setDsTS(ArrayList<ThiSinh> dsTS) {
        this.dsTS = dsTS;
    }

    /*
     * Thêm 1 thí sinh vào phòng thi có kiểm tra trùng mã
     * @param ts: thí sinh thêm vào
     * @return true nếu việc thêm thành công
     */
    public boolean themThiSinh(ThiSinh ts) {
        //Nếu thí sinh đã tồn tại thì không cho thêm
        if (dsTS.contains(ts)) {
            return false;
        }
        if (dsTS.size() + 1 > luongTS)//nếu đã đủ lượng thí sinh
        {
            System.out.println("đã đủ số lượng thí sinh trong phòng.");
            return false;
        } else {
            dsTS.add(ts);
            return true;
        }
    }

    /* Xóa 1 thí sinh khỏi phòng thi
    * @param soBD là số báo danh của thí sinh cần xóa
    * @return trả về true nếu xóa thành công
     */
    public boolean xoaThisinh(String soBD) {
        ThiSinh ts = new ThiSinh(soBD);
        if (!dsTS.contains(ts)) {
            return false;
        } else {
            dsTS.remove(ts);
            return true;
        }
    }

    /*
     * Sửa thông tin thí sinh
     * @param soBD: số DB của thí sinh cần sử thông tin
     * @param newTS: thông tin mới cần cập nhật
     * @return true nếu sửa chữa thành công
     */
    public boolean suaThongtinTS(String soBD, ThiSinh newTS) {
        ThiSinh ts = new ThiSinh(soBD);
        if (!dsTS.contains(ts)) {
            return false;
        }
        //Để đặt một giá trị cho một phần tử ở một vị trí cụ thể trong ArrayList, 
        //bạn có thể sử dụng phương thức set(int index, E element).
        dsTS.set(dsTS.indexOf(ts), newTS);
        return true;
    }

    /*
     * Lấy thông tin của 1 thí sinh khi biết số báo danh
     * @param soBD số báo danh của ts cần lấy thông tin
     * @return null nếu không lấy được
     */
    public ThiSinh layThongtinTS(String soBD) {
        ThiSinh ts = new ThiSinh(soBD);
        if (!dsTS.contains(ts)) {
            return null;
        }
        ts = dsTS.get(dsTS.indexOf(ts));
        return ts;
    }

    /*
     * Lấy thông tin của 1 thí sinh khi biết số thứ tự của ts đó trong danh sách
     * @param index :số thứ tự của ts
     * @return null nếu không thành công
     */
    public ThiSinh layThongtinTS(int index) {
        if (index < 0 || index > dsTS.size()) {
            return null;
        }
        return dsTS.get(index);
    }

    /*
     * Lấy số thí sinh thực sự đang có trong phòng thi
     * @return
     */
    public int soThisinh() {
        return dsTS.size();
    }

    @Override
    public String toString() {
        return "PhongThi{" + "msPT=" + msPT + ", diachiPT=" + diachiPT + ", luongTS=" + luongTS + ", dsTS=" + dsTS + '}';
    }
    
    
}//end of class phòng thi

