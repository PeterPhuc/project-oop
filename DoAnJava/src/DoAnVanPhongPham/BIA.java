package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class BIA extends SanPham {
    private String maubia;
    private String khobia;

    public BIA() {
        super();
        maubia = null;
        khobia = null;
    }

    public BIA(String masanpham, String tensanpham, String loaisanpham, String maubia, String khobia, double DonGia, int soluong) {
        super(masanpham, tensanpham, loaisanpham, DonGia, soluong);
        this.maubia = maubia;
        this.khobia = khobia;
    }
    
    @Override
    public void nhapinfosanpham(){
        super.nhapinfosanpham();
        loaisanpham = "BIA";
        System.out.println("Nhập màu bìa: ");
        maubia = sc.nextLine();
        System.out.println("Nhập khổ bìa: ");
        khobia = CheckLoi.CheckKhoGiay(khobia);
    }
    
    @Override
    public void xuatinfosanpham(){
        System.out.printf("\t %-10s %-10s %-30s %-20s %-10s %-20f %d \n", masanpham, loaisanpham, tensanpham, maubia, khobia, DonGia, soluong);
    }
    
    
    @Override
    public void xuatinfospnosoluong(){
        System.out.printf("\t %-10s %-10s %-30s %-20s %-10s %f \n", masanpham, loaisanpham, tensanpham, maubia, khobia, DonGia);
    }
    

    public String getMaubia() {
        return maubia;
    }

    public void setMaubia(String maubia) {
        this.maubia = maubia;
    }

    public String getKhobia() {
        return khobia;
    }

    public void setKhobia() {
        this.khobia = CheckLoi.CheckKhoGiay(khobia);
    }
    
    @Override
    public String toString() {
        return masanpham + "-" + loaisanpham + "-" + tensanpham + "-" + maubia + "-" + khobia + "-" + DonGia + "-" + soluong;
    }
}
