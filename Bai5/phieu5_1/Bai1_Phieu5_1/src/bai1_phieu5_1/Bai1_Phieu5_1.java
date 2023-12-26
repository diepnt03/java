/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1_phieu5_1;

/**
 *
 * @author ADMIN
 */
public class Bai1_Phieu5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            // chia cho 0
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            //truy cập ra ngoài biên giới của mảng
            System.out.println("task 2 completed");
        } catch (Exception e) {
            // lỗi tổng quát
            System.out.println("common task completed");
        }
        System.out.println("rest of the code...");
    }

}
