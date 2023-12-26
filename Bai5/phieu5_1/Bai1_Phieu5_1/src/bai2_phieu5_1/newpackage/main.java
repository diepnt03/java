/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_phieu5_1.newpackage;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            // chia cho 0
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            //truy cập ra ngoài biên giới của mảng            
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            // lỗi tổng quát
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

}
