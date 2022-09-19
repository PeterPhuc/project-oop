package DoAnVanPhongPham;

import java.io.IOException;
import java.util.ArrayList;

public class DanhSachChiTietHoaDon {
    private ArrayList<ChiTietHoaDon> dscthd;

    public DanhSachChiTietHoaDon() {
        this.dscthd = new ArrayList<>();
    }

    public DanhSachChiTietHoaDon(ArrayList<ChiTietHoaDon> dscthd) {
        this.dscthd = dscthd;
    }
    
    public void docfilechitiethoadon() throws IOException{
        File.docfilechitiethoadon(dscthd);
    }
    
    public void Themchitiethoadon(String mahoadon, SanPham sp) {
        
        ChiTietHoaDon cthd = new ChiTietHoaDon(mahoadon, sp);
        dscthd.add(cthd);
        
    }
   
    public ArrayList<ChiTietHoaDon> getDscthd() {
        return dscthd;
    }

    public void setDscthd(ArrayList<ChiTietHoaDon> dscthd) {
        this.dscthd = dscthd;
    }
}
