/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author huuph
 */
public class BaiTap2_main {
    public static void main(String[] args) {
        GioHang gh1 = new GioHang();
        gh1.setHinhThucTT(new ThanhToanOnline());
        HangHoa onl1 = new HangHoa("Cafe","Màu Đen",120000);
        HangHoa onl2 = new HangHoa("Áo","Màu Trắng",360000);
        HangHoa onl3 = new HangHoa("Tai Nghe","Màu Xanh",540000);
        GioHang gh2 = new GioHang();        
        gh2.setHinhThucTT(new ThanhToanCOD());
        HangHoa cod1 = new HangHoa("Sữa đặc","Ngọt",15000);
        HangHoa cod2 = new HangHoa("Túi xách","Chất liệu Da",2300000);
        HangHoa cod3 = new HangHoa("Đèn","Màu xanh",20000);
        gh1.them(onl1);
        gh1.them(onl2);
        gh1.them(onl3);
        gh2.them(cod1);
        gh2.them(cod2);
        gh2.them(cod3);
        System.out.println("Danh Sách Hang Hoa: "+"\n");
        gh1.getTTHH();
        gh2.getTTHH();
        gh1.tienHangHoa();
        gh2.tienHangHoa();
        System.out.print("Tiền Hàng: "+"\n"+
                         "Giỏ Hàng 1: "+
                         gh1.tienHangHoa()+"\n"+
                         "Gio Hang 2: "+
                         gh2.tienHangHoa()+"\n"+
                         "Tiền khách trả: "+"\n"+"Gio hang 1: "+gh1.thanhToan()+"\n"+"Gio hang 2: "+gh2.thanhToan()+"\n");
    }
}
