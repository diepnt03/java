/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throw_b;

/**
 *
 * @author ADMIN
 */
public class main {

    //Ném ra ngoại lệ nhưng có xử lý
    static void validate(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("not valid");
            } else {
                System.out.println("welcome");
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }

}
