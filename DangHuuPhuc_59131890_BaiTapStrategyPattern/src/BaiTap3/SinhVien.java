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

    private String Ten;
    private Date ngaySinh;
    private float diemTB;
    public SinhVien(String Ten,Date ngaySinh,float diemTB){
        this.Ten = Ten;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
    public String setTen(String Ten){
        this.Ten = Ten;
        return Ten;
    }
    public String getTen(){
        return Ten;
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
