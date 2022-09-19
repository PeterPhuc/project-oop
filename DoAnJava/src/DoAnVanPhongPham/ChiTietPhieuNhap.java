package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;
import java.util.ArrayList;

public class ChiTietPhieuNhap {
    private String maphieunhap;
    private SanPham sp;
  
    public ChiTietPhieuNhap() {
        this.maphieunhap = null;
        this.sp = null;
    }

    public ChiTietPhieuNhap(String maphieunhap, SanPham sp) {
        this.maphieunhap = maphieunhap;
        this.sp = sp;
    }
    
    
    public void xuatchitietphieunhap(){
        sp.xuatinfosanpham();
    }

    public String getMaphieunhap() {
        return maphieunhap;
    }

    public void setMaphieunhap(ArrayList<PhieuNhapHang> dspn) {
        maphieunhap = CheckLoi.CheckMaPhieuNhap(maphieunhap, dspn);
    }

    
    public double ThanhTienNhapSP(){
        return sp.soluong * sp.DonGia;
    }

    @Override
    public String toString() {
        return maphieunhap + "-" + sp.toString();
    }
    
    
}
