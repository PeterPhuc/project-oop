package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class GIAY extends SanPham {
    private String maugiay;
    private String khogiay;

    public GIAY() {
        super();
    }

    public GIAY(String masanpham, String tensanpham, String loaisanpham, String maugiay, String khogiay, double DonGia, int soluong) {
        super(masanpham, tensanpham, loaisanpham, DonGia, soluong);
        this.maugiay = maugiay;
        this.khogiay = khogiay;
    }
    
    @Override
    public void nhapinfosanpham(){
        super.nhapinfosanpham();
        loaisanpham = "GIAY";
        System.out.println("Nhập màu giấy: ");
        maugiay = sc.nextLine();
        System.out.println("Nhập khổ giấy: ");
        khogiay = CheckLoi.CheckKhoGiay(khogiay);
    }
    
    @Override
    public void xuatinfosanpham(){
        System.out.printf("\t %-10s %-10s %-30s %-20s %-10s %-20f %d \n", masanpham, loaisanpham, tensanpham, maugiay, khogiay, DonGia, soluong);
    }
    
    @Override
    public void xuatinfospnosoluong(){
        System.out.printf("\t %-10s %-10s %-30s %-20s %-10s %f \n", masanpham, loaisanpham, tensanpham, maugiay, khogiay, DonGia);
    }

    public String getMaugiay() {
        return maugiay;
    }

    public void setMaugiay(String maugiay) {
        this.maugiay = maugiay;
    }

    public String getKhogiay() {
        return khogiay;
    }

    public void setKhogiay() {
        khogiay = CheckLoi.CheckKhoGiay(khogiay);
    }

    @Override
    public String toString() {
        return masanpham + "-" + loaisanpham + "-" + tensanpham + "-" + maugiay + "-" + khogiay + "-" + DonGia + "-" + soluong;
    }
   
}
