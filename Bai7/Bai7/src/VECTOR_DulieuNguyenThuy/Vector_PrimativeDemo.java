/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VECTOR_DulieuNguyenThuy;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Vector_PrimativeDemo {

    private Scanner scanner;
    private Vector<Integer> nums;

    public Vector_PrimativeDemo() {
        //khai báo vector
        nums = new Vector<>();
        scanner = new Scanner(System.in);
    }

    //Thêm các phần tử không trùng nhau
    public void scanUnique() {
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n;) {
            System.out.printf("%dth element: ", (i + 1));
            int num = scanner.nextInt();
            scanner.nextLine();
            if (nums.contains(num)) {
                System.out.printf("Element(%d) has existed!%n", (num));
            } else {
                nums.add(num);
                i++;
            }
        }
    }

    //Thêm vào một số phần tử mà không kiểm soát trung lặp
    public void scan_find() {
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Enter a list of number(%delements):%n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%dth element:%n ", (i + 1));
            nums.addElement(scanner.nextInt());
            scanner.nextLine();
        }
    }
    
    //In vector sử dụng vòng for
    public void printList() {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    //Tìm phần tử bằng giá trị cho trước
    public void findElements() {
        System.out.println("Enter the number you want to find:");
        int num = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.elementAt(i) == num) {
                System.out.println(num + " was found at " + i);
                count++;
            }
        }
        System.out.printf("Total %d elements was found\n", count);
    }
    
    //Xóa phần tử với giá trị nhập vào. Xóa khi nào hết tất cả cá phần tử tương tự trong tập hợp
    public void removeElements() {
        System.out.println(
        "Enter the element you want to remove from list:");
        int e = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        boolean hasMore;
        do {
            hasMore = nums.removeElement(e);
            if (hasMore) {
                count++;
            }
        } while (hasMore);
        System.out.println("Total removed: " + count);
        System.out.println("Number list after removed:");
        printList();
    }
    
    //Sử dụng lớp tiện ích để sắp xếp tập hợp.
    public void printSortedList() {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        nums.sort(c);
        printList();
    }
}
