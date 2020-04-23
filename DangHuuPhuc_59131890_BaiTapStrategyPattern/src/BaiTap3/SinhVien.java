/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Date;

/**
 *
 * @author huuph
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;
    public String setHoTen(String hoTen){
        this.hoTen = hoTen;
        return hoTen;
    }
    public String getHoTen(){
        return hoTen;
    }
    public Date setNgaySinh(Date ngaySinh){
        this.ngaySinh = ngaySinh;
        return ngaySinh;
    }
    public Date getNgaySinh( ){
        return ngaySinh;
    }
    public float setDiemTB(float diemTB){
        this.diemTB = diemTB;
        return diemTB;
    }
    public float getDiemTB( ){
        return diemTB;
    }
    
    
    
}
