package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class QuanLy extends ConNguoi {
    private String maquanly;
    
    public QuanLy() {
    }

    public QuanLy(String maquanly, String hoten, String ngaysinh, String diachi, String sdt, String email) {
        super(hoten, ngaysinh, diachi, sdt, email);
        this.maquanly = maquanly;
    }

    
    @Override
    public void NhapInfor(){
        System.out.println("Nhập mã quản lý: ");
        maquanly = sc.nextLine();
        super.NhapInfor();
        
    }
    
    @Override
    public void XuatInfor(){
        System.out.printf("%-10s ", maquanly);
        super.XuatInfor();
      
    }

    public String getMaquanly() {
        return maquanly;
    }

    public void setMaquanly(String maquanly) {
        this.maquanly = maquanly;
    }

}
