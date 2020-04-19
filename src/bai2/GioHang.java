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
public class GioHang {
    private IThanhToan hinhThucTT;
    private List<HangHoa> hangHoa;
    
    public GioHang(IThanhToan hinhThucTT, List<HangHoa> hangHoa) {
        this.hinhThucTT = hinhThucTT;
        this.hangHoa = hangHoa;
    } 
    
    public double thanhToan() {
        int tienHangHoa = tienHang();
        return hinhThucTT.thanhToan(tienHangHoa);
    }
    
    public int tienHang(){
        int tienHangHoa = 0;
        for (HangHoa h: hangHoa) {
            tienHangHoa += h.getGia();
        }
        return tienHangHoa;
    }
    
    void xuatThongTin() {
        System.out.println("Danh sach hang hoa: ");
        for (HangHoa h: hangHoa) {
            System.out.println(h.toString());
        }
        System.out.println("Tien hang: " + tienHang());
        System.out.println("Thanh toan: " + thanhToan());    
    }
}
    
    

