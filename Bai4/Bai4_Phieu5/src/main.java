
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so hoa don: ");
        n = sc.nextInt();
        HoaDon hd[] = new HoaDon[n];
        for (int i = 0; i < n; i++) {
            hd[i] = new HoaDon();
            System.out.println("Nhap thong tin hoa don thu " + i + 1 + ": ");
            hd[i].nhap();
        }
        
        for (int i = 0; i < n; i++) {
            hd[i].sapXep();
            hd[i].inHD();
        }
        
        
    }
}
