package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class ChiTietHoaDon {
    private String mahoadon;
    private SanPham sp;

    public ChiTietHoaDon() {
        this.mahoadon = null;
        this.sp = null;
    }

    public ChiTietHoaDon(String mahoadon, SanPham sp) {
        this.mahoadon = mahoadon;
        this.sp = sp;
    }
    
    
    public void xuatchitiethoadon(){
        sp.xuatinfosanpham();
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon() {
        mahoadon = CheckLoi.CheckNhapMaHoaDon(mahoadon);
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }
    
    public double ThanhTien(){
        return sp.getSoluong() * sp.getDonGia();
    }

    @Override
    public String toString() {
        return mahoadon + "-" + sp.toString();
    }
    
}
