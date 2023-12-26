/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throws_a;

import java.io.IOException;

/**
 *
 * @author ADMIN
 */
//Ví dụ phương thức dùng throws ném trả về ngoại lệ checked

public class TestThrows1 {

    void m() throws IOException {
        throw new IOException("Loi thiet bi");
        // checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }

    public static void main(String args[]) {
        TestThrows1 obj = new TestThrows1();
        obj.p();
        System.out.println("luong binh thuong...");
    }

}
