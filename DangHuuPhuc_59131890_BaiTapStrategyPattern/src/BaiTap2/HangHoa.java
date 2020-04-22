/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author huuph
 */
public class HangHoa {
    ArrayList dsHH = new ArrayList();
    
    private String tenHH,moTa;
    private int gia;
    public String setTenHH(String tenHH){
        this.tenHH = tenHH;
        return tenHH;
    }
    public String getTenHH(){
        return tenHH;
    }
    public String setMoTa(String moTa){
        this.moTa = moTa;
        return moTa;
    }
    public String getMoTa(){
        return moTa;
    }
    public int Gia(int gia){
        this.gia = gia;
        return gia;
    }
    public int getGia(){
        return gia;
    }
    
}
