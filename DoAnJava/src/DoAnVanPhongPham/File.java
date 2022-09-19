package DoAnVanPhongPham;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static DoAnVanPhongPham.ConNguoi.sc;
import java.io.FileNotFoundException;

public class File {
    
    //PHẦN SẢN PHẨM
    public static void ghifileSP(ArrayList<SanPham> listsp) throws IOException{
        
        try {
            FileWriter wt1 = new FileWriter("sanphambut.txt");
            FileWriter wt2 = new FileWriter("sanphamgiay.txt");
            FileWriter wt3 = new FileWriter("sanphamtap.txt");
            FileWriter wt4 = new FileWriter("sanphambia.txt");
            FileWriter wt5 = new FileWriter("sanphamkep.txt");

            BufferedWriter bw1 = new BufferedWriter(wt1);
            BufferedWriter bw2 = new BufferedWriter(wt2);
            BufferedWriter bw3 = new BufferedWriter(wt3);
            BufferedWriter bw4 = new BufferedWriter(wt4);
            BufferedWriter bw5 = new BufferedWriter(wt5);
            

            for (SanPham sp : listsp) {
                
                if( sp instanceof BUT ){
                    bw1.write(sp.toString());
                    bw1.newLine();
                }
                            
                            
                else if( sp instanceof GIAY ){
                    bw2.write(sp.toString());
                    bw2.newLine();           
                }
                            
                            
                else if( sp instanceof TapVo ){
                    bw3.write(sp.toString());
                    bw3.newLine();          
                                
                }
                            
                            
                else if( sp instanceof BIA ){
                    bw4.write(sp.toString());
                    bw4.newLine();         
                                
                }
                            
                            
                else if( sp instanceof KEP ){
                    bw5.write(sp.toString());
                    bw5.newLine();
                }    
                
            }
            
            bw1.close();
            bw2.close();
            bw3.close();
            bw4.close();
            bw5.close();
            
            wt1.close();
            wt2.close();
            wt3.close();
            wt4.close();
            wt5.close();
            
        }
        catch(Exception e){
            
        }
    }
    
    
    
    public static void docfilespBUT(ArrayList<SanPham> danhsachsp, String link) throws IOException {
        
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               //đọc 1 dòng trong file
                
                if(line == null){                   //nếu đọc hết toàn bộ file thì thoát vòng lặp while
                    break;
                }
              
                String txt[] = line.split("-");     //Ở mỗi dòng nếu gặp dấu "-" thì tách chuỗi ra và lưu vào mảng chuỗi txt
                
                String masp = txt[0];               //lấy từng phần tử của chuỗi txt và gán vào từng thuộc tính tương ứng
                String loaisp = txt[1];
                String tensp = txt[2];
                String maubut = txt[3];
                double dongia = Double.parseDouble(txt[4]);
                int soluong = Integer.parseInt(txt[5]);
                
                SanPham sp = new BUT(masp, tensp, loaisp, maubut, dongia, soluong);        //tạo đối tượng sản phẩm
                
                                                                 
                danhsachsp.add(sp);                 //Thêm vào mảng danh sách sản phẩm
                
            }
          
        }
        catch(Exception e){
           
        }
        
                                                                  
    }

    
    
    public static void docfilespGIAY(ArrayList<SanPham> danhsachsp, String link) throws IOException {
      
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
              
                String txt[] = line.split("-");     
                
                String masp = txt[0];               
                String loaisp = txt[1];
                String tensp = txt[2];
                String maugiay = txt[3];
                String khogiay = txt[4];
                double dongia = Double.parseDouble(txt[5]);
                int soluong = Integer.parseInt(txt[6]);
                
                SanPham sp = new GIAY(masp, tensp, loaisp, maugiay, khogiay, dongia, soluong);        
                
                danhsachsp.add(sp);                                                         
                
            }
          
        }
        catch(Exception e){
            
        }
                                                                   
    }
    
    
    public static void docfilespTAP(ArrayList<SanPham> danhsachsp, String link) throws IOException {
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
              
                String txt[] = line.split("-");     
                
                String masp = txt[0];               
                String loaisp = txt[1];
                String tensp = txt[2];
                int sotrang = Integer.parseInt(txt[3]);
                double dongia = Double.parseDouble(txt[4]);
                int soluong = Integer.parseInt(txt[5]);
                
                SanPham sp = new TapVo(masp, tensp, loaisp, sotrang, dongia, soluong);        
                
                danhsachsp.add(sp);                                                         
                
            }
          
        }
        catch(Exception e){
            
        }
        
                                                              
    }
    
    
    public static void docfilespBIA(ArrayList<SanPham> danhsachsp, String link) throws IOException {
        
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
              
                String txt[] = line.split("-");     
                
                String masp = txt[0];               
                String loaisp = txt[1];
                String tensp = txt[2];
                String maubia = txt[3];
                String khobia = txt[4];
                double dongia = Double.parseDouble(txt[5]);
                int soluong = Integer.parseInt(txt[6]);
                
                SanPham sp = new BIA(masp, tensp, loaisp, maubia, khobia, dongia, soluong);        
                
                danhsachsp.add(sp);                                                         
                
            }
          
        }
        catch(Exception e){
            
        }
                                                                    
    }
    
    
    public static void docfilespKEP(ArrayList<SanPham> danhsachsp, String link) throws IOException {
        
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
              
                String txt[] = line.split("-");     
                
                String masp = txt[0];               
                String loaisp = txt[1];
                String tensp = txt[2];
                String maukep = txt[3];
                double dongia = Double.parseDouble(txt[4]);
                int soluong = Integer.parseInt(txt[5]);
                
                SanPham sp = new KEP(masp, tensp, loaisp, maukep, dongia, soluong);        
                
                danhsachsp.add(sp);                                                         
                
            }
          
        }
        catch(Exception e){
           
        }
                                                                        
    }
    
    
    //PHẦN TÀI KHOẢN NHÂN VIÊN
    public static int DemSoLuongTaiKhoanNhanVien(String link) throws IOException {
        
        int soluongtaikhoannhanvien = 0;
        
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
                
                soluongtaikhoannhanvien++;
            }
            
        }
        catch(Exception e){
            
        }                 
        
        return soluongtaikhoannhanvien;
          
    }
    
    
    public static TaiKhoan[] Themtaikhoannhanvienmoivaomang(String link) throws IOException {
        
        int n = DemSoLuongTaiKhoanNhanVien(link);
  
        TaiKhoan tknv[];
        tknv = new TaiKhoan[n + 1];
        
        try {
            FileReader rt = new FileReader(link);
            BufferedReader br = new BufferedReader(rt);
            
            String line;
            int i = 0;
          
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }         
                
                String txt[] = line.split(" ");     
                
                String id = txt[0];               
                String pass = txt[1];
                
                TaiKhoan tk = new TaiKhoan(id, pass);
                
                tknv[i] = tk;
          
                i++;
              
            }
            
        }
        catch(Exception e){
           
        }                 
        
        return tknv;
          
    }
    
    
    public static TaiKhoan[] Themtaikhoannhanvienbandauvaomang(String link) throws IOException {
        
        int n = DemSoLuongTaiKhoanNhanVien(link);
  
        TaiKhoan tknv[];
        tknv = new TaiKhoan[n];
        
        try {
            FileReader rt = new FileReader(link);
            BufferedReader br = new BufferedReader(rt);
            
            String line;
            int i = 0;
          
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }         
                
                String txt[] = line.split(" ");     
                
                String id = txt[0];               
                String pass = txt[1];
                
                TaiKhoan tk = new TaiKhoan(id, pass);
                
                tknv[i] = tk;
          
                i++;
              
            }
            
        }
        catch(Exception e){
           
        }                 
        
        return tknv;
          
    }
    
    
    public static void Ghifiledanhsachtaikhoannhanvien( TaiKhoan[] tknv, int n ) throws IOException{
        
        try {
            FileWriter wt = new FileWriter("danhsachtaikhoannhanvien.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            

            for (int i = 0; i < n; i++) {
 
                bw.write(tknv[i].toString());
                bw.newLine();
                            
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    
    //PHẦN NHÂN VIÊN
    public static int DemSoLuongNhanVien(String link) throws IOException {
        
        int soluongnhanvien = 0;
        
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
                
                soluongnhanvien++;
            }
            
        }
        catch(Exception e){
            
        }                 
        
        return soluongnhanvien;
          
    }
    
    public static NhanVien[] Themnhanvienbandauvaomang(String link) throws IOException {
        
        int n = DemSoLuongNhanVien(link);
  
        NhanVien dsnv[];
        dsnv = new NhanVien[n];
        
        try {
            FileReader rt = new FileReader(link);
            BufferedReader br = new BufferedReader(rt);
            
            String line;
            int i = 0;
          
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }         
                
                String txt[] = line.split("-");     
                
                String manhanvien = txt[0];               
                String hoten = txt[1];
                String ngaysinh = txt[2];
                String diachi = txt[3];
                String sdt = txt[4];
                String email = txt[5];
                double luong = Double.parseDouble(txt[6]);
                
                NhanVien nv = new NhanVien(manhanvien, hoten, ngaysinh, diachi, sdt, email, luong);
                
                dsnv[i] = nv;
          
                i++;
              
            }
            
        }
        catch(Exception e){
           
        }                 
        
        return dsnv;
          
    }
    
    
    public static NhanVien[] Themnhanvienmoivaomang(String link) throws IOException {
        
        int n = DemSoLuongNhanVien(link);
  
        NhanVien dsnv[];
        dsnv = new NhanVien[n + 1];
        
        try {
            FileReader rt = new FileReader(link);
            BufferedReader br = new BufferedReader(rt);
            
            String line;
            int i = 0;
          
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }         
                
                String txt[] = line.split("-");     
                
                String manhanvien = txt[0];               
                String hoten = txt[1];
                String ngaysinh = txt[2];
                String diachi = txt[3];
                String sdt = txt[4];
                String email = txt[5];
                double luong = Double.parseDouble(txt[6]);
                
                NhanVien nv = new NhanVien(manhanvien, hoten, ngaysinh, diachi, sdt, email, luong);
                
                dsnv[i] = nv;
          
                i++;
              
            }
            
        }
        catch(Exception e){
           
        }                 
        
        return dsnv;
          
    }
    
    
    public static void Ghifiledanhsachnhanvien( NhanVien[] dsnv, int n ) throws IOException{
        
        try {
            FileWriter wt = new FileWriter("danhsachnhanvien.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            

            for (int i = 0; i < n; i++) {
 
                bw.write(dsnv[i].toString());
                bw.newLine();
                            
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    
    //phần khách hàng
    
    public static int DemSoLuongKhachHang(String link) throws IOException {
        
        int soluongkhachhang = 0;
        
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
                
                soluongkhachhang++;
            }
            
            br.close();
            rt.close();
            
        }
        catch(Exception e){
            
        }                 
        
        return soluongkhachhang;
          
    }
    
    
    public static KhachHang[] Themkhachhangbandauvaomang(String link) throws IOException {
        
        int n = DemSoLuongKhachHang(link);
  
        KhachHang dskh[];
        dskh = new KhachHang[n];
        
        try {
            FileReader rt = new FileReader(link);
            BufferedReader br = new BufferedReader(rt);
            
            String line;
            int i = 0;
          
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }         
                
                String txt[] = line.split("-");     
                
                String makhachhang = txt[0];               
                String hoten = txt[1];
                String ngaysinh = txt[2];
                String diachi = txt[3];
                String sdt = txt[4];
                String email = txt[5];
                
                KhachHang kh = new KhachHang(makhachhang, hoten, ngaysinh, diachi, sdt, email);
                
                dskh[i] = kh;
          
                i++;
              
            }
            
            br.close();
            rt.close();
            
        }
        catch(Exception e){
           
        }                 
        
        return dskh;
          
    }
    
    
    public static KhachHang[] Themkhachhangmoivaomang(String link) throws IOException {
        
        int n = DemSoLuongKhachHang(link);
  
        KhachHang dskh[];
        dskh = new KhachHang[n + 1];
        
        try {
            FileReader rt = new FileReader(link);
            BufferedReader br = new BufferedReader(rt);
            
            String line;
            int i = 0;
          
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }         
                
                String txt[] = line.split("-");     
                
                String makhachhang = txt[0];               
                String hoten = txt[1];
                String ngaysinh = txt[2];
                String diachi = txt[3];
                String sdt = txt[4];
                String email = txt[5];
               
                KhachHang kh = new KhachHang(makhachhang, hoten, ngaysinh, diachi, sdt, email);
                
                dskh[i] = kh;
          
                i++;
              
            }
            
            br.close();
            rt.close();
            
        }
        catch(Exception e){
           
        }                 
        
        return dskh;
          
    }
    
    
    public static void Ghifiledanhsachkhachhang( KhachHang[] dskh, int n) throws IOException{
        
        try {
            FileWriter wt = new FileWriter("danhsachkhachhang.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            

            for (int i = 0; i < n; i++) {
 
                bw.write(dskh[i].toString());
                bw.newLine();
                            
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    
    //PHẦN NHÀ CUNG CẤP
    public static int DemSoLuongNhaCungCap(String link) throws IOException {
        
        int soluongnhacungcap = 0;
        
        try {
            FileReader rt = new FileReader(link);

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
                
                soluongnhacungcap++;
            }
            
        }
        catch(Exception e){
            
        }                 
        
        return soluongnhacungcap;
          
    }
    
    
    public static NhaCungCap[] Themnhacungcapmoivaomang(String link) throws IOException {
        
        int n = DemSoLuongNhaCungCap(link);
  
        NhaCungCap dsncc[];
        dsncc = new NhaCungCap[n + 1];
        
        try {
            FileReader rt = new FileReader(link);
            BufferedReader br = new BufferedReader(rt);
            
            String line;
            int i = 0;
          
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }         
                
                String txt[] = line.split("-");     
                
                String manhacungcap = txt[0];               
                String tennhacungcap = txt[1];
                String diachi = txt[2];
                String sdt = txt[3];
                String email = txt[4];
                
                NhaCungCap ncc = new NhaCungCap(manhacungcap, tennhacungcap, diachi, sdt, email);
                
                dsncc[i] = ncc;
          
                i++;
              
            }
            
        }
        catch(Exception e){
           
        }                 
        
        return dsncc;
          
    }
    
    
    public static NhaCungCap[] Themnhacungcapbandauvaomang(String link) throws IOException {
        
        int n = DemSoLuongNhaCungCap(link);
  
        NhaCungCap dsncc[];
        dsncc = new NhaCungCap[n];
        
        try {
            FileReader rt = new FileReader(link);
            BufferedReader br = new BufferedReader(rt);
            
            String line;
            int i = 0;
          
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }         
                
                String txt[] = line.split("-");     
                
                String manhacungcap = txt[0];               
                String tennhacungcap = txt[1];
                String diachi = txt[2];
                String sdt = txt[3];
                String email = txt[4];
                
                NhaCungCap ncc = new NhaCungCap(manhacungcap, tennhacungcap, diachi, sdt, email);
                
                dsncc[i] = ncc;
          
                i++;
              
            }
            
        }
        catch(Exception e){
           
        }                 
        
        return dsncc;
          
    }
    
    
    public static void Ghifiledanhsachnhacungcap( NhaCungCap[] dsncc, int n ) throws IOException{
        
        try {
            FileWriter wt = new FileWriter("danhsachnhacungcap.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            

            for (int i = 0; i < n; i++) {
 
                bw.write(dsncc[i].toString());
                bw.newLine();
                            
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    
    
    public static int ktfilerong(String link) throws FileNotFoundException, IOException{
        
        FileReader rt = new FileReader(link);
        BufferedReader br = new BufferedReader(rt);
        
        String line = br.readLine();               
                
        if(line == null){                   
            return 0;
        }   
        
        return 1;
    }

    
    
    public static void ghifilephieunhap(ArrayList<PhieuNhapHang> dspn) throws IOException{
        try {
            FileWriter wt = new FileWriter("danhsachphieunhap.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            
            
            for(PhieuNhapHang i : dspn){
                bw.write(i.toString());
                bw.newLine();
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    public static void ghifilechitietphieunhap(ArrayList<ChiTietPhieuNhap> dsctpn) throws IOException{
        try {
            FileWriter wt = new FileWriter("danhsachchitietphieunhap.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            
            
            for(ChiTietPhieuNhap i : dsctpn){
                bw.write(i.toString());
                bw.newLine();
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    public static void ghifilephieuxuat(ArrayList<PhieuXuatHang> dspx) throws IOException{
        try {
            FileWriter wt = new FileWriter("danhsachphieuxuat.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            
            
            for(PhieuXuatHang i : dspx){
                bw.write(i.toString());
                bw.newLine();
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    public static void ghifilechitietphieuxuat(ArrayList<ChiTietPhieuXuat> dsctpx) throws IOException{
        try {
            FileWriter wt = new FileWriter("danhsachchitietphieuxuat.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            
            
            for(ChiTietPhieuXuat i : dsctpx){
                bw.write(i.toString());
                bw.newLine();
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    public static void ghifilehoadon(ArrayList<HoaDon> dshd) throws IOException{
        try {
            FileWriter wt = new FileWriter("danhsachhoadon.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            
            
            for(HoaDon i : dshd){
                bw.write(i.toString());
                bw.newLine();
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    public static void ghifilechitiethoadon(ArrayList<ChiTietHoaDon> dscthd) throws IOException{
        try {
            FileWriter wt = new FileWriter("danhsachchitiethoadon.txt");
            
            BufferedWriter bw = new BufferedWriter(wt);
            
            
            for(ChiTietHoaDon i : dscthd){
                bw.write(i.toString());
                bw.newLine();
            }
            
            bw.close();
            wt.close();
                
        }
        catch(Exception e){
            
        }
    }
    
    public static void docfilehoadon(ArrayList<HoaDon> dshd) throws IOException {
        
        try {
            FileReader rt = new FileReader("danhsachhoadon.txt");

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
              
                String txt[] = line.split("-");     
                
                String mahoadon = txt[0];               
                String makhachhang = txt[1];
                String manhanvien = txt[2];
                String ngaylaphoadon = txt[3];
                
                HoaDon hd = new HoaDon(mahoadon, makhachhang, manhanvien, ngaylaphoadon);        
                
                dshd.add(hd);                                                         
                
            }
          
        }
        catch(Exception e){
            
        }
                                                                    
    }
    
    public static void docfilephieunhap(ArrayList<PhieuNhapHang> dspn) throws IOException {
        
        try {
            FileReader rt = new FileReader("danhsachphieunhap.txt");

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
              
                String txt[] = line.split("-");     
                
                String maphieunhap = txt[0];               
                String manhacungcap = txt[1];
                String ngaynhaphang = txt[2];
                
                PhieuNhapHang pn = new PhieuNhapHang(maphieunhap, manhacungcap, ngaynhaphang);        
                
                dspn.add(pn);                                                         
                
            }
          
        }
        catch(Exception e){
            
        }
                                                                    
    }
    
    public static void docfilephieuxuat(ArrayList<PhieuXuatHang> dspx) throws IOException {
        
        try {
            FileReader rt = new FileReader("danhsachphieuxuat.txt");

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               
                
                if(line == null){                   
                    break;
                }
              
                String txt[] = line.split("-");     
                
                String maphieuxuat = txt[0];               
                String tennoinhan = txt[1];
                String ngayxuathang = txt[2];
                
                PhieuXuatHang px = new PhieuXuatHang(maphieuxuat, tennoinhan, ngayxuathang);        
                
                dspx.add(px);                                                             
                
            }
          
        }
        catch(Exception e){
            
        }
                                                                    
    }
    
    
    public static void docfilechitiethoadon(ArrayList<ChiTietHoaDon> dscthd) throws IOException {
        
        try {
            FileReader rt = new FileReader("danhsachchitiethoadon.txt");

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               //đọc 1 dòng trong file
                
                if(line == null){                   //nếu đọc hết toàn bộ file thì thoát vòng lặp while
                    break;
                }
              
                String txt[] = line.split("-");     //Ở mỗi dòng nếu gặp dấu "-" thì tách chuỗi ra và lưu vào mảng chuỗi txt
                
                if(txt[2].compareTo("BUT") == 0){
                    String mahd = txt[0];
                    String masp = txt[1];               //lấy từng phần tử của chuỗi txt và gán vào từng thuộc tính tương ứng
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maubut = txt[4];
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);
                    
                    SanPham sp = new BUT(masp, tensp, loaisp, maubut, dongia, soluong);
                    
                    ChiTietHoaDon cthd = new ChiTietHoaDon(mahd, sp);
                    
                    dscthd.add(cthd);
                }
                
                if(txt[2].compareTo("GIAY") == 0){
                    String mahd = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maugiay = txt[4];
                    String khogiay = txt[5];
                    double dongia = Double.parseDouble(txt[6]);
                    int soluong = Integer.parseInt(txt[7]);

                    SanPham sp = new GIAY(masp, tensp, loaisp, maugiay, khogiay, dongia, soluong); 
                    
                    ChiTietHoaDon cthd = new ChiTietHoaDon(mahd, sp);
                    
                    dscthd.add(cthd);
                }
                
                
                
                if(txt[2].compareTo("TAP") == 0){
                    String mahd = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    int sotrang = Integer.parseInt(txt[4]);
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);

                    SanPham sp = new TapVo(masp, tensp, loaisp, sotrang, dongia, soluong); 
                    
                    ChiTietHoaDon cthd = new ChiTietHoaDon(mahd, sp);
                    
                    dscthd.add(cthd);
                }
                
                
                if(txt[2].compareTo("BIA") == 0){
                    String mahd = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maubia = txt[4];
                    String khobia = txt[5];
                    double dongia = Double.parseDouble(txt[6]);
                    int soluong = Integer.parseInt(txt[7]);

                    SanPham sp = new BIA(masp, tensp, loaisp, maubia, khobia, dongia, soluong); 
                    
                    ChiTietHoaDon cthd = new ChiTietHoaDon(mahd, sp);
                    
                    dscthd.add(cthd);
                }
                
                
                if(txt[2].compareTo("KEP") == 0){
                    String mahd = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maukep = txt[4];
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);

                    SanPham sp = new KEP(masp, tensp, loaisp, maukep, dongia, soluong);  
                    
                    ChiTietHoaDon cthd = new ChiTietHoaDon(mahd, sp);
                    
                    dscthd.add(cthd);
                }
                
            }
          
        }
        catch(Exception e){
           
        }
        
                                                                  
    }
    
    
    public static void docfilechitietphieunhap(ArrayList<ChiTietPhieuNhap> dsctpn) throws IOException {
        
        try {
            FileReader rt = new FileReader("danhsachchitietphieunhap.txt");

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               //đọc 1 dòng trong file
                
                if(line == null){                   //nếu đọc hết toàn bộ file thì thoát vòng lặp while
                    break;
                }
              
                String txt[] = line.split("-");     //Ở mỗi dòng nếu gặp dấu "-" thì tách chuỗi ra và lưu vào mảng chuỗi txt
                
                if(txt[2].compareTo("BUT") == 0){
                    String maphieunhap = txt[0];
                    String masp = txt[1];               //lấy từng phần tử của chuỗi txt và gán vào từng thuộc tính tương ứng
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maubut = txt[4];
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);
                    
                    SanPham sp = new BUT(masp, tensp, loaisp, maubut, dongia, soluong);
                    
                    ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(maphieunhap, sp);
                    
                    dsctpn.add(ctpn);
                }
                
                if(txt[2].compareTo("GIAY") == 0){
                    String maphieunhap = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maugiay = txt[4];
                    String khogiay = txt[5];
                    double dongia = Double.parseDouble(txt[6]);
                    int soluong = Integer.parseInt(txt[7]);

                    SanPham sp = new GIAY(masp, tensp, loaisp, maugiay, khogiay, dongia, soluong); 
                    
                    ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(maphieunhap, sp);
                    
                    dsctpn.add(ctpn);
                }
                
                
                
                if(txt[2].compareTo("TAP") == 0){
                    String maphieunhap = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    int sotrang = Integer.parseInt(txt[4]);
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);

                    SanPham sp = new TapVo(masp, tensp, loaisp, sotrang, dongia, soluong); 
                    
                    ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(maphieunhap, sp);
                    
                    dsctpn.add(ctpn);
                }
                
                
                if(txt[2].compareTo("BIA") == 0){
                    String maphieunhap = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maubia = txt[4];
                    String khobia = txt[5];
                    double dongia = Double.parseDouble(txt[6]);
                    int soluong = Integer.parseInt(txt[7]);

                    SanPham sp = new BIA(masp, tensp, loaisp, maubia, khobia, dongia, soluong); 
                    
                    ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(maphieunhap, sp);
                    
                    dsctpn.add(ctpn);
                }
                
                
                if(txt[2].compareTo("KEP") == 0){
                    String maphieunhap = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maukep = txt[4];
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);

                    SanPham sp = new KEP(masp, tensp, loaisp, maukep, dongia, soluong);  
                    
                    ChiTietPhieuNhap ctpn = new ChiTietPhieuNhap(maphieunhap, sp);
                    
                    dsctpn.add(ctpn);
                }
                
            }
          
        }
        catch(Exception e){
           
        }
        
                                                                  
    }
    
    
    public static void docfilechitietphieuxuat(ArrayList<ChiTietPhieuXuat> dsctpx) throws IOException {
        
        try {
            FileReader rt = new FileReader("danhsachchitietphieuxuat.txt");

            BufferedReader br = new BufferedReader(rt);
            
            String line;
            
            while(true){
                line = br.readLine();               //đọc 1 dòng trong file
                
                if(line == null){                   //nếu đọc hết toàn bộ file thì thoát vòng lặp while
                    break;
                }
              
                String txt[] = line.split("-");     //Ở mỗi dòng nếu gặp dấu "-" thì tách chuỗi ra và lưu vào mảng chuỗi txt
                
                if(txt[2].compareTo("BUT") == 0){
                    String maphieuxuat = txt[0];
                    String masp = txt[1];               //lấy từng phần tử của chuỗi txt và gán vào từng thuộc tính tương ứng
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maubut = txt[4];
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);
                    
                    SanPham sp = new BUT(masp, tensp, loaisp, maubut, dongia, soluong);
                    
                    ChiTietPhieuXuat ctpx = new ChiTietPhieuXuat(maphieuxuat, sp);
                    
                    dsctpx.add(ctpx);
                }
                
                if(txt[2].compareTo("GIAY") == 0){
                    String maphieuxuat = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maugiay = txt[4];
                    String khogiay = txt[5];
                    double dongia = Double.parseDouble(txt[6]);
                    int soluong = Integer.parseInt(txt[7]);

                    SanPham sp = new GIAY(masp, tensp, loaisp, maugiay, khogiay, dongia, soluong); 
                    
                    ChiTietPhieuXuat ctpx = new ChiTietPhieuXuat(maphieuxuat, sp);
                    
                    dsctpx.add(ctpx);
                }
                
                
                
                if(txt[2].compareTo("TAP") == 0){
                    String maphieuxuat = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    int sotrang = Integer.parseInt(txt[4]);
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);

                    SanPham sp = new TapVo(masp, tensp, loaisp, sotrang, dongia, soluong); 
                    
                    ChiTietPhieuXuat ctpx = new ChiTietPhieuXuat(maphieuxuat, sp);
                    
                    dsctpx.add(ctpx);
                }
                
                
                if(txt[2].compareTo("BIA") == 0){
                    String maphieuxuat = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maubia = txt[4];
                    String khobia = txt[5];
                    double dongia = Double.parseDouble(txt[6]);
                    int soluong = Integer.parseInt(txt[7]);

                    SanPham sp = new BIA(masp, tensp, loaisp, maubia, khobia, dongia, soluong); 
                    
                    ChiTietPhieuXuat ctpx = new ChiTietPhieuXuat(maphieuxuat, sp);
                    
                    dsctpx.add(ctpx);
                }
                
                
                if(txt[2].compareTo("KEP") == 0){
                    String maphieuxuat = txt[0];
                    String masp = txt[1];               
                    String loaisp = txt[2];
                    String tensp = txt[3];
                    String maukep = txt[4];
                    double dongia = Double.parseDouble(txt[5]);
                    int soluong = Integer.parseInt(txt[6]);

                    SanPham sp = new KEP(masp, tensp, loaisp, maukep, dongia, soluong);  
                    
                    ChiTietPhieuXuat ctpx = new ChiTietPhieuXuat(maphieuxuat, sp);
                    
                    dsctpx.add(ctpx);
                }
                
            }
          
        }
        catch(Exception e){
           
        }
        
                                                                  
    }
    
    
    
}
