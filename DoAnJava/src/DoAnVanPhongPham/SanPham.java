package DoAnVanPhongPham;
import static DoAnVanPhongPham.ConNguoi.sc;

public abstract class SanPham {
    protected String masanpham;
    protected String tensanpham;
    protected String loaisanpham;
    protected double DonGia;
    protected int soluong;
    
    public SanPham(SanPham a){
        
    }

    public SanPham() {
    }
    
    public SanPham(String masanpham, String tensanpham, String loaisanpham, double DonGia, int soluong) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.loaisanpham = loaisanpham;
        this.DonGia = DonGia;
        this.soluong = soluong;
    }
    
    public void nhapinfosanpham(){
        System.out.println("Nhập mã sản phẩm: ");
        masanpham = CheckLoi.CheckMaSanPhamBut(masanpham);
        System.out.println("Nhập tên sản phẩm: ");
        tensanpham = CheckLoi.CheckTen(tensanpham);
        System.out.println("Nhập đơn giá: ");
        String temp = null;
        DonGia = CheckLoi.CheckNhapSoThuc(temp);
        System.out.println("Nhập số lượng: ");
        soluong = CheckLoi.CheckNhapSoNguyen(temp);
    }
    
    public abstract void xuatinfosanpham();
    
    public abstract void xuatinfospnosoluong();

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getLoaisanpham() {
        return loaisanpham;
    }

    public void setLoaisanpham(String loaisanpham) {
        this.loaisanpham = loaisanpham;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }
    
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    @Override
    public String toString() {
        return masanpham + "--" + loaisanpham + "--" + tensanpham + "--" + DonGia + "--" + soluong;
    }
    
    
}
