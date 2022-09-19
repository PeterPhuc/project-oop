package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;
import java.io.IOException;

public class DanhSachKhachHang {
    private KhachHang[] dskh;

    public DanhSachKhachHang() {
    }

    public DanhSachKhachHang(KhachHang[] dskh) {
        this.dskh = dskh;
    }
    
    public void Themkhbandauvaomang() throws IOException{
       
        if( File.ktfilerong("danhsachkhachhang.txt") == 1 ){         //File đã có dữ liệu thì đọc file và add vào mảng
            int n = File.DemSoLuongKhachHang("danhsachkhachhang.txt");
        
            dskh = new KhachHang[n];
            dskh = File.Themkhachhangbandauvaomang("danhsachkhachhang.txt");
        }
        
    }
    
    
    //Thêm kh
    public void themkh() throws IOException{
    
        int n = File.DemSoLuongKhachHang("danhsachkhachhang.txt");
        n++;
             if( File.ktfilerong("danhsachkhachhang.txt") == 0 ){  //File rỗng
                n = 1;
             }
  
        dskh = new KhachHang[n];
        dskh = File.Themkhachhangmoivaomang("danhsachkhachhang.txt");
        
        KhachHang khachhangmoi = new KhachHang();
        khachhangmoi.NhapInfor();
        
        dskh[n-1] = khachhangmoi;
        
        File.Ghifiledanhsachkhachhang(dskh,n);
                
        System.out.println("Thêm khách hàng thành công!!!");
    }
    
    
    
    
    //Xoá kh theo mã kh
    public void xoakhtheomakh() throws IOException {
        System.out.print("Nhập mã khách hàng cần xoá: ");
        String id = null;
        id = CheckLoi.CheckMaKhachHang(id);
        
        int n = File.DemSoLuongKhachHang("danhsachkhachhang.txt");
        
        int check = 0;
        for(int i = 0; i < n ; i++){
            
                if( dskh[i].getMakhachhang().compareTo(id) == 0 ){
                        check = 1;

                        for(int j = i + 1 ; j < n ; j++){
                            dskh[j - 1] = dskh[j];
                        }
                        n--;

                        File.Ghifiledanhsachkhachhang(dskh,n);
                        
                        System.out.println("Xoá khách hàng thành công!!!");
                        
                        break;   
                }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy khách hàng cần xoá!!!");
        }
    }
    
    //Xoá kh theo số đt
    public void xoakhtheosodt() throws IOException {
        System.out.print("Nhập số điện thoại khách hàng cần xoá: ");
        String sdt = null;
        sdt = CheckLoi.CheckSoDienThoai(sdt);
        
        int n = File.DemSoLuongKhachHang("danhsachkhachhang.txt");
        
        int check = 0;
        for(int i = 0; i < n ; i++){
            
                if( dskh[i].getSdt().compareTo(sdt) == 0 ){
                        check = 1;

                        for(int j = i + 1 ; j < n ; j++){
                            dskh[j - 1] = dskh[j];
                        }
                        n--;

                        File.Ghifiledanhsachkhachhang(dskh,n);
                        
                        System.out.println("Xoá khách hàng thành công!!!");
                        
                        break;   
                }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy khách hàng cần xoá!!!");
        }
    }
    
    
    
    //Tìm kiếm kh theo mã kh
    public void TimKiemKhTheoMakh() throws IOException{
        System.out.print("Nhập mã khách hàng cần tìm kiếm: ");
        String id = null;
        id = CheckLoi.CheckMaKhachHang(id);
        
        int n = File.DemSoLuongKhachHang("danhsachkhachhang.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dskh[i].getMakhachhang().compareTo(id) == 0 ){
                System.out.println("Đã tìm thấy khách hàng: ");
                System.out.println(dskh[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy khách hàng!!!");
    }
    
    //Tìm kiếm kh theo tên kh
    public void TimKiemKhTheoTenkh() throws IOException{
        System.out.print("Nhập tên khách hàng cần tìm kiếm: ");
        String tenkhachhang = sc.nextLine();
        
        int n = File.DemSoLuongKhachHang("danhsachkhachhang.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dskh[i].getHoten().compareTo(tenkhachhang) == 0 ){
                System.out.println("Đã tìm thấy khách hàng: ");
                System.out.println(dskh[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy khách hàng!!!");
    }
    
    
    //Tìm kiếm kh theo số đt
    public void TimKiemKhTheosdt() throws IOException{
        System.out.print("Nhập số điện thoại khách hàng cần tìm kiếm: ");
        String sdt = null;
        sdt = CheckLoi.CheckSoDienThoai(sdt);
        
        
        int n = File.DemSoLuongKhachHang("danhsachkhachhang.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dskh[i].getSdt().compareTo(sdt) == 0 ){
                System.out.println("Đã tìm thấy khách hàng: ");
                System.out.println(dskh[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy khách hàng!!!");
    }
    
    //sửa thông tin khách hàng
    public void Suathongtinkh() throws IOException{
        System.out.print("Nhập mã khách hàng cần sửa (Ví dụ: KH10001): ");
        String id = null;
        id = CheckLoi.CheckMaKhachHang(id);
        
        int n = File.DemSoLuongKhachHang("danhsachkhachhang.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dskh[i].getMakhachhang().compareTo(id) == 0 ){
                System.out.println("Đã tìm thấy khách hàng cần sửa!!!");
                
                String chonchucnang = "";
                do{
                                       
                System.out.println("===========================CHỌN THÔNG TIN KHÁCH HÀNG CẦN SỬA===========================");
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
                            dskh[i].setHoten();
                            break;
                        case 2:
                            dskh[i].setNgaysinh();
                            break;
                        case 3:
                            dskh[i].setDiachi();
                            break;
                        case 4:
                            dskh[i].setSdt();
                            break;
                        case 5:
                            dskh[i].setEmail();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.print("Nhập sai chức năng!!! Mời nhập lại: ");
                    }
                    
                }while( Integer.parseInt(chonchucnang) != 0);
                
                File.Ghifiledanhsachkhachhang(dskh,n);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy khách hàng!!!");
    }
    
    
    public void Xuatdskh(){
        int i = 1;
        System.out.printf("\t %-20s %-30s %-20s %-20s %-20s %s \n", "Mã khách hàng", "Tên khách hàng", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Email");
        for(KhachHang kh : dskh){
            System.out.print(i + ". ");
            kh.XuatInfor();
            i++;
        }
    }
    
    public KhachHang[] getDskh() {
        return dskh;
    }

    public void setDskh(KhachHang[] dskh) {
        this.dskh = dskh;
    }
    
    
}
