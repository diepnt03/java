/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simple2;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;

public class Simple2 extends JFrame {//inheriting JFrame  

    JFrame f;

    Simple2() {
        JButton b = new JButton("click");//create button  
        b.setBounds(130, 100, 100, 40);

        add(b);//adding button on frame  
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Simple2();
    }
}
