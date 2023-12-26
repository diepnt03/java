/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVienForm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class SinhVienDAO extends AbstractTableModel {

    public String Name[] = {"Ma sinh vien", "Ho ten", "Ma Lop", "Diem 1", "Diem 2", "Diem TB", "Ket Qua"};
    public Class classess[] = {String.class, String.class, String.class, Float.class, Float.class, Float.class, String.class};

    ArrayList<SinhVienDTO> dsSV = new ArrayList<SinhVienDTO>();

    public SinhVienDAO(ArrayList<SinhVienDTO> sv) {
        dsSV = sv;
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return dsSV.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Name.length;
    }

    @Override
    public Object getValueAt(int RowIndex, int ColumnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (ColumnIndex) {
            case 0:
                return dsSV.get(RowIndex).getMasv();
            case 1:
                return dsSV.get(RowIndex).getHoten();
            case 2:
                return dsSV.get(RowIndex).getMalop();
            case 3:
                return dsSV.get(RowIndex).getDiem1();
            case 4:
                return dsSV.get(RowIndex).getDiem2();
            case 5:
                return dsSV.get(RowIndex).getDiemtb();
            case 6:
                return dsSV.get(RowIndex).getKetqua();

            default:
                return null;
        }

    }

    @Override
    public Class getColumnClass(int ColumnIndex) {
        return classess[ColumnIndex];
    }

    @Override
    public String getColumnName(int Column) {
        return Name[Column];
    }

}
