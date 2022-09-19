package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class NhanVien extends ConNguoi implements Luong {
    private String manhanvien;
    private double luong = 5000.0;

    public NhanVien() {
        super();
    }

    public NhanVien(String manhanvien, String hoten, String ngaysinh, String diachi, String sdt, String email, double luong) {
        super(hoten, ngaysinh, diachi, sdt, email);
        this.manhanvien = manhanvien;
        this.luong = luong;
    }
    
    @Override
    public void NhapInfor(){
        /*System.out.println("Nhập mã nhân viên: ");
        manhanvien = CheckLoi.CheckMaNhanVien(manhanvien);*/
        manhanvien = TaoMaTuDong.TaoMaNhanVien();
        super.NhapInfor();
    }
    
    @Override
    public void XuatInfor(){
        System.out.printf("\t %-21s", manhanvien);
        super.XuatInfor();
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        manhanvien = CheckLoi.CheckMaNhanVien(manhanvien);
        this.manhanvien = manhanvien;
    }

    public double getLuong() {
        return luong;
    }
    

    public void setLuong() {
        CheckLoi.CheckQuyen();
        System.out.println("Nhập lương mới cho nhân viên: ");
        
        String temp = null;
        luong = CheckLoi.CheckNhapSoThuc(temp);
    }
    
    
    
    @Override
    public void PhatLuong(){
        System.out.println("Nhập lương của nhân viên " + hoten);
        luong = sc.nextDouble();
    }
    
    @Override
    public double XemLuong(){
        return luong;
    }

    @Override
    public String toString() {
        return manhanvien + "-" + super.toString() + "-" + luong;
    }
    
}
