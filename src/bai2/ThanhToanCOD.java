/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author dell
 */
public class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        double ketQua = 0;
        if (tienHang > 2000000) {
            ketQua = tienHang - tienHang *0.02;
        } else {
            ketQua = tienHang;           
        }
        return ketQua;
    }
} 
    

