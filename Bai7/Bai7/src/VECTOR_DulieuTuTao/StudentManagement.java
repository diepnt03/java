/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VECTOR_DulieuTuTao;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class StudentManagement {

    private Vector<Student> students;

    /* hàm tạo danh sách khởi tạo tập hợp
     */
    public StudentManagement() {
        students = new Vector<>();
    }

    /*
     * thêm sinh viên vào danh sách
     * @param s
     * @return true nếu thêm được và ngươc lại.
     */
    public boolean addStudent(Student s) {
        if (students.contains(s)) {
            return false;
        }
        students.addElement(s);
        return true;
    }

    /*
     * xóa toàn bộ danh sách.
     */
    public void clearStudentList() {
        students.clear();
    }

    /*
     * @param id: mã sinh viên cần xóa
     * @return true nếu xóa thành công và ngược lại
     */
    public boolean removeStudentById(String id) {
        return students.remove(new Student(id));
    }

    /*
     * tìm kiếm sinh viên có
    nếu by=id -> tìm theo ID
    by=name thì tìm kiếm theo tên, 
    by= age-> tìm kiếmtheo tuổi.
     * @param key gía trị cần tìm. Vì chưa rõ kiểu dữ liệu nên đặt kiểu chung
     * Object
     * @return Danh sách các phần tử có tiêu chi tìm phù hợp
     */
    public List<Student> findStudentBy(String by, Object key) {
        List<Student> results = new Vector<>();
        for (Student s : students) {
            if ((by.equals("id") && s.getId().equals(key))
                    || (by.equals("name") && s.getName().equals(key))
                    || (by.equals("age") && s.getAge() == (int) key)) {
                results.add(s);
            }
        }
        return results;
    }

    /*
     * @param id: mã sinh viên cần kiểm tra
     * @return true: nếu kiểm tra mã sinh viên đã tồn tại trong danh sách
     */
    public boolean hasExisted(String id) {
        return students.contains(new Student(id));
    }

    /*
     * Chèn Student s vào vị trí index
     * @param s sinh viên cần chèn
     * @param index- vị trí chèn
     * @return true nếu chèn được
     */
    public boolean insertStudentAt(Student s, int index) {
        if (students.contains(s) || index < 0 || index
                >= students.size()) {
            return false;
        }
        //để chèn một phần tử vào một vị trí cụ thể trong Vector
        students.insertElementAt(s, index);
        return true;
    }

    /*
     * @param by : sắp xếp danh sách theo tiêu chí lựa chọn: theo tên, theo mã
     * hay theo tuổi
     */
    public void sortBy(String by) {
        //tạo biến so sánh theo tiêu chí mã
        Comparator<Student> byIdComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        };
        //tạo biến so sánh theo tiêu chí tên
        Comparator<Student> byNameComparator
                = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        //tạo biến so sánh theo tiêu chí tuổi
        Comparator<Student> byAgeComparator
                = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        //lựa chọn tiêu chí sắp và thực hiện lựa chọn tương ứng
        switch (by) {
            case "id":
                students.sort(byIdComparator);
                break;
            case "name":
                students.sort(byNameComparator);
                break;
            case "age":
                students.sort(byAgeComparator);
                break;
            default:
                throw new UnsupportedOperationException(
                        "Sorting by %s field unsupported!" + (by));
        }
    }

    /*
     * @return Danh sách sv không cho phép sửa đổi
     */
    public List<Student> getStudentList() {
        return Collections.unmodifiableList(students);
    }
}
