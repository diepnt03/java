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
public class StudnentManagementDemo {

    private static StudentManagement management;
    private static Scanner scanner;

    /*
     * khởi gán các giá trị tổng thể.
     */
    public static void innit() {
        management = new StudentManagement();
        scanner = new Scanner(System.in);
    }

    /*
     * Bảng chọn chính chương trình.
     */
    private static void printMainMenu() {
        printTitle("Student Management System");
        System.out.println("Select a option below:");
        System.out.println("1)\tAdd new student");
        System.out.println("2)\tRemove a student");
        System.out.println("3)\tFind a student");
        System.out.println("4)\tInsert new student");
        System.out.println("5)\tSort student list");
        System.out.println("6)\tPrint student list");
        System.out.println("7)\tClear student list");
        System.out.println("8)\tExit");
    }

    /*
     * xóa sạch danh sách sinh viên.
     */
    private static void clearStudentList() {
        management.clearStudentList();
        System.out.println("Student list successfully cleared!");
    }

    /*
     * thêm sinh viên vào danh sách.
     *
     * @return sinh viên được thêm vào nếu thông tin mã không bị trùng.
     */
    private static Student enterStudent() {
        System.out.println("Enter the information for new student:");
        System.out.print("- Student id(must be unique):");
        String id = scanner.nextLine();
        if (management.hasExisted(id)) {
            return null;
        }
        System.out.print("- Student name:");
        String name = scanner.nextLine();
        System.out.print("- Student address:");
        String address = scanner.nextLine();
        System.out.print("- Student age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new Student(id, name, address, age);
    }

    /*
     * sắp xếp danh sách sinh viên, cho phép lựa chọn 2 tùy biến 1. sắp theo id
     * 2. sắp theo tên 3. sắp theo tuổi.
     */
    private static void sortStudentList() {
        boolean run = true;
        while (run) {
            printTitle("Sort Student List");
            System.out.println("Select the field to sort by:");
            System.out.println("1)\tBy id");
            System.out.println("2)\tBy name");
            System.out.println("3)\tBy age");
            //nhập lựa chọn
            int opt = scanner.nextInt();
            //bỏ qua ký tự trắng cuối nếu tiếp sau nhập xâu
            scanner.nextLine();;
            if (opt < 1 || opt > 3) {
                System.out.println("Invalid option");
                //bỏ qua lần này và tiếp theo với lần lặp mới
                continue;
            } else {
                management.sortBy(opt == 1 ? "id" : opt == 2 ? "name" : "age");
                System.out.println("Student list successfully sorted!");
            }
            //hỏi lại diễn biến công việc
            run = backOrContinue("sorting student list");
        }
    }

    /*
     * thêm sinh viên vào danh sách tại vị trí index được chỉ ra. Quá trình dừng
     * lại nếu không muốn thực hiện tiếp
     */
    private static void insertStudent() {
        boolean run = true;
        while (run) {
            printTitle("Insert Student");
            System.out.printf("Enter the index(0-%d%n):", management.getStudentList().size() - 1);
            int index = scanner.nextInt();
            scanner.nextLine();
            //sinh viên sẽ được chèn vào
            Student s = enterStudent();
            if (s == null) {
                System.out.println("Student id has existed. Tryagain!");
                //bỏ qua lần lặp hiện thời
                continue;
            } else {
                //chèn s vào vị trí index
                management.insertStudentAt(s, index);
                System.out.println("Student successfully inserted!");
            }
            //hỏi lại diễn biến công việc
            run = backOrContinue("inserting student");
        }
    }

    /*
     * @param doSomething: 1 nếu tiếp tục, 2 sẽ dừng lại trở về trang chính
     * @return true nếu tiếp tục và ngược lại
     */
    private static boolean backOrContinue(String doSomething) {
        int opt = 0;//biến nhận lựa chọn
        System.out.println("Select the option:");
        System.out.println("1) Continue " + doSomething);
        System.out.println("2) Return home");
        //quá trình thực hiện sẽ dừng lại khi chọn 2.
        while (true) {
            opt = scanner.nextInt();
            scanner.nextLine();
            if (opt == 1) {
                return true;
            } else if (opt == 2) {
                return false;
            } else {
                System.out.println("Invalid option!");
            }
        }
    }

    /*
     * tìm sinh viên theo lựa chọn: 1 theo id; 2 theo name; 3 theo age. hàm thực
     * hiện in toàn bộ thông tin tìm được theo tiêu chí được lựa chọn. Quá trình
     * dừng lại nếu không muốn thực hiện tiếp
     */
    private static void findStudents() {
        boolean run = true;//biến nhận lựa chọn điều khiển lặp
        while (run) {
            cls();//xóa sạch cửa sổ lệnh.
            printTitle("Find Students");
            //Hiển thị menu phụ cho chọn tiêu chí tìm kiếm
            System.out.println("Select the field to find with:");
            System.out.println("1)\tBy id");
            System.out.println("2)\tBy name");
            System.out.println("3)\tBy age");
            int opt = scanner.nextInt();
            scanner.nextLine();//bỏ qua dòng nhập hiện tại
            List<Student> results = null;
            System.out.print("Keyword: ");
            if (opt == 1 || opt == 2) {
                String key = scanner.nextLine();
                results = management.findStudentBy(opt == 1 ? "id"
                        : "name", key);
            } else if (opt == 3) {
                int age = scanner.nextInt();
                scanner.nextLine();
                results = management.findStudentBy("age", age);
            } else {
                System.out.println("Invalid option!");
                continue;//bỏ qua lần lặp hiện thời nếu lựa chọn không đúng
            }
            System.out.println("Total founds: " + results.size());
            printStudentListHeader();
            for (int i = 0; i < results.size(); i++) {
                Student s = results.get(i);
                System.out.printf("%5d%15s%15s%15s%15s%n",
                        i, s.getId(), s.getName(), s.getAge(),
                        s.getAddress());
            }
            //hỏi lại diễn biến công việc
            run = backOrContinue("finding");
        }
    }

    /*
     * Xóa sinh viên trong danh sách theo mã Quá trình dừng lại nếu không muốn
     * thực hiện tiếp
     */
    private static void removeAStudent() {
        printTitle("Remove A Student");
        boolean run = true;
        while (run) {
            System.out.print("Enter student id: ");
            String id = scanner.nextLine();
            //gọi phương thức xóa được viết trong SutudentManagement
            if (management.removeStudentById(id)) {
                System.out.println("Student successfully removed!");
            } else {
                System.out.println("Student not found!");
            }
            //hỏi lại diễn biến công việc
            run = backOrContinue("removing student");
        }
    }

    /*
     * xóa cửa sổ lệnh và làm sạch bộ đệm
     */
    private static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void printTitle(String title) {
        System.out.println("====" + title + "====");
    }

    /*
     * thêm danh sách sinh viên. Quá trình dừng lại nếu không muốn thực hiện
     * tiếp
     */
    private static void addNewStudent() {
        cls();
        printTitle("Add new student");
        boolean run = true;
        do {
            Student s = enterStudent();
            if (s == null) {
                System.out.println(
                        "Student id has existed.Try again!");
                continue;
            }
            management.addStudent(s);
            System.out.println("New student successfully added!");
            //hỏi lại diễn biến công việc
            run = backOrContinue("adding new student");
        } while (run);
    }

    private static void printStudentListHeader() {
        System.out.printf("%5s%15s%15s%15s%15s%n", "index", "id",
                "name", "age", "address");
    }

    /*
     * In danh sách sinh viên. Quá trình dừng lại nếu không muốn thực hiện tiếp
     */
    private static void printStudentList() {
        printTitle("Student List");//in tiêu đề
        boolean run = true;
        while (run) {
            cls();
            printStudentListHeader();//in thông tin tiêu đề
            for (int i = 0; i < management.getStudentList().size();
                    i++) {
                Student s = management.getStudentList().get(i);
                System.out.printf("%5d%15s%15s%15s%15s%n", i,
                        s.getId(), s.getName(), s.getAge(), s.getAddress());
            }
            //hỏi lại diễn biến công việc
            run = backOrContinue("printing student list");
        }
    }

    /*
     * thực thi các nhiệm vụ chính. Cho hiển thị bảng chọn chính và triệu gọi
     * các
     * @param args
     */
    public static void main(String[] args) {
        innit();//gọi khởi tạo giá trị tổng thể
        int opt;//biến nhận lựa chọn trong menu chính
        do {
            cls();//xóa cửa sổ lệnh
            printMainMenu();//in menu chính
            System.out.print("Select your option: ");
            opt = scanner.nextInt();//nhập lựa chọn
            scanner.nextLine();//bỏ qua dòng hiện tại
            switch (opt) {
                case 1:
                    addNewStudent();//rẽ nahnh lựa chọn 1
                    break;
                case 2:
                    removeAStudent(); //rẽ nahnh lựa chọn 2
                    break;
                case 3:
                    findStudents();//rẽ nahnh lựa chọn 3
                    break;
                case 4:
                    insertStudent();//rẽ nahnh lựa chọn 4
                    break;
                case 5:
                    sortStudentList(); //rẽ nahnh lựa chọn 5
                    break;
                case 6:
                    printStudentList(); //rẽ nahnh lựa chọn 6
                    break;
                case 7:
                    clearStudentList(); //rẽ nahnh lựa chọn 7
                    break;
                case 8:
                    System.exit(0);//kết thúc chương trình
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (opt != 8);
    }//end of while
}//end of class
