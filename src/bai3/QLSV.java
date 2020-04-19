/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author dell
 */
public class QLSV {
    
    private List<SinhVien> danhSachSinhVien;
    private ISoSanh hinhThucSoSanh;

    public QLSV(List<SinhVien> danhSachSinhVien, ISoSanh hinhThucSoSanh) {
        this.danhSachSinhVien = danhSachSinhVien;
        this.hinhThucSoSanh = hinhThucSoSanh;
    }
    
    public void sapXep() {
        danhSachSinhVien.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return hinhThucSoSanh.soSanh(o1, o2);
            }
            
        });      
    }
    
    public void inDS(){
        for (SinhVien sv: danhSachSinhVien){
            System.out.println(sv.toString());
        }   
    }  

    public void setHinhThucSoSanh(ISoSanh hinhThucSoSanh) {
        this.hinhThucSoSanh = hinhThucSoSanh;
    }
}
