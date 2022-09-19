package DoAnVanPhongPham;
import static DoAnVanPhongPham.ConNguoi.sc;
import java.io.IOException;

public class DanhSachNhanVien {
    private NhanVien[] dsnv;

    public DanhSachNhanVien() {
    }
    
    public DanhSachNhanVien(NhanVien[] dsnv) {
        this.dsnv = dsnv;
    }
    
    
    public void DocFileNhanVienVaoMang() throws IOException {
        
        if(File.ktfilerong("danhsachnhanvien.txt") == 1){
            int n = File.DemSoLuongNhanVien("danhsachnhanvien.txt");

            dsnv = new NhanVien[n];
            dsnv = File.Themnhanvienbandauvaomang("danhsachnhanvien.txt");
        }
    }
    
    
    
    //Thêm nv
    public void themnhanvien() throws IOException{
        int n = File.DemSoLuongNhanVien("danhsachnhanvien.txt");
        n++;
        
            if(File.ktfilerong("danhsachnhanvien.txt") == 0){
                n = 1;
            }
        
        dsnv = new NhanVien[n];
        dsnv = File.Themnhanvienmoivaomang("danhsachnhanvien.txt");
        
        NhanVien nhanvienmoi = new NhanVien();
        nhanvienmoi.NhapInfor();
        
        dsnv[n-1] = nhanvienmoi;
        
        File.Ghifiledanhsachnhanvien(dsnv,n);
                
        System.out.println("Thêm nhân viên thành công!!!");
        
    }
    
    
    
    
    //Xoá nv theo mã nv
    public void xoanhanvientheomanv() throws IOException{
        System.out.print("Nhập mã nhân viên cần xoá: ");
        String id = null;
        id = CheckLoi.CheckMaNhanVien(id);
        
        int n = File.DemSoLuongNhanVien("danhsachnhanvien.txt");
        
        int check = 0;
        for(int i = 0; i < n ; i++){
            
                if( dsnv[i].getManhanvien().compareTo(id) == 0 ){
                        check = 1;

                        for(int j = i + 1 ; j < n ; j++){
                            dsnv[j - 1] = dsnv[j];
                        }
                        n--;

                        File.Ghifiledanhsachnhanvien(dsnv,n);
                        
                        System.out.println("Xoá nhân viên thành công!!!");
                        
                        break;   
                }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy nhân viên cần xoá!!!");
        }
    }
    
    
    
    //Xoá nv theo số đt
    public void xoanhanvientheosdt() throws IOException{
        System.out.print("Nhập số điện thoại nhân viên cần xoá: ");
        String sdt = null;
        sdt = CheckLoi.CheckSoDienThoai(sdt);
        
        int n = File.DemSoLuongNhanVien("danhsachnhanvien.txt");
        
        int check = 0;
        for(int i = 0; i < n ; i++){
            
                if( dsnv[i].getSdt().compareTo(sdt) == 0 ){
                        check = 1;

                        for(int j = i + 1 ; j < n ; j++){
                            dsnv[j - 1] = dsnv[j];
                        }
                        n--;

                        File.Ghifiledanhsachnhanvien(dsnv,n);
                        
                        System.out.println("Xoá nhân viên thành công!!!");
                        
                        break;   
                }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy nhân viên cần xoá!!!");
        }
    }
    
    //Tìm kiếm nv theo tên nv
    public void TimKiemnhanvientheotennv() throws IOException{
        System.out.print("Nhập tên nhân viên cần tìm kiếm: ");
        String tennhanvien = sc.nextLine();
        
        int n = File.DemSoLuongNhanVien("danhsachnhanvien.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dsnv[i].getHoten().compareTo(tennhanvien) == 0 ){
                System.out.println("Đã tìm thấy nhân viên: ");
                System.out.println(dsnv[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy nhân viên!!!");
        
    }
    
    
    //Tìm kiếm nv theo mã nv
    public void TimKiemnhanvientheomanv() throws IOException{
        System.out.print("Nhập mã nhân viên cần tìm kiếm: ");
        String id = null;
        id = CheckLoi.CheckMaNhanVien(id);
        
        int n = File.DemSoLuongNhanVien("danhsachnhanvien.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dsnv[i].getManhanvien().compareTo(id) == 0 ){
                System.out.println("Đã tìm thấy nhân viên: ");
                System.out.println(dsnv[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy nhân viên!!!");
        
    }
    
    
    //Tìm kiếm nv theo số điện thoại
    public void TimKiemnhanvientheosdt() throws IOException{
        System.out.print("Nhập số điện thoại nhân viên cần tìm kiếm: ");
        String sdt = null;
        sdt = CheckLoi.CheckSoDienThoai(sdt);
        
        int n = File.DemSoLuongNhanVien("danhsachnhanvien.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dsnv[i].getSdt().compareTo(sdt) == 0 ){
                System.out.println("Đã tìm thấy nhân viên: ");
                System.out.println(dsnv[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy nhân viên!!!");
        
    }
    
    //sửa thông tin nhân viên
    public void Suathongtinnv() throws IOException{
        System.out.print("Nhập mã nhân viên cần sửa (Ví dụ: NV1001): ");
        String id = null;
        id = CheckLoi.CheckMaNhanVien(id);
        
        int n = File.DemSoLuongNhanVien("danhsachnhanvien.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dsnv[i].getManhanvien().compareTo(id) == 0 ){
                System.out.println("Đã tìm thấy nhân viên cần sửa!!!");
                
                String chonchucnang = "";
                do{
                                       
                System.out.println("===========================CHỌN THÔNG TIN NHÂN VIÊN CẦN SỬA============================");
                System.out.println("1. HỌ TÊN                                                                             |");
                System.out.println("2. NGÀY SINH                                                                          |");
                System.out.println("3. ĐỊA CHỈ                                                                            |");
                System.out.println("4. SỐ ĐIỆN THOẠI                                                                      |");
                System.out.println("5. EMAIL                                                                              |");
                System.out.println("0. THOÁT                                                                              |");
                System.out.println("=======================================================================================");
                System.out.println("Nhập chức năng (0 - 5): ");
                chonchucnang = CheckLoi.Checkloinhapchucnang(chonchucnang);
                
                    switch( Integer.parseInt(chonchucnang) ){
                        case 1:
                            dsnv[i].setHoten();
                            break;
                        case 2:
                            dsnv[i].setNgaysinh();
                            break;
                        case 3:
                            dsnv[i].setDiachi();
                            break;
                        case 4:
                            dsnv[i].setSdt();
                            break;
                        case 5:
                            dsnv[i].setEmail();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.print("Nhập sai chức năng!!! Mời nhập lại: ");
                    }
                    
                }while( Integer.parseInt(chonchucnang) != 0);
                
                File.Ghifiledanhsachnhanvien(dsnv,n);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy khách hàng!!!");
    }
    
    
    public void Xuatdsnv(){
        int i = 1;
        System.out.printf("\t %-20s %-30s %-20s %-20s %-20s %s \n","Mã nhân viên","Họ tên nhân viên","Ngày sinh","Địa chỉ", "Số điện thoại","Email");
        for(NhanVien nv : dsnv){
            System.out.print(i + ". ");
            nv.XuatInfor();
            i++;
        }
    }

    public NhanVien[] getDsnv() {
        return dsnv;
    }

    public void setDsnv(NhanVien[] dsnv) {
        this.dsnv = dsnv;
    }
    
}
