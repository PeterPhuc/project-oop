package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class ChiTietPhieuXuat {
    private String maphieuxuat;
    private SanPham sp;

    public ChiTietPhieuXuat() {
        this.maphieuxuat = null;
        this.sp = null;
    }

    public ChiTietPhieuXuat(String maphieuxuat, SanPham sp) {
        this.maphieuxuat = maphieuxuat;
        this.sp = sp;
    }
    
    public void xuatchitietphieuxuat(){
        sp.xuatinfosanpham();
    }

    public String getMaphieuxuat() {
        return maphieuxuat;
    }

    public void setMaphieuxuat(String maphieuxuat) {
        this.maphieuxuat = maphieuxuat;
    }

    public double ThanhTienXuatSP(){
        return sp.soluong * sp.DonGia;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    @Override
    public String toString() {
        return maphieuxuat + "-" + sp.toString();
    }
    
    
}
