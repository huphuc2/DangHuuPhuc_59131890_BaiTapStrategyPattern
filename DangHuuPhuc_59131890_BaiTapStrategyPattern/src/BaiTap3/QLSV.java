/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author huuph
 */
public class QLSV {
  
    ISoSanh sosanh;
    ArrayList<SinhVien> dssv = new ArrayList();
    SinhVien sv;

    public ISoSanh<SinhVien> getSoSanh() {
        return sosanh;
    }
    public void setSoSanh(ISoSanh<SinhVien> sosanh) {
        this.sosanh = sosanh;
    }
    public ArrayList<SinhVien> getDsSinhVien() {
        return dssv;
    }
    public void setDsSinhVien(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }
    public void sapXep()
    {
        
        dssv.sort((o1, o2) -> {
            return sosanh.soSanh(o1, o2);
        });
    }

    public void inDS(){
        for(int i=0;i<dssv.size();i++){
             System.out.println("Ten: "+dssv.get(i).getTen()+"\n"+
                                "Ngay Sinh: "+dssv.get(i).getNgaySinh()+"\n"+
                                "Diem TB: "+dssv.get(i).getDiemTB());
        }
       
    }
}
