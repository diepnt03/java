/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
//lớp giao diện chính của chương trình
public class MainManagerUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private static JList lstCate;
    private JTable tblProduct;
    private DefaultTableModel dtmProduct;
    private JButton btnCateRemove, btnCateNew, btnCateUpdate, btnNew, btnSave, btnRemove;
    private JTextField txtId, txtName, txtUnitprice, txtQuantity;
    private JTextArea txtDescription;
    private static JComboBox cboCateList;
    JMenuBar menubar;
    JMenu mnuFile;
    JMenuItem mnuFileOpenDataFromDisk, mnuFileWritetodisk, mnuFileExit;
    public static ListCategory listData;
    public static Category selectedCate;

    public MainManagerUI(String title) {
        super(title);
        listData = new ListCategory();
    }

    public void doShow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 550);
        addControl();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addMenu() {
        menubar = new JMenuBar();
        mnuFile = new JMenu("File");
        mnuFileWritetodisk = new JMenuItem("Write Data to disk");
        mnuFileOpenDataFromDisk = new JMenuItem("Open Data from disk");
        mnuFileExit = new JMenuItem("Exit");
        menubar.add(mnuFile);
        mnuFile.add(mnuFileWritetodisk);
        mnuFile.add(mnuFileOpenDataFromDisk);
        mnuFile.addSeparator();
        mnuFile.add(mnuFileExit);
        setJMenuBar(menubar);
    }

    public void addControl() {
        addMenu();
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        JLabel lblTitle = new JLabel("Quản lý sản phẩm");
        Font ftTitle = new Font("arial", Font.BOLD, 32);
        lblTitle.setFont(ftTitle);
        lblTitle.setForeground(Color.BLUE);
        pnNorth.add(lblTitle);
        pnBorder.add(pnNorth, BorderLayout.NORTH);
        JPanel pnListCate = new JPanel();
        JPanel pnListProduct = new JPanel();
        JSplitPane slitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnListCate, pnListProduct);
        pnBorder.add(slitPane, BorderLayout.CENTER);
        pnListCate.setLayout(new BorderLayout());
        lstCate = new JList();
        TitledBorder cateborder = new TitledBorder(BorderFactory.createLineBorder(Color.RED), "Danh mục sản phẩm");
        lstCate.setBorder(cateborder);
        pnListCate.setPreferredSize(new Dimension(300, 0));
        pnListCate.add(lstCate, BorderLayout.CENTER);
        JPanel pnListCateSouth = new JPanel();
        btnCateNew = new JButton("New");
        pnListCateSouth.add(btnCateNew);
        btnCateUpdate = new JButton("Update");
        pnListCateSouth.add(btnCateUpdate);
        btnCateRemove = new JButton("Remove");
        pnListCateSouth.add(btnCateRemove);
        pnListCate.add(pnListCateSouth, BorderLayout.SOUTH);
        pnListProduct.setLayout(new BorderLayout());
        JPanel pnProductTitle = new JPanel();
        JLabel lblProductTitle = new JLabel("Thông tin chi tiết");
        pnProductTitle.add(lblProductTitle);
        pnListProduct.add(pnProductTitle, BorderLayout.NORTH);
        JPanel pnProductTable = new JPanel();
        pnProductTable.setLayout(new BorderLayout());
        pnListProduct.add(pnProductTable, BorderLayout.CENTER);
        dtmProduct = new DefaultTableModel();
        dtmProduct.addColumn("Product ID");
        dtmProduct.addColumn("Product Name");
        dtmProduct.addColumn("UnitPrice");
        dtmProduct.addColumn("Quantity");
        dtmProduct.addColumn("Description");
        tblProduct = new JTable(dtmProduct);
        JScrollPane sctblproduct = new JScrollPane(tblProduct);
        pnProductTable.add(sctblproduct, BorderLayout.CENTER);
        JPanel pnProductDetail = new JPanel();
        pnListProduct.add(pnProductDetail, BorderLayout.SOUTH);
        pnProductDetail.setLayout(new BoxLayout(pnProductDetail, BoxLayout.Y_AXIS));
        JPanel pnCateList = new JPanel();
        JLabel lblCateId = new JLabel("Category:");
        cboCateList = new JComboBox();
        pnCateList.add(lblCateId);
        pnCateList.add(cboCateList);
        pnProductDetail.add(pnCateList);
        JPanel pnProductId = new JPanel();
        JLabel lblProId = new JLabel("Product ID :");
        txtId = new JTextField(20);
        pnProductId.add(lblProId);
        pnProductId.add(txtId);
        pnProductDetail.add(pnProductId);
        JPanel pnProductName = new JPanel();
        JLabel lblProName = new JLabel("Product Name:");
        txtName = new JTextField(20);
        pnProductName.add(lblProName);
        pnProductName.add(txtName);
        pnProductDetail.add(pnProductName);
        JPanel pnProductUnitPrice = new JPanel();
        JLabel lblUnitPrice = new JLabel("Unit Price :");
        txtUnitprice = new JTextField(20);
        pnProductUnitPrice.add(lblUnitPrice);
        pnProductUnitPrice.add(txtUnitprice);
        pnProductDetail.add(pnProductUnitPrice);
        JPanel pnProductQuantity = new JPanel();
        JLabel lblQuantity = new JLabel("Quantity:");
        txtQuantity = new JTextField(20);
        pnProductQuantity.add(lblQuantity);
        pnProductQuantity.add(txtQuantity);
        pnProductDetail.add(pnProductQuantity);
        JPanel pnProductDescription = new JPanel();
        JLabel lblDescription = new JLabel("Description:");
        txtDescription = new JTextArea(4, 20);
        JScrollPane scare = new JScrollPane(txtDescription);
        pnProductDescription.add(lblDescription);
        pnProductDescription.add(scare);
        pnProductDetail.add(pnProductDescription);
        JPanel pnButton = new JPanel();
        btnNew = new JButton("New");
        btnSave = new JButton("Save");
        btnRemove = new JButton("Remove");
        pnButton.add(btnNew);
        pnButton.add(btnSave);
        pnButton.add(btnRemove);
        pnProductDetail.add(pnButton);
        cboCateList.setPreferredSize(txtId.getPreferredSize());
        lblCateId.setPreferredSize(lblProName.getPreferredSize());
        lblDescription.setPreferredSize(lblProName.getPreferredSize());
        lblQuantity.setPreferredSize(lblProName.getPreferredSize());
        lblUnitPrice.setPreferredSize(lblProName.getPreferredSize());
        lblProId.setPreferredSize(lblProName.getPreferredSize());
        Container con = getContentPane();
        con.add(pnBorder);
        btnCateNew.addActionListener(new processButtonEvent());
        btnNew.addActionListener(new processButtonEvent());
        btnSave.addActionListener(new processButtonEvent());
        btnRemove.addActionListener(new processButtonEvent());
        cboCateList.addActionListener(new processButtonEvent());
        mnuFileWritetodisk.addActionListener(new processButtonEvent());
        mnuFileOpenDataFromDisk.addActionListener(new processButtonEvent());
        lstCate.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                selectedCate = (Category) lstCate.getSelectedValue();
                showListProductIntoTable();
            }
        }
        );
    }

    private void showListProductIntoTable() {
        dtmProduct.setRowCount(0);
        for (Product p : selectedCate.getListPro()) {
            Vector<String> vec = new Vector< String>();
            vec.add(p.getProductId());
            vec.add(p.getProductName());
            vec.add(p.getUnitPrice() + "");
            vec.add(p.getQuantity() + "");
            vec.add(p.getDescription());
            dtmProduct.addRow(vec);
        }
    }

    public static void updateCateList() {
        lstCate.removeAll();
        lstCate.setListData(listData.getList().toArray());
        lstCate.updateUI();
        cboCateList.removeAllItems();
        for (Category cate : listData.getList()) {
            cboCateList.addItem(cate);
        }
    }

    private void doCreateNewCate() {
        CategoryManagerUI cateUI = new CategoryManagerUI("Cate information");
        cateUI.doShow();
    }

    private void doSaveProduct() {
        if (selectedCate != null) {
            Product p = new Product();
            p.setProductId(txtId.getText());
            p.setProductName(txtName.getText());
            p.setQuantity(Integer.parseInt(txtQuantity.getText()));
            p.setUnitPrice(Double.parseDouble(txtUnitprice.getText()));
            p.setDescription(txtDescription.getText());
            selectedCate.addProduct(p);
        }
    }

    private void doComboboxSelected() {
        selectedCate = (Category) cboCateList.getSelectedItem();
    }

    private void doWriteDataToDisk() {
        JFileChooser fc = new JFileChooser(".");
        if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            MyProcessFile.saveData(listData, fc.getSelectedFile().getAbsolutePath());
        }
    }

    private void doReadDataFromDisk() {
        JFileChooser fc = new JFileChooser(".");
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            listData = (ListCategory) MyProcessFile.openData(fc.getSelectedFile().getAbsolutePath());
            updateCateList();
        }
    }

    private class processButtonEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o.equals(btnCateNew)) {
                doCreateNewCate();
            } else if (o.equals(btnNew)) {
                txtDescription.setText("");
                txtId.setText("");
                txtName.setText("");
                txtUnitprice.setText("");
                txtQuantity.setText("");
                txtId.requestFocus();
            } else if (o.equals(btnSave)) {
                doSaveProduct();
            } else if (o.equals(cboCateList)) {
                doComboboxSelected();
            } else if (o.equals(mnuFileWritetodisk)) {
                doWriteDataToDisk();
            } else if (o.equals(mnuFileOpenDataFromDisk)) {
                doReadDataFromDisk();
            }
        }
    }
}
