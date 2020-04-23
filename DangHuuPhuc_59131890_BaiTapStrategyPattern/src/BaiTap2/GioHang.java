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
public class GioHang {
    IThanhToan HinhThucTT;
    ArrayList<HangHoa> hh = new ArrayList<HangHoa>();
    int tienHang = 0;
    public int tienHangHoa(){       
        for(int i=0;i<hh.size();i++){
            tienHang += hh.get(i).getGia();
        }
        return tienHang;
    }

    public void setHinhThucTT(IThanhToan HinhThucTT){
        this.HinhThucTT = HinhThucTT;
        
    }
    public void them(HangHoa h1){
        hh.add(h1);
    }
    public double thanhToan(){
       return HinhThucTT.thanhToan(tienHang);
    }
    public void getTTHH(){
        for(int i=0;i<hh.size();i++){
            System.out.print("Tên Hàng Hóa: "+hh.get(i).getTenHH()+"\n"+
                    "Giá: "+hh.get(i).getGia()+"\n"
                   );
        }
    }

    
}
