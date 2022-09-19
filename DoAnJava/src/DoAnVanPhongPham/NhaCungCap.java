package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class NhaCungCap {
    private String manhacungcap;
    private String tennhacungcap;
    private String diachi;
    private String sdt;
    private String email;

    public NhaCungCap() {
    }

    public NhaCungCap(String manhacungcap, String tennhacungcap, String diachi, String sdt, String email) {
        this.manhacungcap = manhacungcap;
        this.tennhacungcap = tennhacungcap;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }
    
    public void NhapInforNhacungcap(){
        /*System.out.println("Nhập mã nhà cung cấp: ");
        manhacungcap = CheckLoi.CheckMaNhaCungCap(manhacungcap);*/
        manhacungcap = TaoMaTuDong.TaoMaNhaCungCap();
        
        System.out.println("Nhập tên nhà cung cấp: ");
        tennhacungcap = CheckLoi.CheckTen(tennhacungcap);
        
        System.out.println("Nhập địa chỉ: ");
        diachi = sc.nextLine();
        
        System.out.println("Nhập số điện thoại: ");
        sdt = CheckLoi.CheckSoDienThoai(sdt);
        
        System.out.println("Nhập email: ");
        email = CheckLoi.CheckEmail(email);
    }
    
    public void XuatInforNhacungcap(){
        System.out.printf("\t %-20s %-30s %-20s %-20s %s\n", manhacungcap, tennhacungcap, diachi, sdt, email);
    }

    public String getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap() {
        manhacungcap = CheckLoi.CheckMaNhaCungCap(manhacungcap);
    }

    public String getTennhacungcap() {
        return tennhacungcap;
    }

    public void setTennhacungcap() {
        System.out.println("Nhập tên mới: ");
        tennhacungcap = CheckLoi.CheckTen(tennhacungcap);
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi() {
        System.out.println("Nhập địa chỉ mới: ");
        diachi = sc.nextLine();
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt() {
        System.out.println("Nhập số điện thoại mới: ");
        sdt = CheckLoi.CheckSoDienThoai(sdt);
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail() {
        System.out.println("Nhập email mới: ");
        email = CheckLoi.CheckEmail(email);
    }

    @Override
    public String toString() {
        return manhacungcap + "-" + tennhacungcap + "-" + diachi + "-" + sdt + "-" + email;
    }
    
    
}
