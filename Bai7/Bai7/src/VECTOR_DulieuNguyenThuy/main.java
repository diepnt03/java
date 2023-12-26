/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VECTOR_DulieuNguyenThuy;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        Vector_PrimativeDemo primativeDemo = new Vector_PrimativeDemo();
        //enter unique element
        primativeDemo.scanUnique();
        System.out.println("Entered list:");
        primativeDemo.printList();
        primativeDemo.findElements();
        primativeDemo.removeElements();
        System.out.println("List after sorting:");
        primativeDemo.printSortedList();
    }
}
