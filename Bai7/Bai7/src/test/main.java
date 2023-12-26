/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {

        // Khởi tạo một LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // a. Thêm phần tử
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        System.out.println("linkedHashMap:  " + linkedHashMap);

        System.out.println("");
        // b. Lấy phần tử
        int value = linkedHashMap.get("B");
        System.out.println("Value for key 'B': " + value);

        System.out.println("");
        // c. Xóa phần tử
        linkedHashMap.remove("A");
        System.out.println("After removing key 'A: " + linkedHashMap);

        System.out.println("");
        // d. Sửa phần tử
        linkedHashMap.put("B", 10); // Ghi đè giá trị của key 'B'
        System.out.println("After updating key 'B': " + linkedHashMap);

        System.out.println("");
        // e. Chuyển đổi tập hợp đang tìm hiểu sang tập hợp khác
        //Ví dụ chuyển đổi thành một danh sách (List)
        java.util.List<String> keysList = new java.util.ArrayList<>(linkedHashMap.keySet());
        java.util.List<Integer> valuesList = new java.util.ArrayList<>(linkedHashMap.values());
        System.out.println("Keys as List: " + keysList);
        System.out.println("Values as List: " + valuesList);
        System.out.println("");

        // f. Tìm phần tử lớn nhất, nhỏ nhất và sắp xếp các phần tử trong tập hợp
// Để tìm phần tử lớn nhất và nhỏ nhất, chúng ta có thể sử dụng một vòng lặp hoặc Stream API.
// Tìm phần tử lớn nhất
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        System.out.println("Max Key: " + maxKey + ", Max Value: " + maxValue);

// Tìm phần tử nhỏ nhất
        String minKey = null;
        int minValue = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() < minValue) {
                minKey = entry.getKey();
                minValue = entry.getValue();
            }
        }

        System.out.println("Min Key: " + minKey + ", Min Value: " + minValue);


    }
}
