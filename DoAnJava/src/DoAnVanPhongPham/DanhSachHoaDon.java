package DoAnVanPhongPham;

import java.io.IOException;
import java.util.ArrayList;
import static DoAnVanPhongPham.ConNguoi.sc;

public class DanhSachHoaDon {
    private ArrayList<HoaDon> dshd;

    public DanhSachHoaDon() {
        this.dshd = new ArrayList<HoaDon>();
    }

    public DanhSachHoaDon(ArrayList<HoaDon> dshd) {
        this.dshd = dshd;
    }
   
    
    public void docfilehoadon() throws IOException{
        File.docfilehoadon(dshd);
    }
    
    //Thêm hd
    public void themhd(HoaDon hd){
        dshd.add(hd);
    }
    
    
    public void xuathd( DanhSachChiTietHoaDon dscthd ){
        
        int count = 1;
        for(HoaDon i : dshd){
            
            System.out.println("HOÁ ĐƠN " + count++ );
            System.out.println("");
            System.out.println("---------------------------------------------THÔNG TIN HOÁ ĐƠN---------------------------------------------");
            System.out.printf("%-20s %-20s %-30s %s\n","Mã hoá đơn", "Mã khách hàng", "Mã nhân viên thanh toán", "Ngày lập hoá đơn");
            i.xuathoadon();
            
            System.out.println("");
            System.out.println("---------------------------------------------CHI TIẾT HOÁ ĐƠN----------------------------------------------");
            
            int stt = 1;
            double tongtien = 0;
            for( ChiTietHoaDon j : dscthd.getDscthd() ){
                
                if( i.getMahoadon().compareTo(j.getMahoadon()) == 0 ){
                     
                    System.out.print(stt + ".  ");
                    j.xuatchitiethoadon();
                    
                    tongtien = tongtien + j.ThanhTien();
                    stt++;
                    
                    System.out.println("");
                }
                
            }
           
            System.out.println("Tổng tiền hoá đơn: " + i.TongTienHoaDon(tongtien));
            System.out.printf("\n\n");
        }
    }
    
    
    public void xuathdchokhachhang(DanhSachChiTietHoaDon dscthd, String mahoadon ){
        
        for( HoaDon i : dshd ){
           
            if( mahoadon.compareTo(i.getMahoadon()) == 0 ){//tìm thấy mã hoá đơn
                
                System.out.println("---------------------------------------------THÔNG TIN HOÁ ĐƠN---------------------------------------------");
                System.out.printf("%-10s %-10s %-20s %s\n","Mã hoá đơn", "Mã khách hàng", "Mã nhân viên thanh toán", "Ngày lập hoá đơn");
                i.xuathoadon();

                System.out.println("");
                System.out.println("---------------------------------------------CHI TIẾT HOÁ ĐƠN----------------------------------------------");

                int stt = 1;
                double tongtien = 0;
                for( ChiTietHoaDon j : dscthd.getDscthd() ){

                    if( i.getMahoadon().compareTo(j.getMahoadon()) == 0 ){

                        System.out.print(stt + ".  ");
                        j.xuatchitiethoadon();

                        tongtien = tongtien + j.ThanhTien();
                        stt++;

                        System.out.println("");
                    }

                }

                System.out.println("Tổng tiền hoá đơn: " + i.TongTienHoaDon(tongtien));
                break;
            }
            
        }
    }
   
    
    //TÌM HOÁ ĐƠN THEO MÃ HOÁ ĐƠN
    public void TimKiemHoaDonTheoMaHoaDon( DanhSachChiTietHoaDon dscthd ){
        String mahoadon = null;
        mahoadon = CheckLoi.CheckNhapMaHoaDon(mahoadon);
        
        int check = 0;
        for( HoaDon i : dshd ){
           
            if( mahoadon.compareTo(i.getMahoadon()) == 0 ){//tìm thấy mã hoá đơn
                check = 1;
                System.out.println("Đã tìm thấy hoá đơn: ");
                
                System.out.println("---------------------------------------------THÔNG TIN HOÁ ĐƠN---------------------------------------------");
                System.out.printf("%-10s %-10s %-20s %s\n","Mã hoá đơn", "Mã khách hàng", "Mã nhân viên thanh toán", "Ngày lập hoá đơn");
                i.xuathoadon();

                System.out.println("");
                System.out.println("---------------------------------------------CHI TIẾT HOÁ ĐƠN----------------------------------------------");

                int stt = 1;
                double tongtien = 0;
                for( ChiTietHoaDon j : dscthd.getDscthd() ){

                    if( i.getMahoadon().compareTo(j.getMahoadon()) == 0 ){

                        System.out.print(stt + ".  ");
                        j.xuatchitiethoadon();

                        tongtien = tongtien + j.ThanhTien();
                        stt++;

                        System.out.println("");
                    }

                }

                System.out.println("Tổng tiền hoá đơn: " + i.TongTienHoaDon(tongtien));
                break;
            }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy hoá đơn nào cả!!!");
        }
    }
    
    
    
    //TÌM HOÁ ĐƠN THEO MÃ KHÁCH HÀNG
    public void TimKiemHoaDonTheoMaKhachHang( DanhSachChiTietHoaDon dscthd ){
        String makhachhang = null;
        makhachhang = CheckLoi.CheckMaKhachHang(makhachhang);
        
        int check = 0;
        for( HoaDon i : dshd ){
           
            if( makhachhang.compareTo(i.getMakhachhang()) == 0 ){//tìm thấy mã khách hàng
                check = 1;
                System.out.println("Đã tìm thấy hoá đơn: ");
                
                System.out.println("---------------------------------------------THÔNG TIN HOÁ ĐƠN---------------------------------------------");
                System.out.printf("%-10s %-10s %-20s %s\n","Mã hoá đơn", "Mã khách hàng", "Mã nhân viên thanh toán", "Ngày lập hoá đơn");
                i.xuathoadon();

                System.out.println("");
                System.out.println("---------------------------------------------CHI TIẾT HOÁ ĐƠN----------------------------------------------");

                int stt = 1;
                double tongtien = 0;
                for( ChiTietHoaDon j : dscthd.getDscthd() ){

                    if( i.getMahoadon().compareTo(j.getMahoadon()) == 0 ){

                        System.out.print(stt + ".  ");
                        j.xuatchitiethoadon();

                        tongtien = tongtien + j.ThanhTien();
                        stt++;

                        System.out.println("");
                    }

                }

                System.out.println("Tổng tiền hoá đơn: " + i.TongTienHoaDon(tongtien));
                break;
            }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy hoá đơn nào cả!!!");
        }
    }
    
    
    
    public ArrayList<HoaDon> getDshd() {
        return dshd;
    }

    public void setDshd(ArrayList<HoaDon> dshd) {
        this.dshd = dshd;
    }
    
}
