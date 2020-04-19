/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author dell
 */
public class Bai1 {
    public static void main(String[] args) {
        
        Context context = new Context();
        Tinh cong = new Cong();
        Tinh tru = new Tru();
        Tinh nhan = new Nhan();
        Tinh chia = new Chia();
        
        context.setTinhToan(cong);
        System.out.println("Ket qua phep tinh 1 + 2 =" + context.tinh(1 , 2));
        
        context.setTinhToan(tru);
        System.out.println("Ket qua phep tinh 1 - 2 =" + context.tinh(1 , 2));
        
        context.setTinhToan(nhan);
        System.out.println("Ket qua phep tinh 1 * 2 =" + context.tinh(1 , 2));
        
        context.setTinhToan(chia);
        System.out.println("Ket qua phep tinh 1 / 2 =" + context.tinh(1 , 2));
    }
    
}
