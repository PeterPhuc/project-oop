package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class HoaDon {
    private String mahoadon;
    private String makhachhang;
    private String manhanvien;
    private String ngaylaphoadon;

    public HoaDon() {
        this.mahoadon = null;
        this.makhachhang = null;
        this.manhanvien = null;
        this.ngaylaphoadon = null;
    }

    public HoaDon(String mahoadon, String makhachhang, String manhanvien, String ngaylaphoadon) {
        this.mahoadon = mahoadon;
        this.makhachhang = makhachhang;
        this.manhanvien = manhanvien;
        this.ngaylaphoadon = ngaylaphoadon;
    }
    
    
    public void nhaphoadon(String makhachhang){
        /*System.out.print("Nhập mã hoá đơn: ");
        mahoadon = CheckLoi.CheckNhapMaHoaDon(mahoadon);*/
        this.mahoadon = TaoMaTuDong.TaoMaHoaDon();
        
        /*System.out.print("Nhập mã khách hàng: ");
        makhachhang = CheckLoi.CheckMaKhachHang(makhachhang);*/
        this.makhachhang = makhachhang;
        
        System.out.print("Nhập mã nhân viên thanh toán: ");
        manhanvien = CheckLoi.CheckMaNhanVien(manhanvien);
        
        /*System.out.print("Nhập ngày lập hoá đơn: ");
        ngaylaphoadon = CheckLoi.CheckDMY(ngaylaphoadon);*/
        ngaylaphoadon = TaoMaTuDong.LayNgayHienTai();
        
    }
    
    public void xuathoadon(){
        System.out.printf("%-20s %-20s %-30s %s\n", mahoadon, makhachhang, manhanvien, ngaylaphoadon);
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon() {
        mahoadon = CheckLoi.CheckNhapMaHoaDon(mahoadon);    
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang() {
        makhachhang = CheckLoi.CheckMaKhachHang(makhachhang);
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien() {
        manhanvien = CheckLoi.CheckMaNhanVien(manhanvien);
    }

    public String getNgaylaphoadon() {
        return ngaylaphoadon;
    }

    public void setNgaylaphoadon() {
        ngaylaphoadon = CheckLoi.CheckDMY(ngaylaphoadon);
    }
    
    public double TongTienHoaDon( double tongtien ){
        return tongtien;
    }

    @Override
    public String toString() {
        return mahoadon + "-" + makhachhang + "-" + manhanvien + "-" + ngaylaphoadon;
    }

}
