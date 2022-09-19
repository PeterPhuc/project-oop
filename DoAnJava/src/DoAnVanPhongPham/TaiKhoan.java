package DoAnVanPhongPham;
import static DoAnVanPhongPham.ConNguoi.sc;

public class TaiKhoan {
    private String tentaikhoan;
    private String pass;

    public TaiKhoan() {
    }

    public TaiKhoan(String tentaikhoan, String pass) {
        this.tentaikhoan = tentaikhoan;
        this.pass = pass;
    }
    
    public void nhaptaikhoan(){
        System.out.print("Nhập tên tài khoản: ");
        tentaikhoan = sc.nextLine();
        
        System.out.print("Nhập password: ");
        pass = sc.nextLine();
      
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return tentaikhoan + " " + pass;
    }
    
    
}
