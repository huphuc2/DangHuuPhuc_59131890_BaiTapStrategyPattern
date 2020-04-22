/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author huuph
 */
public class BaiTap1_main {
    public static void main(String[] args) {
        Context tong = new Context();
        tong.setTinhToan(new Cong());
        System.out.println("75 + 12 = "+tong.tinh(75, 12));
        Context tru = new Context();
        tru.setTinhToan(new Tru());
        System.out.println("54 - 78 = "+tru.tinh(54, 78));
             
    }
    
}
