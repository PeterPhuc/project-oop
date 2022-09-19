package DoAnVanPhongPham;
import static DoAnVanPhongPham.ConNguoi.sc;
import java.util.ArrayList;

public class PhieuXuatHang {
    private String maphieuxuat;
    private String tennoinhan;
    private String ngayxuathang;

    public PhieuXuatHang() {
        this.maphieuxuat = null;
        this.tennoinhan = null;
        this.ngayxuathang = null;
    }

    public PhieuXuatHang(String maphieuxuat, String tennoinhan, String ngayxuathang) {
        this.maphieuxuat = maphieuxuat;
        this.tennoinhan = tennoinhan;
        this.ngayxuathang = ngayxuathang;
    }
    
    public void nhapinfophieuxuat( ArrayList<PhieuXuatHang> dspx ){
        /*System.out.println("Nhập mã phiếu xuất (Ví dụ: PX1001): ");
        maphieuxuat = CheckLoi.CheckMaPhieuXuat(maphieuxuat, dspx);*/
        maphieuxuat = TaoMaTuDong.TaoMaPhieuXuat();
        
        System.out.println("Nhập tên nơi nhận hàng: ");
        tennoinhan = CheckLoi.CheckTen(tennoinhan);
        
        /*System.out.println("Nhập ngày xuất hàng: ");
        ngayxuathang = CheckLoi.CheckDMY(ngayxuathang);*/
        ngayxuathang = TaoMaTuDong.LayNgayHienTai();
    }
    
    public void xuatinfophieuxuat(){
        System.out.printf("%-20s %-30s %s\n", maphieuxuat, tennoinhan, ngayxuathang);
    }

    public String getMaphieuxuat() {
        return maphieuxuat;
    }

    public void setMaphieuxuat(ArrayList<PhieuXuatHang> dspx) {
        maphieuxuat = CheckLoi.CheckMaPhieuXuat(maphieuxuat, dspx);
    }

    public String getTennoinhan() {
        return tennoinhan;
    }

    public void setTennoinhan(String tennoinhan) {
        this.tennoinhan = tennoinhan;
    }
    
    public String getNgayxuathang() {
        return ngayxuathang;
    }

    public void setNgayxuathang() {
        ngayxuathang = CheckLoi.CheckDMY(ngayxuathang);
    }
    
    public double TongTienPhieuXuat( double tongtien ){
        return tongtien;
    }

    @Override
    public String toString() {
        return maphieuxuat + "-" + tennoinhan + "-" + ngayxuathang;
    }
    
    
}
