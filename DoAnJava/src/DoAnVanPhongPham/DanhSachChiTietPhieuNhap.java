package DoAnVanPhongPham;

import java.io.IOException;
import java.util.ArrayList;

public class DanhSachChiTietPhieuNhap {
    private ArrayList<ChiTietPhieuNhap> dsctpn;

    public DanhSachChiTietPhieuNhap() {
        this.dsctpn = new ArrayList<>();
    }
    
    public void docfilechitietphieunhap() throws IOException{
        File.docfilechitietphieunhap(dsctpn);
    }

    public DanhSachChiTietPhieuNhap(ArrayList<ChiTietPhieuNhap> dsctpn) {
        this.dsctpn = dsctpn;
    }
    
    
    public void Themchitietphieunhap(String maphieunhap, SanPham sp) {
        
        ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(maphieunhap, sp);
        dsctpn.add(ctpn);
        
    }
    
    public void ghichitietphieunhapvaofile() throws IOException{
        File.ghifilechitietphieunhap(dsctpn);
    }

    public ArrayList<ChiTietPhieuNhap> getDsctpn() {
        return dsctpn;
    }

    public void setDsctpn(ArrayList<ChiTietPhieuNhap> dsctpn) {
        this.dsctpn = dsctpn;
    }
   
}
