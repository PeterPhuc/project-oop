package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class TapVo extends SanPham {
    private int sotrang;

    public TapVo() {
        super();
    }

    public TapVo(String masanpham, String tensanpham, String loaisanpham, int sotrang, double DonGia, int soluong) {
        super(masanpham, tensanpham, loaisanpham, DonGia, soluong);
        this.sotrang = sotrang;
    }
    
    @Override
    public void nhapinfosanpham(){
        super.nhapinfosanpham();
        loaisanpham = "TAP";
        System.out.println("Nhập tên tập: ");
        tensanpham = sc.nextLine();
        
        System.out.println("Nhập số trang tập: ");
        String dg = null;
        sotrang = CheckLoi.CheckNhapSoNguyen(dg);
        
    }
    
    @Override
    public void xuatinfosanpham(){
        System.out.printf("\t %-10s %-10s %-30s %-10d %-25f %d \n", masanpham, loaisanpham, tensanpham, sotrang, DonGia, soluong);
    }
    
    @Override
    public void xuatinfospnosoluong(){
        System.out.printf("\t%-10s %-10s %-30s %-10d %f \n", masanpham, loaisanpham, tensanpham, sotrang, DonGia);
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    
    @Override
    public String toString() {
        return masanpham + "-" + loaisanpham + "-" + tensanpham + "-" + sotrang + "-" + DonGia + "-" + soluong;
    }
}
