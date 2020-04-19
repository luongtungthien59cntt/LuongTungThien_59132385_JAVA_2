/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author dell
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int ketQua = CongCu.soSanhChuoi(o1.getHoTen(), o2.getHoTen());
        if (ketQua > 0) {
            return 1;
        } else if (ketQua < 0){
            return -1;
        } else return 0;
    }
}
