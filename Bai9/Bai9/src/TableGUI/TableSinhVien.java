/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableGUI;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableSinhVien extends AbstractTableModel {

    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[] = {"Mã sv", "Họ tên", "Tuoi"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, Integer.class};
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();

    public TableSinhVien(ArrayList<SinhVien> ds) {
        dsSV = ds;
    }

    @Override
    public int getRowCount() {
        return dsSV.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //Cột mã
            case 0:
                return dsSV.get(rowIndex).getMaSV();
            //Cột họ tên
            case 1:
                return dsSV.get(rowIndex).getHoTen();
            //Cột tuoi
            case 2:
                return dsSV.get(rowIndex).getTuoi();
            default:
                return null;
        }

    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }

}
