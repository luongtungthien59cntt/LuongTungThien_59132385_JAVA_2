/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dell
 */
public class bai3 {
    public static void main(String[] args) {
        
        List<SinhVien> danhSachSinhVien = new ArrayList();
        
        danhSachSinhVien.add(new SinhVien("Khanh", new Date(1999, 5, 8), 6.5f));
        danhSachSinhVien.add(new SinhVien("Lan", new Date(2000, 8, 9), 5.5f));
        danhSachSinhVien.add(new SinhVien("Ngoc", new Date(1998, 7, 15), 7.5f));
        
        QLSV qlsv = new QLSV(danhSachSinhVien, new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("In danh sach theo hinh thuc so sanh diem: ");
        qlsv.inDS();
        
        qlsv.setHinhThucSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("In danh sach theo hinh thuc theo ten: ");
        qlsv.inDS();
    }
    
}
