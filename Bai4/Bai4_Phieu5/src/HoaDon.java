

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HoaDon {

    private String soHD, ngayHD;
    private KhachHang kh = new KhachHang();
    private int soMatHang;
    private Hang dsHang[];
    private float tongTienHang = 0;

    public HoaDon() {
    }

    public HoaDon(String soHD, String ngayHD, int soMatHang, Hang[] dsHang) {
        this.soHD = soHD;
        this.ngayHD = ngayHD;
        this.soMatHang = soMatHang;
        this.dsHang = dsHang;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public int getSoMatHang() {
        return soMatHang;
    }

    public void setSoMatHang(int soMatHang) {
        this.soMatHang = soMatHang;
    }

    public Hang[] getDsHang() {
        return dsHang;
    }

    public void setDsHang(Hang[] dsHang) {
        this.dsHang = dsHang;
    }

    public float getTongTienHang() {
        return tongTienHang;
    }

    public void setTongTienHang(float tongTienHang) {
        this.tongTienHang = tongTienHang;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "soHD=" + soHD + ", ngayHD=" + ngayHD + ", kh=" + kh + ", soMatHang=" + soMatHang + ", dsHang=" + dsHang + ", tongTienHang=" + tongTienHang + '}';
    }

    public int TongSL() {
        int tong = 0;
        for (Hang hh : dsHang) {
            tong += hh.getSoLuong();
        }
        return tong;
    }

    public double TongTT() {
        double tong = 0;
        for (Hang hh : dsHang) {
            tong += hh.ThanhTien();
        }
        return tong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hoa don: ");
        this.soHD = sc.nextLine();

        System.out.print("Nhap ngay lap: ");
        this.ngayHD = sc.nextLine();

        kh.nhap();

        System.out.print("Nhap so luong hang hoa: ");
        this.soMatHang = sc.nextInt();

        this.dsHang = new Hang[soMatHang];
        for (int i = 0; i < soMatHang; i++) {
            dsHang[i] = new Hang();
            System.out.println("Nhap thong tin mat hang thu " + i + 1 + ": ");
            dsHang[i].nhap();
        }
    }

    public void inHD() {
        System.out.println("\t\t\tHOA DON");
        System.out.printf("%-30s%30s%n", "Ma HD: " + this.soHD, "Ngay ban: " + this.ngayHD);
        kh.xuat();
        Hang.inTieuDe();
        for (Hang hh : dsHang) {
            hh.inDL();
        }
        System.out.printf("%n%-20s %15s %-15d %-15.1f%n", "Tong tien", "", TongSL(), TongTT());
    }

    public void sapXep() {
        for (int i = 0; i < soMatHang - 1; i++) {
            for (int j = i + 1; j < soMatHang; j++) {
                if (dsHang[i].getTenHang().compareTo(dsHang[j].getTenHang()) > 0) {
                    Hang temp = dsHang[i];
                    dsHang[i] = dsHang[j];
                    dsHang[j] = temp;
                } else if (dsHang[i].getTenHang().equals(dsHang[j].getTenHang())
                        && dsHang[i].ThanhTien() > dsHang[j].ThanhTien()) {
                    Hang temp = dsHang[i];
                    dsHang[i] = dsHang[j];
                    dsHang[j] = temp;
                }
            }
        }
    }
}
