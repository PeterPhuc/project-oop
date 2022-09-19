package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class KhachHang extends ConNguoi {
    private String makhachhang;

    public KhachHang() {
        super();
        this.makhachhang = "null";
    }

    public KhachHang(String makhachhang, String hoten , String ngaysinh, String diachi, String sdt, String email) {
        super(hoten, ngaysinh, diachi, sdt, email);
        this.makhachhang = makhachhang;
    }
    
    public KhachHang(String makhachhang) {
        this.makhachhang = makhachhang;
    }
    
    @Override
    public void NhapInfor(){
        makhachhang = TaoMaTuDong.TaoMaKhachHang();
        super.NhapInfor();
    }
    
    @Override
    public void XuatInfor(){
        System.out.printf("\t %-21s", makhachhang);
        super.XuatInfor();
    }
    
    
    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang() {
        makhachhang = CheckLoi.CheckMaKhachHang(makhachhang);
    }

    @Override
    public String toString() {
        return makhachhang + "-" + super.toString();
    }
    
}
