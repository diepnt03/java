/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throw_a;

/**
 *
 * @author ADMIN
 */
public class main {

    //Ném ra ngoại lệ nhưng không xử lý
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("welcome");
        }
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }

}
