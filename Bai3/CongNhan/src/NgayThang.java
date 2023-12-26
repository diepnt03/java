/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NgayThang {

    private int thang; // 1-12
    private int ngay; // 1-31 based on month
    private int nam; // any year
//ghi đè phương thức toString để mô tả tháng/ngày/năm

    @Override
    public String toString() {
        return thang + "/" + ngay + "/" + nam;
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        int nam = s.nextInt();
        kiemTra(n, t, nam);
    }

    public void kiemTra(int ngay1, int thang1, int nam1) {
        if (thang1 > 0 && thang1 <= 12) // tháng hợp lệ
        {
            this.thang = thang1;
        } else {
            this.thang = 1;
            System.out.println("Tháng " + thang1 + " không hợp lệ. đặt lại tháng = 1.");
        }
        nam = nam1; // nếu năm hợp lệ
        ngay = checkDay(ngay1); // kiểm tra ngày hợp lệ
        System.out.println("in thông tin ngày tháng "+ toString());
    }

    private int checkDay(int ngayKiemTra) {
        int ngayTrongThang[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // kiểm tra tháng nếu trong khoảng từ 1-12
        if (ngayKiemTra > 0 && ngayKiemTra <= ngayTrongThang[thang]) {
            return ngayKiemTra;
        } // kiểm tra năm nhuận
        else if (((thang == 2) && (ngayKiemTra == 29))
                && ((nam % 400 == 0) || ((nam % 4 == 0) && (nam % 100
                != 0)))) {
            return ngayKiemTra;
        } else {
            System.out.println("ngày " + ngayKiemTra + " không hợp lệ, đặt lại = 1.");
            return 1;
        }
    }
}
