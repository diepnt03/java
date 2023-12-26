/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VECTOR_DulieuTuTao;

/**
 *
 * @author ADMIN
 */
public class Student {

    private String id;
    private String name;
    private String address;
    private int age;

    /*
     * hàm tạo  
     * @param id tạo đối tượng chỉ ID có giá trị
     */
    public Student(String id) {
        this.id = id;
    }

    /*
* tạo đối tượng có đầy đủ tham số
* @param id: truyền cho mã sinh viên
* @param name: truyền cho tên
* @param address: truyền cho địa chỉ
* @param age : truyền cho tuổi
     */
    public Student(String id, String name, String address, int age) {
        this(id);
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
* xác định mã hashcode của đối tượng xác định theo id
* @return
     */
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /* xác thuộc tính phân biệt sinh viên theo ID
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        //kiểm tra xem một đối tượng có thuộc về một lớp cụ thể (class) 
        //hoặc một kiểu giao diện (interface) hay không
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return id.equals(other.id);
    }

    /* @return giá trị kết xuất thông tin đối tượng
     */
    @Override
    public String toString() {
        return String.format("%15s%15s%15s%15s", id, name, address, age);
    }
}
