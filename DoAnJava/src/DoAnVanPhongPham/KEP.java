package DoAnVanPhongPham;
import static DoAnVanPhongPham.ConNguoi.sc;

public class KEP extends SanPham {
    private String maukep;
    
    public KEP() {
        super();
    }

    public KEP(String masanpham, String tensanpham, String loaisanpham, String maukep, double DonGia, int soluong) {
        super(masanpham, tensanpham, loaisanpham, DonGia, soluong);
        this.maukep = maukep;
    }
    
    @Override
    public void nhapinfosanpham(){
        super.nhapinfosanpham();
        loaisanpham = "KEP";
        System.out.println("Nhập tên kẹp: ");
        tensanpham = sc.nextLine();
        System.out.println("Nhập màu kẹp: ");
        maukep = sc.nextLine();
    }
    
    @Override
    public void xuatinfosanpham(){
        System.out.printf("\t %-10s %-10s %-25s %-20s %-20f %d \n", masanpham, loaisanpham, tensanpham, maukep, DonGia, soluong);
    }
    
    @Override
    public void xuatinfospnosoluong(){
        System.out.printf("\t %-10s %-10s %-25s %-20s %f \n", masanpham, loaisanpham, tensanpham, maukep, DonGia);
    }

    public String getMaukep() {
        return maukep;
    }

    public void setMaukep(String maukep) {
        this.maukep = maukep;
    }
    
    @Override
    public String toString() {
        return masanpham + "-" + loaisanpham + "-" + tensanpham + "-" + maukep + "-" + DonGia + "-" + soluong;
    }
}
