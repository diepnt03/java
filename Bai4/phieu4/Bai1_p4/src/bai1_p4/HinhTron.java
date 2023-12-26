/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_p4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HinhTron extends HinhPhang {

    public double r;

    public double tinhCV() {
        return 2*Math.PI*r;
    }

    public double tinhDT() {
        return Math.PI*r*r;
    }
}
