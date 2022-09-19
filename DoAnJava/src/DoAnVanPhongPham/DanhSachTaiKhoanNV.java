package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;
import java.io.IOException;

public class DanhSachTaiKhoanNV {
    private TaiKhoan tknv[];

    public DanhSachTaiKhoanNV() {
    }

    public DanhSachTaiKhoanNV(TaiKhoan[] tknv) {
        this.tknv = tknv;
    }
    
    public void DocFileTaiKhoanNhanVienVaoMang() throws IOException {
        
        if(File.ktfilerong("danhsachtaikhoannhanvien.txt") == 1){
            int n = File.DemSoLuongTaiKhoanNhanVien("danhsachtaikhoannhanvien.txt");

            tknv = new TaiKhoan[n];
            tknv = File.Themtaikhoannhanvienbandauvaomang("danhsachtaikhoannhanvien.txt");
        }
    }
    
    public void themtaikhoannhanvien() throws IOException{
        
        int n = File.DemSoLuongTaiKhoanNhanVien("danhsachtaikhoannhanvien.txt");
        n++;
        
            if(File.ktfilerong("danhsachtaikhoannhanvien.txt") == 1){
                n = 1;
            }
        
        tknv = new TaiKhoan[n];
        tknv = File.Themtaikhoannhanvienmoivaomang("danhsachtaikhoannhanvien.txt");
        
        TaiKhoan taikhoannhanvienmoi = new TaiKhoan();
        taikhoannhanvienmoi.nhaptaikhoan();
        
        tknv[n-1] = taikhoannhanvienmoi;
        
        File.Ghifiledanhsachtaikhoannhanvien(tknv,n);
        
        System.out.println("Đã thêm tài khoản thành công!!!");
        
    }
    
    
    
    
    public void xoataikhoannhanvien() throws IOException {
        
        System.out.print("Nhập tên tài khoản nhân viên cần xoá: ");
        String id = sc.nextLine();
        
        int n = File.DemSoLuongTaiKhoanNhanVien("danhsachtaikhoannhanvien.txt");
        
        int check = 0;
        for(int i = 0; i < n ; i++){
            
                if( tknv[i].getTentaikhoan().compareTo(id) == 0 ){
                        check = 1;

                        for(int j = i + 1 ; j < n ; j++){
                            tknv[j - 1] = tknv[j];
                        }
                        n--;

                        File.Ghifiledanhsachtaikhoannhanvien(tknv,n);
                        
                        System.out.println("Xoá tài khoản nhân viên thành công!!!");
                        
                        break;   
                }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy tài khoản nhân viên cần xoá!!!");
        }
        
    }

    
    
    
    public TaiKhoan[] getTknv() {
        return tknv;
    }

    public void setTknv(TaiKhoan[] tknv) {
        this.tknv = tknv;
    }
}
