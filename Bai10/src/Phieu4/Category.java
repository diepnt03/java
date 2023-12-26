/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu4;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
//dùng để lưu danh mục sản phẩm và lưu danh sách các sản phẩm của từng danh mục
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cateId;
    private String cateName;
    private ArrayList<Product> listPro = new ArrayList< Product>();

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Category(String cateId, String cateName) {
        super();
        this.cateId = cateId;
        this.cateName = cateName;
    }

    public Category() {
        super();
    }

    //tìm kiếm sản phẩm bằng ID
    public Product findProductById(String id) {
        for (Product p : listPro) {
            if (p.getProductId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    //thêm sản phẩm - check trùng ID
    public boolean addProduct(Product p) {
        Product pFind = findProductById(p.getProductId());
        if (pFind != null) {
            System.err.println("Duplicate product ID !");
            return false;
        }
        listPro.add(p);
        return true;
    }

    public ArrayList<Product> getListPro() {
        return listPro;
    }

    public void setListPro(ArrayList<Product> listPro) {
        this.listPro = listPro;
    }

    //xóa sản phẩm bằng ID
    public void removeProductById(String id) {
        Product pFind = findProductById(id);
        if (pFind != null) {
            listPro.remove(pFind);
        }
    }

    //xóa sản phẩm bằng chỉ số
    public void removeProductByIndex(String index) {
        listPro.remove(index);
    }

    public int numberOfProduct() {
        return listPro.size();
    }

    @Override
    public String toString() {
        return this.cateName;
    }
}
