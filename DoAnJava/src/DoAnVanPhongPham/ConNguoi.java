package DoAnVanPhongPham;
import java.util.Scanner;

public class ConNguoi {
    protected String hoten;
    protected String ngaysinh;
    protected String diachi;
    protected String sdt;
    protected String email;
    static Scanner sc = new Scanner(System.in);

    public ConNguoi() {
        this.hoten = null;
        this.ngaysinh = null;
        this.diachi = null;
        this.sdt = null;
        this.email = null;
    }
    
    public ConNguoi(String hoten, String sdt){
        this.hoten = hoten;
        this.sdt = sdt;
    }

    public ConNguoi(String hoten, String ngaysinh, String diachi, String sdt, String email) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }
    
    public void NhapInfor(){
        System.out.println("Nhập họ tên: ");
        hoten = CheckLoi.CheckTen(hoten);
        
        System.out.println("Nhập ngày tháng năm sinh: ");
        ngaysinh = CheckLoi.CheckDMY(ngaysinh);
        
        System.out.println("Nhập địa chỉ: ");
        diachi = sc.nextLine();
        
        System.out.println("Nhập số điện thoại: ");
        sdt = CheckLoi.CheckSoDienThoai(sdt);
        
        System.out.println("Nhập email: ");
        email = CheckLoi.CheckEmail(email);
    }
        
    
    public void XuatInfor(){
        System.out.printf("%-30s %-20s %-20s %-20s %s \n", hoten, ngaysinh, diachi, sdt, email);  
    }
    

    public String getHoten() {
        return hoten;
    }

    public void setHoten() {
        System.out.println("Nhập họ tên mới: ");
        hoten = CheckLoi.CheckTen(hoten);
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh() {
        System.out.println("Nhập ngày tháng năm sinh mới: ");
        ngaysinh = CheckLoi.CheckDMY(ngaysinh);
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
        return  hoten + "-" + ngaysinh + "-" + diachi + "-" + sdt + "-" + email;
    }
}
