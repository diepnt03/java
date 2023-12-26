/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
//lớp giao diện phụ để cập nhật thông tin của danh mục
public class CategoryManagerUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtId, txtName;
    private JButton btnOk;

    public CategoryManagerUI(String title) {
        setTitle(title);
    }

    public void doShow() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 150);
        addControl();
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setVisible(true);
    }

    public void addControl() {
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
        JPanel pnId = new JPanel();
        txtId = new JTextField(15);
        txtName = new JTextField(15);
        JLabel lblId = new JLabel("Cate Id:");
        JLabel lblName = new JLabel("Cate Name:");
        pnId.add(lblId);
        pnId.add(txtId);
        pnBox.add(pnId);
        JPanel pnName = new JPanel();
        pnName.add(lblName);
        pnName.add(txtName);
        pnBox.add(pnName);
        JPanel pnButton = new JPanel();
        btnOk = new JButton("OK");
        pnButton.add(btnOk);
        pnBox.add(pnButton);
        lblId.setPreferredSize(lblName.getPreferredSize());
        Container con = getContentPane();
        con.add(pnBox);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Category cate = new Category(txtId.getText(), txtName.getText());
                MainManagerUI.listData.addCate(cate);
                MainManagerUI.updateCateList();
                dispose();
            }
        }
        );
    }
}
