package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;
import java.io.IOException;

public class DanhSachNhaCungCap {
    private NhaCungCap[] dsncc;

    public DanhSachNhaCungCap() {
    }

    public DanhSachNhaCungCap(NhaCungCap[] dsncc) {
        this.dsncc = dsncc;
    }

    
    public void themnccbandauvaomang() throws IOException{
        if( File.ktfilerong("danhsachnhacungcap.txt") == 1 ){         //File đã có dữ liệu thì đọc file và add vào mảng
            int n = File.DemSoLuongNhaCungCap("danhsachnhacungcap.txt");

            dsncc = new NhaCungCap[n];
            dsncc = File.Themnhacungcapbandauvaomang("danhsachnhacungcap.txt");
        }
    }
    
    
    //Thêm ncc
    public void themncc() throws IOException{
        int n = File.DemSoLuongNhaCungCap("danhsachnhacungcap.txt");
        n++;
        
            if(File.ktfilerong("danhsachnhacungcap.txt") == 0){
                n = 1;
            }
        
        dsncc = new NhaCungCap[n];
        dsncc = File.Themnhacungcapmoivaomang("danhsachnhacungcap.txt");
        
        NhaCungCap nccmoi = new NhaCungCap();
        nccmoi.NhapInforNhacungcap();
        
        dsncc[n-1] = nccmoi;
        
        File.Ghifiledanhsachnhacungcap(dsncc,n);
                
        System.out.println("Thêm nhà cung cấp thành công!!!");
    }
    
    
    
    //Xoá ncc theo mã ncc
    public void xoancctheomancc() throws IOException{
        System.out.print("Nhập mã nhà cung cấp cần xoá: ");
        String id = null;
        id = CheckLoi.CheckMaNhaCungCap(id);
        
        int n = File.DemSoLuongNhaCungCap("danhsachnhacungcap.txt");
        
        int check = 0;
        for(int i = 0; i < n ; i++){
            
                if( dsncc[i].getManhacungcap().compareTo(id) == 0 ){
                        check = 1;

                        for(int j = i + 1 ; j < n ; j++){
                            dsncc[j - 1] = dsncc[j];
                        }
                        n--;

                        File.Ghifiledanhsachnhacungcap(dsncc,n);
                        
                        System.out.println("Xoá nhà cung cấp thành công!!!");
                        
                        break;   
                }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy nhà cung cấp cần xoá!!!");
        }
    }
    
    
    
    //Xoá ncc theo sdt
    public void xoancctheosdt() throws IOException{
        System.out.print("Nhập số điện thoại nhà cung cấp cần xoá: ");
        String sdt = null;
        sdt = CheckLoi.CheckSoDienThoai(sdt);
        
        int n = File.DemSoLuongNhaCungCap("danhsachnhacungcap.txt");
        
        int check = 0;
        for(int i = 0; i < n ; i++){
            
                if( dsncc[i].getSdt().compareTo(sdt) == 0 ){
                        check = 1;

                        for(int j = i + 1 ; j < n ; j++){
                            dsncc[j - 1] = dsncc[j];
                        }
                        n--;

                        File.Ghifiledanhsachnhacungcap(dsncc,n);
                        
                        System.out.println("Xoá nhà cung cấp thành công!!!");
                        
                        break;   
                }
            
        }
        
        if(check == 0){
            System.out.println("Không tìm thấy nhà cung cấp cần xoá!!!");
        }
    }
    
    //Tìm kiếm ncc theo tên ncc
    public void TimKiemncctheotenncc() throws IOException{
        System.out.print("Nhập tên nhà cung cấp cần tìm kiếm: ");
        String tenncc = sc.nextLine();
        
        int n = File.DemSoLuongNhaCungCap("danhsachnhacungcap.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dsncc[i].getTennhacungcap().compareTo(tenncc) == 0 ){
                System.out.println("Đã tìm thấy nhà cung cấp: ");
                System.out.println(dsncc[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy nhà cung cấp!!!");
        
    }
    
    //Tìm kiếm ncc theo mã ncc
    public void TimKiemncctheomancc() throws IOException{
        System.out.print("Nhập mã nhà cung cấp cần tìm kiếm: ");
        String id = null;
        id = CheckLoi.CheckMaNhaCungCap(id);
        
        int n = File.DemSoLuongNhaCungCap("danhsachnhacungcap.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dsncc[i].getManhacungcap().compareTo(id) == 0 ){
                System.out.println("Đã tìm thấy nhà cung cấp: ");
                System.out.println(dsncc[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy nhà cung cấp!!!");
    }
    
    //Tìm kiếm ncc theo sdt
    public void TimKiemncctheosdt() throws IOException{
        System.out.print("Nhập sdt nhà cung cấp cần tìm kiếm: ");
        String sdt = null;
        sdt = CheckLoi.CheckSoDienThoai(sdt);
        
        int n = File.DemSoLuongNhaCungCap("danhsachnhacungcap.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dsncc[i].getSdt().compareTo(sdt) == 0 ){
                System.out.println("Đã tìm thấy nhà cung cấp: ");
                System.out.println(dsncc[i]);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy nhà cung cấp!!!");
    }
    
    //sửa thông tin nhà cung cấp
    public void Suathongtinncc() throws IOException{
        System.out.print("Nhập mã nhà cung cấp cần sửa (Ví dụ: NC1001): ");
        String id = null;
        id = CheckLoi.CheckMaNhaCungCap(id);
        
        int n = File.DemSoLuongNhaCungCap("danhsachnhacungcap.txt");
        
        int check = 0;
        for(int i = 0 ; i < n ; i++){
            
            if( dsncc[i].getManhacungcap().compareTo(id) == 0 ){
                System.out.println("Đã tìm thấy nhà cung cấp cần sửa!!!");
                
                String chonchucnang = "";
                do{
                                       
                System.out.println("===========================CHỌN THÔNG TIN NHÀ CUNG CẤP CẦN SỬA============================");
                System.out.println("1. TÊN                                                                                   |");
                System.out.println("2. ĐỊA CHỈ                                                                               |");
                System.out.println("3. SỐ ĐIỆN THOẠI                                                                         |");
                System.out.println("4. EMAIL                                                                                 |");
                System.out.println("0. THOÁT                                                                                 |");
                System.out.println("==========================================================================================");
                System.out.println("Nhập chức năng (0 - 4): ");
                chonchucnang = CheckLoi.Checkloinhapchucnang(chonchucnang);
                
                    switch( Integer.parseInt(chonchucnang) ){
                        case 1:
                            dsncc[i].setTennhacungcap();
                            break;
                        case 2:
                            dsncc[i].setDiachi();
                            break;
                        case 3:
                            dsncc[i].setSdt();
                            break;
                        case 4:
                            dsncc[i].setEmail();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.print("Nhập sai chức năng!!! Mời nhập lại: ");
                    }
                    
                }while( Integer.parseInt(chonchucnang) != 0);
                
                File.Ghifiledanhsachnhacungcap(dsncc,n);
                check = 1;
                break;
            }
            
        }
        
        if(check == 0) System.out.println("Không tìm thấy nhà cung cấp!!!");
    }
    
    
    public void Xuatdsncc(){
        
        int i = 1;
        System.out.printf("\t %-20s %-30s %-20s %-20s %s\n","Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Số điện thoại", "Email");
        for(NhaCungCap ncc : dsncc){
            System.out.print(i + ". ");
            ncc.XuatInforNhacungcap();
            i++;
        }
        
    }

    public NhaCungCap[] getDsncc() {
        return dsncc;
    }

    public void setDsncc(NhaCungCap[] dsncc) {
        this.dsncc = dsncc;
    }
    
    
}
