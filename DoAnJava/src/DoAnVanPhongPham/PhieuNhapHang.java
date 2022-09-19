package DoAnVanPhongPham;
import static DoAnVanPhongPham.ConNguoi.sc;
import java.util.ArrayList;

public class PhieuNhapHang {
    private String maphieunhap;
    private String manhacungcap;
    private String ngaynhanhang;

    public PhieuNhapHang() {
        this.maphieunhap = null;
        this.manhacungcap = manhacungcap;
        this.ngaynhanhang = null;
    }

    public PhieuNhapHang(String maphieunhap, String manhacungcap, String ngaynhanhang) {
        this.maphieunhap = maphieunhap;
        this.manhacungcap = manhacungcap;
        this.ngaynhanhang = ngaynhanhang;
    }
    
    public void nhapinfophieunhap(ArrayList<PhieuNhapHang> dspn){
        /*System.out.println("Nhập mã phiếu nhập (Ví dụ: PN1001): ");
        maphieunhap = CheckLoi.CheckMaPhieuNhap(maphieunhap, dspn);*/
        maphieunhap = TaoMaTuDong.TaoMaPhieuNhap();
        
        System.out.println("Nhập mã nhà cung cấp (Ví dụ: NCC1001): ");
        manhacungcap = CheckLoi.CheckMaNhaCungCap(manhacungcap);
        
        /*System.out.println("Nhập ngày nhận hàng: ");
        ngaynhanhang = CheckLoi.CheckDMY(ngaynhanhang);*/
        ngaynhanhang = TaoMaTuDong.LayNgayHienTai();
    }
    
    public void xuatinfophieunhap(){
        System.out.printf("%-20s %-30s %s\n", maphieunhap, manhacungcap, ngaynhanhang);
    }

    public String getMaphieunhap() {
        return maphieunhap;
    }

    public void setMaphieunhap(ArrayList<PhieuNhapHang> dspn) {
        maphieunhap = CheckLoi.CheckMaPhieuNhap(maphieunhap, dspn);
    }

    
    public String getNgaynhanhang() {
        return ngaynhanhang;
    }

    public void setNgaynhanhang() {
        ngaynhanhang = CheckLoi.CheckDMY(ngaynhanhang);
    }
    
    public double TongTienPhieuNhap( double tongtien ){
        return tongtien;
    }

    @Override
    public String toString() {
        return maphieunhap + "-" + manhacungcap + "-" + ngaynhanhang;
    }
    
}
