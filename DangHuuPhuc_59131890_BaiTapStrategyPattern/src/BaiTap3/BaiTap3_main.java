/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 *
 * @author huuph
 */
public class BaiTap3_main {
        /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        SinhVien sv1 = new SinhVien("Dang Huu Phuc",formatter.parse("16-12-1999"),(float)9.2);
        SinhVien sv2 = new SinhVien("Dang Huu Mai",formatter.parse("16-12-1999"),(float)9.7);
        SinhVien sv3 = new SinhVien("Dang Huu Le",formatter.parse("16-12-1999"),(float)6.2);
        QLSV ql1 = new QLSV();        
        ql1.getDsSinhVien().add(sv1);
        ql1.getDsSinhVien().add(sv2);
        ql1.getDsSinhVien().add(sv3);
        ql1.setSoSanh(new SoSanhTheoTen());
        ql1.sapXep();
        System.out.println("Danh Sach so sanh theo ten: ");
        ql1.inDS();        
        QLSV ql2 = new QLSV();
        ql2.getDsSinhVien().add(sv1);
        ql2.getDsSinhVien().add(sv2);
        ql2.getDsSinhVien().add(sv3);
        ql2.setSoSanh(new SoSanhTheoDiem());
        ql2.sapXep();
        System.out.println("Danh Sach so sanh theo diem: ");
        ql2.inDS();
    }
}
