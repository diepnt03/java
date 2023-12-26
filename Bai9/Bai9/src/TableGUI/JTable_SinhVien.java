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
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class JTable_SinhVien extends javax.swing.JFrame {    
    ArrayList<SinhVien> dsSV=new ArrayList<SinhVien>();   
    int dongChon=-1;//dongf chon khi bấm vào bảng
    SinhVien sv=new SinhVien();//biến trung gian dùng tạo đối tượng    
    public JTable_SinhVien() {
        initComponents();        
    }
    
    public void loadTableSinhVien(){
        tableSV.setModel(new TableSinhVien(dsSV));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();
        txtMaSV = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnSap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "null"
            }
        ));
        tableSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSV);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 410, 152));

        txtMaSV.setToolTipText("Nhập mã sv");
        getContentPane().add(txtMaSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, -1));

        txtTen.setToolTipText("Nhập tên");
        getContentPane().add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, -1));

        jLabel1.setText("Mã");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setText("Tên");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setText("Tuổi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtTuoi.setText("0");
        txtTuoi.setToolTipText("nhập tuổi");
        getContentPane().add(txtTuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, 30));

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);

        btnClear.setText("Xóa trắng");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btnTimKiem.setText("Tìm kiếm");
        jPanel2.add(btnTimKiem);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 420, 50));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel3.add(btnClose);

        btnSap.setText("Sắp tên");
        btnSap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapActionPerformed(evt);
            }
        });
        jPanel3.add(btnSap);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 130, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //lấy dữ liệu tạo đối tượng
        sv=new SinhVien(txtMaSV.getText(), txtTen.getText(),
                Integer.parseInt(txtTuoi.getText()));
        dsSV.add(sv);
//        tableSV.repaint();//sơn lai bảng?
        loadTableSinhVien();//load lại bảng với dl mới
        /*
        sv so sánh lựa chọn cách phù hợp để lấy lại dữ liệu mới nhất
        sau khi arrlist bị thay đổi
        */
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        dongChon = tableSV.getSelectedRow(); 
        if (dongChon != -1) {           
           dsSV.remove(dongChon);
           loadTableSinhVien();
        }
        else
            JOptionPane.showMessageDialog(this, 
                    "Chưa chọn dòng xóa","Thông báo", WIDTH);  
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //câph nhật dữ liệu mới tại vị trí dòng chọn
//        System.out.println("dong chon="+dongChon);
        dongChon=tableSV.getSelectedRow();
        if (dongChon != -1) {
           SinhVien svNew = new SinhVien();
           svNew.setMaSV(txtMaSV.getText()+"");
           svNew.setHoTen(txtTen.getText()+"");
           //chuyển dữ liệu trên giao diện sang kiểu int           
           svNew.setTuoi(Integer.parseInt(txtTuoi.getText()+""));
           dsSV.set(dongChon, svNew);//vị trí là dòng chọn
           //dữ liệu mới là từ giao diện cập nhật
           loadTableSinhVien();
        }
        else
            JOptionPane.showMessageDialog(this,
                    "Chưa chọn dòng sửa","Thông báo", WIDTH);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSVMouseClicked
        dongChon = tableSV.getSelectedRow();
        if (dongChon != -1) {
            sv = dsSV.get(dongChon);            
            txtMaSV.setText(sv.getMaSV()+"");
            txtTen.setText(sv.getHoTen()+"");
            txtTuoi.setText(sv.getTuoi()+"");
        }
    }//GEN-LAST:event_tableSVMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtMaSV.setText("");
        txtTen.setText("");
        txtTuoi.setText("");
        txtMaSV.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapActionPerformed
        // TODO add your handling code here:
        //tạo 1 tiêu chí so sánh comparator
        Comparator<SinhVien> c=new Comparator<SinhVien>() {
            @Override
            public int compare(TableGUI.SinhVien t, TableGUI.SinhVien t1) {                
                return t.getHoTen().compareToIgnoreCase(t1.getHoTen());
            }
        };
        Collections.sort(dsSV, c);
        loadTableSinhVien();
    }//GEN-LAST:event_btnSapActionPerformed
  
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JTable_SinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSap;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSV;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}