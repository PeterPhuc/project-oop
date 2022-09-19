package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;
import java.util.ArrayList;

public class CheckLoi {
        
    public static void checktaikhoanNV(DanhSachTaiKhoanNV dstknv){      //CHECK TÀI KHOẢN NHÂN VIÊN
 
        int check = 0;
                do{    
                    TaiKhoan tk = new TaiKhoan();
                    tk.nhaptaikhoan();
                    
                    for(TaiKhoan i : dstknv.getTknv()){
                        
                        if( (i.getTentaikhoan().compareTo( tk.getTentaikhoan() ) == 0 )  &&  (i.getPass().compareTo( tk.getPass() ) == 0 ) ){
                            System.out.println("ĐĂNG NHẬP TÀI KHOẢN THÀNH CÔNG!!!");
                            check = 1;
                        }
                        
                    }
                    if(check == 0){
                        System.out.println("Nhập sai id hoặc password!!!. Vui lòng nhập lại");
                    }
                }while(check == 0); 
        
    }

    
    public static String CheckMaSanPhamBut(String maspbut){
        do{                      
               maspbut = sc.nextLine();
              
               if( maspbut.matches("BT" + "[0-9]{1,3}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: BT100): ");
               }
                                           
        }while(true);
        
        return maspbut;
    }
    
    
    public static String CheckMaSanPhamGiay(String maspgiay){
        do{                      
               maspgiay = sc.nextLine();
              
               if( maspgiay.matches("GY" + "[0-9]{1,3}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: GY100): ");
               }
                                           
        }while(true);
        
        return maspgiay;
    }
    
    
    public static String CheckMaSanPhamTap(String masptap){
        do{                      
               masptap = sc.nextLine();
              
               if( masptap.matches("TP" + "[0-9]{1,3}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: TP100): ");
               }
                                           
        }while(true);
        
        return masptap;
    }
    
    
    public static String CheckMaSanPhamBia(String maspbia){
        do{                      
               maspbia = sc.nextLine();
              
               if( maspbia.matches("BA" + "[0-9]{1,3}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: BA100): ");
               }
                                           
        }while(true);
        
        return maspbia;
    }
    
    
    public static String CheckMaSanPhamKep(String maspkep){
        do{                      
               maspkep = sc.nextLine();
              
               if( maspkep.matches("KP" + "[0-9]{1,3}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: KP100): ");
               }
                                           
        }while(true);
        
        return maspkep;
    }
    
    
    
    public static String CheckKhoGiay(String kho){    //CHECK KHỔ GIẤY (ví dụ A5 A4 A3,...)
        do{                      
               kho = sc.nextLine();
              
               if( kho.matches("A" + "[0-5]") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: KP100): ");
               }
                                           
        }while(true);
        
        return kho;
    }
    
    
    
    
    public static String CheckMaNhanVien(String manhanvien) {      // CHECK MÃ NHÂN VIÊN
        
        do{                      
               manhanvien = sc.nextLine();
              
               if( manhanvien.matches("NV1" + "[0-9]{3}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: NV1001): ");
               }
                                           
           }while(true);
        
        return manhanvien;
        
    }
   
    
    
    public static String CheckMaKhachHang(String makhachhang){      //CHECK MÃ KHÁCH HÀNG
           do{                      
               makhachhang = sc.nextLine();
              
               if( makhachhang.matches("KH1" + "[0-9]{4}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: KH10001): ");
               }
                                           
           }while(true);
        
        return makhachhang;
    }
    
    
    
    
    
    
    
    public static String CheckMaNhaCungCap(String manhacungcap) {      //CHECK MÃ NHÀ CUNG CẤP
        
        do{                      
               manhacungcap = sc.nextLine();
              
               if( manhacungcap.matches("NC1" + "[0-9]{3}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: NC1001): ");
               }
                                           
           }while(true);
        
        return manhacungcap;
        
    }
    
    
    
    
    public static String CheckMaPhieuNhap(String maphieunhap, ArrayList<PhieuNhapHang> dspn) {    //CHECK MÃ PHIẾU NHẬP
    
        do{                      
               maphieunhap = sc.nextLine();
              
               if( maphieunhap.matches("PN" + "[0-9]{4}") ){
                   
                   
                    if( dspn.isEmpty() == true ){
                        break;
                    }
                    
                    int check = 0;
                    for(PhieuNhapHang pnh: dspn){
                        if( maphieunhap.compareTo(pnh.getMaphieunhap()) == 0 ){
                            System.out.println("Mã phiếu nhập đã tồn tại!! Mời nhập lại");
                            break;
                        }
                        check++;
                    }
                    
                    if(check == dspn.size()){
                        break;
                    }
                    
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: PN1000): ");
               }
                                           
           }while(true);
        
        return maphieunhap;
        
    }
    
    
    
    public static String CheckMaPhieuXuat(String maphieuxuat, ArrayList<PhieuXuatHang> dspx) {    //CHECK MÃ PHIẾU NHẬP
    
        do{                      
               maphieuxuat = sc.nextLine();
              
               if( maphieuxuat.matches("PX" + "[0-9]{4}") ){
                   
                   if( dspx.isEmpty() == true ){
                        break;
                    }
                    
                    int check = 0;
                    for(PhieuXuatHang pxh: dspx){
                        if( maphieuxuat.compareTo(pxh.getMaphieuxuat()) == 0 ){
                            System.out.println("Mã phiếu xuất đã tồn tại!! Mời nhập lại");
                            break;
                        }
                        check++;
                    }
                    
                    if(check == dspx.size()){
                        break;
                    }
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: PX1000): ");
               }
                                           
           }while(true);
        
        return maphieuxuat;
        
    }
    
    
    
    public static String CheckNhapMaHoaDon(String mahoadon) {    //CHECK MÃ HOÁ ĐƠN
       do{                      
               mahoadon = sc.nextLine();
              
               if( mahoadon.matches("HD" + "[0-9]{5}") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: HD10000): ");
               }
                                           
           }while(true);
        
        return mahoadon;
    }
    
    
    
    public static String CheckTen(String hoten) { //CHECK HỌ TÊN
        while (true) {
            hoten = sc.nextLine();
            if (hoten.matches("[\\pL\\pMn*\\s*]+")) {
                hoten = hoten.trim();
                hoten = hoten.replaceAll("\\s+", " ");
                hoten = hoten.toLowerCase();
                String[] Chuoi = hoten.split(" ");
                hoten = "";
                for (int i = 0; i < Chuoi.length; i++) {
                    hoten += String.valueOf(Chuoi[i].charAt(0)).toUpperCase() + Chuoi[i].substring(1);
                    if (i < Chuoi.length - 1) {
                        hoten += " ";
                    }
                }
                return hoten;
            } else {
                System.out.print("Kí tự không phù hợp! Mời nhập lại: ");
            }

        }
    }
   
    
    
    
    public static int CheckSoThuc(String dauvao) {
        
        double Nhap;
            try {
                Nhap = Double.parseDouble(dauvao);
                if (Nhap >= 0) {
                    return 1;
                }else{
                    return 0;
                }
                
            } catch (NumberFormatException exception) {
                return 0;
            }
    }
    
    
    public static double CheckNhapSoThuc(String dauvao){    //CHECK NHẬP LƯƠNG NHÂN VIÊN, ĐƠN GIÁ SẢN PHẨM
        do{                      
            dauvao = sc.nextLine();
            int checkloi = CheckLoi.CheckSoThuc(dauvao);
                                           
            if( checkloi == 1 ){
                break;
            }else{
        
                System.out.println("Nhập sai định dạng số thực!!! Nhập lại: ");
                                              
            }
                                           
        }while(true);
        
        return Double.parseDouble(dauvao);
    }
    
    
    
    

    public static int CheckSoNguyen(String dauvao) {
        int Nhap;
            try {
                Nhap = Integer.parseInt(dauvao);
                if (Nhap >= 0) {
                    return 1;
                }else{
                    return 0;
                }
                
            } catch (NumberFormatException exception) {
                return 0;
            }
    }
    
    
    public static int CheckNhapSoNguyen(String dauvao){    //CHECK NHẬP LƯƠNG NHÂN VIÊN, ĐƠN GIÁ SẢN PHẨM
        do{                      
            dauvao = sc.nextLine();
            int checkloi = CheckLoi.CheckSoNguyen(dauvao);
                                           
            if( checkloi == 1 ){
                break;
            }else{
        
                System.out.println("Nhập sai định dạng số nguyên!!! Nhập lại: ");
                                              
            }
                                           
        }while(true);
        
        return Integer.parseInt(dauvao);
    }
    
    
    
    
    public static String Checkloinhapchucnang(String dauvao){  //CHECK LỖI NHẬP CHỨC NĂNG MENU
        
        do{                      
            dauvao = sc.nextLine();
            int checkloi = CheckLoi.CheckSoNguyen(dauvao);
                                           
            if( checkloi == 1 ){
                break;
            }else{
        
                System.out.println("Nhập sai định dạng chức năng!!! Nhập lại: ");
                                              
            }
                                           
        }while(true);
        
        return dauvao;
    }
    
    
    
    
    
    public static void CheckQuyen(){
        String admin, pass;
        int check = 0;
        do{
                if(check == 1){
                    System.out.println("Nhập sai tài khoản hoặc sai mật khẩu!!! Hãy nhập lại");
                }
                System.out.println("Nhập tài khoản admin: ");
                admin = sc.nextLine();
                System.out.println("Nhập password: ");
                pass = sc.nextLine();
                check = 1;
        
        }while( admin.compareTo("admin") != 0  ||  pass.compareTo("admin") != 0 );
        
        System.out.println("ĐĂNG NHẬP VỚI TƯ CÁCH ADMIN THÀNH CÔNG!!!");
        
    }
    
    
    
    
    public static int CheckTinhHopLedmy(String ngaythangnam){
        
        if( ngaythangnam.matches("[0-9]{1,2}" + "/" + "[0-9]{1,2}" + "/" + "[0-9]{1,4}") ){
        
            String arr[] = ngaythangnam.split("/");

            int d = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int y = Integer.parseInt(arr[2]);

            if( (d>0 && d<32) && (m>0 && m<13) && (y>0) ){

                if( m == 2 && d > 29 ){      // NẾU THÁNG 2 CÓ SỐ NGÀY > 29 THÌ RETURN 0
                    return -1;
                }

                if( (m==4 || m==6 || m==9 || m==11) && (d == 31) ){   //NẾU THÁNG 4 6 9 11 CÓ 31 NGÀY THÌ RETURN 0
                    return -1;
                }

                if( !(y % 4==0 && y %100 !=0)||(y %400==0) ){   //NĂM KO Nhuận ( CHÚ Ý DẤU ! )
                    if( m == 2 && d > 28 ){                    //NẾU NĂM ko NHUẬN MÀ T2 LỚN HƠN 28 NGÀY THÌ RETURN 0
                        return -1;
                    }
                }

                return 1;
            }
            return 0;
        
        }
        
        return 0;
    }
    
    
    
    
    public static String CheckDMY(String ngaythangnam){   //CHECK LỖI NHẬP NGÀY THÁNG NĂM 
        
        do{                      
               ngaythangnam = sc.nextLine();
               
               int kt = CheckTinhHopLedmy(ngaythangnam);
               
               if( kt == 1 ){
                   break;
               }
               else if( kt == 0 ){
                   System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: 1/1/2000): ");
               }
               else{
                   System.out.println("Nhập ngày tháng năm ko hợp lệ!!! Mời nhập lại (ví dụ: 1/1/2000): ");
               }
                                           
        }while(true);
        
        return ngaythangnam;
        
    }
    
    
    
    public static String CheckEmail(String email){  //CHECK LỖI NHẬP EMAIL
        do{                      
               email = sc.nextLine();
              
               if( email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "gmail.com") ){
                    break;
               }
               else{
                    System.out.println("Nhập sai định dạng email!!! Mời nhập lại (ví dụ: ): ");
               }
                                           
        }while(true);
        
        return email;
    }
    
    
    
    public static String CheckSoDienThoai(String sdt) {      //CHECK LỖI NHẬP SĐT
        do{                      
               sdt = sc.nextLine();
               
               if( sdt.length() < 10 || sdt.length() > 11 ){
                   System.out.println("Số điện thoại phải 10 hoặc 11 chữ số!!! Vui lòng nhập lại: ");
               }else{
                   break;
               }
                                           
        }while(true);
        
        return sdt;
    }
    
    
}
