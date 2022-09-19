package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class BUT extends SanPham {
    private String loaisanpham = "BUT";
    private String maubut;

    public BUT() {
        super();
        this.maubut = null;
    }
    
    public BUT(String masanpham, String tensanpham, String loaisanpham, String maubut, double DonGia, int soluong) {
        super(masanpham, tensanpham, loaisanpham, DonGia, soluong);
        this.maubut = maubut;
    }
    
    @Override
    public void nhapinfosanpham(){
        super.nhapinfosanpham();
        loaisanpham = "BUT";
        System.out.println("Nhập màu bút: ");
        maubut = sc.nextLine();
    }
    
    @Override
    public void xuatinfosanpham(){
        System.out.printf("\t %-10s %-10s %-25s %-20s %-30f %d \n", masanpham, loaisanpham, tensanpham, maubut, DonGia, soluong);
    }
    
    @Override
    public void xuatinfospnosoluong(){
        System.out.printf("\t %-10s %-10s %-25s %-20s %f \n", masanpham, loaisanpham, tensanpham, maubut, DonGia);
    }

    public String getMaubut() {
        return maubut;
    }

    public void setMaubut(String maubut) {
        this.maubut = maubut;
    }
   
    @Override
    public String toString() {
        return masanpham + "-" + loaisanpham + "-" + tensanpham + "-" + maubut + "-" + DonGia + "-" + soluong;
    }
}
