package DoAnVanPhongPham;

import java.io.IOException;
import java.util.ArrayList;

public class DanhSachPhieuXuat {
    private ArrayList<PhieuXuatHang> dspx;

    public DanhSachPhieuXuat() {
        this.dspx = new ArrayList<PhieuXuatHang>();
    }

    public DanhSachPhieuXuat(ArrayList<PhieuXuatHang> dspx) {
        this.dspx = dspx;
    }
   
    
    public void docfiletuphieuxuat() throws IOException{
        File.docfilephieuxuat(dspx);
    }
   
    public void themphieuxuat(PhieuXuatHang px){
        dspx.add(px);
    }
    
    
    public void xuatphieuxuat( DanhSachChiTietPhieuXuat dsctpx ){
        
        int count = 1;
        for(PhieuXuatHang i : dspx){
            
            System.out.println("PHIẾU XUẤT " + count++ );
            System.out.println("");
            System.out.println("---------------------------------------------THÔNG TIN PHIẾU XUẤT HÀNG---------------------------------------------");
            System.out.printf("%-20s %-30s %s\n", "Mã phiếu xuất", "Tên nơi nhận", "Ngày xuất hàng");
            i.xuatinfophieuxuat();
            
            System.out.println("");
            System.out.println("---------------------------------------------CHI TIẾT PHIẾU XUẤT HÀNG----------------------------------------------");
            
            int stt = 1;
            double tongtien = 0;
            for( ChiTietPhieuXuat j : dsctpx.getDsctpx() ){
                
                if( i.getMaphieuxuat().compareTo(j.getMaphieuxuat()) == 0 ){
                     
                    System.out.print(stt + ".  ");
                    j.xuatchitietphieuxuat();
                    
                    tongtien = tongtien + j.ThanhTienXuatSP();
                    stt++;
                    
                    System.out.println("");
                }
                
            }
            System.out.println("Tổng tiền phiếu xuất: " + i.TongTienPhieuXuat(tongtien));
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }
    
    
    
    public void ghithongtinphieuxuatvaofile() throws IOException{
        File.ghifilephieuxuat(dspx);
    }
    

    public ArrayList<PhieuXuatHang> getDspx() {
        return dspx;
    }

    public void setDspx(ArrayList<PhieuXuatHang> dspx) {
        this.dspx = dspx;
    }

}
