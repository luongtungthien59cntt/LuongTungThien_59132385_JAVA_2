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
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        double ketqua = 0;
        if (tienHang < 1000000) {
            ketqua = tienHang - tienHang * 0.05;
        } else {
            ketqua = tienHang - tienHang * 0.07;          
        }
        return ketqua;
    }
    
    
}
