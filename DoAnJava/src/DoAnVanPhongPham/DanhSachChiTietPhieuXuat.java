package DoAnVanPhongPham;

import java.io.IOException;
import java.util.ArrayList;

public class DanhSachChiTietPhieuXuat {
    private ArrayList<ChiTietPhieuXuat> dsctpx;

    public DanhSachChiTietPhieuXuat() {
        this.dsctpx = new ArrayList<>();
    }
    
    public void docfilechitietphieuxuat() throws IOException{
        File.docfilechitietphieuxuat(dsctpx);
    }

    public DanhSachChiTietPhieuXuat(ArrayList<ChiTietPhieuXuat> dsctpx) {
        this.dsctpx = dsctpx;
    }
    
    
    public void Themchitietphieuxuat(String maphieuxuat, SanPham sp) {
        
        ChiTietPhieuXuat ctpx = new ChiTietPhieuXuat(maphieuxuat, sp);
        dsctpx.add(ctpx);
        
    }
    
    public void ghichitietphieuxuatvaofile() throws IOException{
        File.ghifilechitietphieuxuat(dsctpx);
    }

    public ArrayList<ChiTietPhieuXuat> getDsctpx() {
        return dsctpx;
    }

    public void setDsctpx(ArrayList<ChiTietPhieuXuat> dsctpx) {
        this.dsctpx = dsctpx;
    }
    
}
