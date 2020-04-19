/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class bai2 {
    public static void main(String[] args) {
        
        List<HangHoa> danhSachHangHoa = new ArrayList<>();
        
        danhSachHangHoa.add(new HangHoa("Chuot Gaming", 120000, "Chuot may tinh"));
        danhSachHangHoa.add(new HangHoa("Lot Chuot Gaming", 200000, "Lot Chuot"));
        danhSachHangHoa.add(new HangHoa("Man Hinh", 1200000, "Man hinh may tinh"));
        danhSachHangHoa.add(new HangHoa("CPU", 12000000, "CPU may tinh"));
        
        GioHang gh1 = new GioHang(new ThanhToanOnline(), danhSachHangHoa);
        GioHang gh2 = new GioHang(new ThanhToanCOD(), danhSachHangHoa);
        
        gh1.xuatThongTin();
        gh2.xuatThongTin();
    }
}
