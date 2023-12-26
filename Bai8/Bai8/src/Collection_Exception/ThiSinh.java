/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection_Exception;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
//Bước1: khai báo lớp vàd thuộc tính và lớp
//implements Serializable: Đánh dấu lớp muốn tuần tự hóa
public class ThiSinh implements Serializable {

    private String soBD;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    //Bước 2: xây dựng hàm tạo
    public ThiSinh() {
        soBD = "";
        hoTen = "no-name";
        diemToan = diemLy = diemHoa = 0f;
    }

    public ThiSinh(String soBD) {
        this.soBD = soBD;
    }

    //bước 3 ghi đè phương thức nhận diện khóa
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.soBD);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThiSinh other = (ThiSinh) obj;
        if (!Objects.equals(this.soBD, other.soBD)) {
            return false;
        }
        return true;
    }

    /*
     * bước 4: Ứng với mỗi data instance ở Bước 2, tạo các phương thức setters/getters. 
     * Cũng theo tính chất Encapsulation kiểm soát thay đổi giá
     * trị của thuộc tính đảm đảo tính toàn vẹn dữ liệu.
     */
    //xử lý bắt lỗi hợp lệ dữ liệu số báo danh không trống
    public void setSoBD(String soBD) throws Exception {
        if (soBD.trim().equals("")) {
            throw new Exception("Số báo danh không được trống!");
        }
        this.soBD = soBD;
    }

    //xử lý bắt lỗi hợp lệ dữ liệu tên không trống
    public void setHoTen(String hoTen) throws Exception {
        if (hoTen.trim().equals("")) {
            throw new Exception("Họ tên không được trống!");
        }
        this.hoTen = hoTen;
    }

    //xử lý bắt lỗi hợp lệ dữ liệu điểm trong khoảng 0 đến 10
    public void setDiemToan(float diemToan) throws Exception {
        if (diemToan < 0 || diemToan > 10) {
            throw new Exception("Điểm toan không hợp lệ");
        }
        this.diemToan = diemToan;
    }

    public void setDiemLy(float diemLy) throws Exception {
        if (diemLy < 0 || diemLy > 10) {
            throw new Exception("Điểm ly không hợp lệ");
        }
        this.diemLy = diemLy;
    }

    public void setDiemHoa(float diemHoa) throws Exception {
        if (diemHoa < 0 || diemHoa > 10) {
            throw new Exception("Điểm hoa không hợp lệ");
        }
        this.diemHoa = diemHoa;
    }

    //bước 5 nhập thông tin ts
    public void nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("\tNhập số báo danh:");
            setSoBD(sc.nextLine());
            System.out.print("\tNhập họ tên thí sinh:");
            setHoTen(sc.nextLine());
            System.out.print("\tNhập điểm toán:");
            setDiemToan(sc.nextFloat());
            System.out.print("\tNhập điểm lý:");
            setDiemLy(sc.nextFloat());
            System.out.print("\tNhập điểm hóa:");
            setDiemHoa(sc.nextFloat());
        } catch (Exception ex) {
            System.out.print("có lỗi: " + ex.toString());
        }
    }

    //bước 6: xuát thông tin đối tượng 
    @Override
    public String toString() {
        String tsValue;
        tsValue = "SBD:" + soBD + "\t Ho ten:" + hoTen + "\tdiem toan: " + diemToan + "\t điểm lý " + diemLy + "\tđiem hóa" + diemHoa;
        return tsValue;
    }

    /*
    * Bước 7: Viết các business methods của đối tượng.
      Đây là bước quan trọng nhất bởi nó định nghĩa tập các dịch vụ
      của đối tượng cung cấp cho bên ngoài.
     * Kiểm tra 1 thí sinh có đậu hay không
     * @return true nếu sinh viên có tổng số điểm trên 15 và không có điểm nào
     * dưới 3.
     */
    public boolean CheckPassed() {
        return tongDiem() > 15 && diemToan >= 3 && diemHoa >= 3 && diemLy >= 3;
    }

    /*
     * Tổng điểm của thí sinh
     * @return: tổng điểm
     */
    public float tongDiem() {
        return diemHoa + diemLy + diemToan;
    }
}//end of class ThiSinh

