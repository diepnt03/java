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
//dùng để lưu danh sách các danh mục
public class ListCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    private ArrayList<Category> listCate = new ArrayList<Category>();

    //tìm kiếm danh mục bằng id
    public Category findCateById(String id) {
        for (Category cate : listCate) {
            if (cate.getCateId().equalsIgnoreCase(id)) {
                return cate;
            }
        }
        return null;
    }

    //thêm danh mục
    public void addCate(Category cate) {
        Category cateFind = findCateById(cate.getCateId());
        if (cateFind != null) {
            cateFind = cate;
        } else {
            listCate.add(cate);
        }
    }

    //xóa danh mục bằng ID
    public void removeCateById(String id) {
        Category cateFind = findCateById(id);
        if (cateFind != null) {
            listCate.remove(cateFind);
        }
    }

    public ArrayList<Category> getList() {
        return listCate;
    }
}
