package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

import java.io.IOException;
import java.util.ArrayList;

public class MainMenu {
    
    public static void DuyetSp(ArrayList<SanPham> dsspkhmua ,ArrayList<SanPham> danhsachsp){
        
            int user = 1;
                while(user == 1){
                    System.out.println("Nhập mã sp mà bạn muốn mua: ");
                    String masp = sc.nextLine();
                    

                    int check = 0;
                    for(int i = 0; i < danhsachsp.size() ; i++){
                        if( masp.equals( danhsachsp.get(i).getMasanpham()) ){          //Kiểm tra mã sản phẩm nhập vào
                                                    
                            System.out.println("Nhập số lượng sản phẩm: ");
                            String str = null;
                            int soluong;
                            soluong = CheckLoi.CheckNhapSoNguyen(str);
                            
                                
                                if( danhsachsp.get(i).getSoluong() == 0 ){
                                    System.out.println("Sản phẩm tạm hết hàng. Mong quý khách thông cảm!!!");
                                    check = 1;
                                    break;
                                }
                                
                                               
                                while(soluong > danhsachsp.get(i).getSoluong()){            //nếu số lượng sp cần mua quá số lượng hiện có thì bắt nhập lại 
                                    System.out.println("Nhập lại số lượng sp!!!");
                                    soluong = CheckLoi.CheckNhapSoNguyen(str);
                                }
                                
                            int temp = danhsachsp.get(i).getSoluong();
                            
                                
                            if( danhsachsp.get(i) instanceof BUT ){
                               BUT but = (BUT)danhsachsp.get(i);
                               SanPham spkhmua = new BUT(but.getMasanpham(), but.getTensanpham(), "BUT", but.getMaubut(), but.getDonGia(), soluong);
                               dsspkhmua.add(spkhmua);
                               danhsachsp.get(i).setSoluong( temp - soluong );
                            }
                            
                            
                            else if( danhsachsp.get(i) instanceof GIAY ){
                               GIAY giay = (GIAY)danhsachsp.get(i);
                               SanPham spkhmua = new GIAY(giay.getMasanpham(), giay.getTensanpham(), "GIAY", giay.getMaugiay(), giay.getKhogiay(), giay.getDonGia(), soluong);
                               dsspkhmua.add(spkhmua);
                               danhsachsp.get(i).setSoluong( temp - soluong ); 
                            }
                            
                            
                            else if( danhsachsp.get(i) instanceof TapVo ){
                               TapVo tap = (TapVo)danhsachsp.get(i);
                               SanPham spkhmua = new TapVo(tap.getMasanpham(), tap.getTensanpham(), "TAP", tap.getSotrang(), tap.getDonGia(), soluong);
                               dsspkhmua.add(spkhmua);
                               danhsachsp.get(i).setSoluong( temp - soluong ); 
                            }
                            
                            
                            else if( danhsachsp.get(i) instanceof BIA ){
                               BIA bia = (BIA)danhsachsp.get(i);
                               SanPham spkhmua = new BIA(bia.getMasanpham(),  bia.getTensanpham(), "BIA", bia.getMaubia(), bia.getKhobia(), bia.getDonGia(), soluong);
                               dsspkhmua.add(spkhmua);
                               danhsachsp.get(i).setSoluong( temp - soluong ); 
                            }
                            
                            
                            else if( danhsachsp.get(i) instanceof KEP ){
                               KEP kep = (KEP)danhsachsp.get(i);
                               SanPham spkhmua = new KEP(kep.getMasanpham(), kep.getTensanpham(), "KEP", kep.getMaukep(), kep.getDonGia(), soluong);
                               dsspkhmua.add(spkhmua);
                               danhsachsp.get(i).setSoluong( temp - soluong ); 
                            }    
                                
                            
                            check = 1;
                            break;
                        }
                    }
                                        
                    if(check == 0) System.out.println("Nhập sai mã sp!!!. Vui lòng nhập lại");
                                    
                                        
                    System.out.println("- Nhấn 0 để thoát, nhấn 1 để tiếp tục mua sản phẩm");
                          
                    String temp = null;
                    
                    user = CheckLoi.CheckNhapSoNguyen(temp);
                    
                    if(user == 0){
                        break;
                    }
 
                }
                                
    }
    
    
    
    
    
    
                                                                                                    //danh sách sản phẩm ở phiếu nhập
    public static void DuyetSanPhamNhap(ArrayList<SanPham> dsspnhap ,ArrayList<SanPham> danhsachsp, ArrayList<SanPham> dssppn){   
        
            int admin = 1;
                while(admin == 1){
                    System.out.println("Nhập mã sp mà bạn cần nhập thêm: ");
                    String masp = sc.nextLine();
                    

                    int check = 0;                                     //BIẾN CHECK DÙNG ĐỂ KIỂM TRA NHẬP ĐÚNG SAI MÃ SẢN PHẨM
                    int soluong;
                    double DonGia = 0;
                    for(int i = 0; i < danhsachsp.size() ; i++){                      
                        
                        if( masp.equals(danhsachsp.get(i).getMasanpham()) ){          //NẾU NHẬP ĐÚNG MÃ SẢN PHẨM 
                                                  
                            
                            
                  //PHẦN NHẬP SỐ LƯỢNG SẢN PHẨM CẦN NHẬP
                            System.out.println("Nhập số lượng sản phẩm cần nhập thêm (số lượng phải > 0): ");  
                            String str = null;
                            soluong = CheckLoi.CheckNhapSoNguyen(str);
                            
                            
                                while( soluong <= 0 ){
                                    System.out.println("VUI LÒNG NHẬP LẠI SỐ LƯỢNG SẢN PHẨM CẦN NHẬP: ");
                                    soluong = CheckLoi.CheckNhapSoNguyen(str);
                                }
                                
                            
                                
                  //PHẦN ĐIỀU CHỈNH ĐƠN GIÁ SẢN PHẨM    
                            int luachon;
                            System.out.println("BẠN CÓ MUỐN ĐIỀU CHỈNH ĐƠN GIÁ SẢN PHẨM NÀY??? (Nhấn 1 chọn CÓ, nhấn 0 để chọn KHÔNG)");
                            System.out.println("1. CÓ");
                            System.out.println("0. KHÔNG");
                                
                            System.out.print("MỜI NHẬP LỰA CHỌN: ");
                            luachon = CheckLoi.CheckNhapSoNguyen(str);
                            
                            
                            while( luachon != 1  &&  luachon != 0){
                                System.out.print("HÃY NHẬP LẠI LỰA CHỌN!!! (Nhấn 1 chọn CÓ, nhấn 0 để chọn KHÔNG): ");
                                luachon = CheckLoi.CheckNhapSoNguyen(str);
                            }
                            
                                if(luachon == 1){   //ĐỒNG Ý ĐIỀU CHỈNH ĐƠN GIÁ SẢN PHẨM
                                    System.out.print("Mời nhập đơn giá mới (Ví dụ: 2000 là 2000VNĐ): ");
                                    DonGia = CheckLoi.CheckNhapSoThuc(str);
                                }
                            
                            
         //SAU KHI KIỂM TRA ĐIỀU KIỆN NHẬP SỐ LƯỢNG, ĐƠN GIÁ THÌ SẼ ĐƯA NHỮNG THAY ĐỔI ĐÓ VÀO LIST SẢN PHẨM
                        
                            if( danhsachsp.get(i) instanceof BUT ){
                                
                               int temp1 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp1 + soluong );   //TĂNG SỐ LƯỢNG SẢN PHẨM LÊN

                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   danhsachsp.get(i).setDonGia(DonGia);
                               }
                                
                               
                               double Dongiasanphamnhap = dssppn.get(i).getDonGia();
                               
                               BUT but = (BUT)danhsachsp.get(i);//TẠO ĐT BÚT
                               SanPham spnhap = new BUT(but.getMasanpham(), but.getTensanpham(), "BUT", but.getMaubut(), Dongiasanphamnhap, soluong);//DÙNG ĐA HÌNH
                               dsspnhap.add(spnhap);
                               
                               
                            }
                            
                            
                            
                            if( danhsachsp.get(i) instanceof GIAY ){
                                
                               int temp1 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp1 + soluong );   //TĂNG SỐ LƯỢNG SẢN PHẨM LÊN
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   danhsachsp.get(i).setDonGia(DonGia);
                               }
                                
                               
                               double Dongiasanphamnhap = dssppn.get(i).getDonGia();   //LẤY ĐƠN GIÁ NHẬP HÀNG
                               
                               GIAY giay = (GIAY)danhsachsp.get(i);//TẠO Đối tượng Giấy
                               SanPham spnhap = new GIAY(giay.getMasanpham(), giay.getTensanpham(), "GIAY", giay.getMaugiay(), giay.getKhogiay(), Dongiasanphamnhap, soluong);//DÙNG ĐA HÌNH
                               dsspnhap.add(spnhap);
                               
                            }
                            
                            
                            
                            
                            if( danhsachsp.get(i) instanceof TapVo ){
                               
                               int temp1 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp1 + soluong );   //TĂNG SỐ LƯỢNG SẢN PHẨM LÊN
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   danhsachsp.get(i).setDonGia(DonGia);
                               }
                               
                               
                               double Dongiasanphamnhap = dssppn.get(i).getDonGia();   //LẤY ĐƠN GIÁ NHẬP HÀNG
                                
                               TapVo tap = (TapVo)danhsachsp.get(i);//TẠO ĐT BÚT
                               SanPham spnhap = new TapVo(tap.getMasanpham(), tap.getTensanpham(), "TAP", tap.getSotrang(), Dongiasanphamnhap, soluong);//DÙNG ĐA HÌNH
                               dsspnhap.add(spnhap);
                               
                            }
                            
                            
                            if( danhsachsp.get(i) instanceof BIA ){
                                
                               int temp1 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp1 + soluong );   //TĂNG SỐ LƯỢNG SẢN PHẨM LÊN
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   danhsachsp.get(i).setDonGia(DonGia);
                               }
                               
                               
                               double Dongiasanphamnhap = dssppn.get(i).getDonGia();   //LẤY ĐƠN GIÁ NHẬP HÀNG
                                
                               BIA bia = (BIA)danhsachsp.get(i);//TẠO ĐT BÚT
                               SanPham spnhap = new BIA(bia.getMasanpham(), bia.getTensanpham(), "BIA", bia.getMaubia(), bia.getKhobia(), Dongiasanphamnhap, soluong);//DÙNG ĐA HÌNH
                               dsspnhap.add(spnhap);
                               
                            }
                            
                            
                            if( danhsachsp.get(i) instanceof KEP ){
                                
                               int temp1 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp1 + soluong );   //TĂNG SỐ LƯỢNG SẢN PHẨM LÊN
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   danhsachsp.get(i).setDonGia(DonGia);
                               }
                               
                               
                               double Dongiasanphamnhap = dssppn.get(i).getDonGia();   //LẤY ĐƠN GIÁ NHẬP HÀNG
                                
                               KEP kep = (KEP)danhsachsp.get(i);//TẠO ĐT BÚT
                               SanPham spnhap = new KEP(kep.getMasanpham(), kep.getTensanpham(), "KEP", kep.getMaukep(), Dongiasanphamnhap, soluong);//DÙNG ĐA HÌNH
                               dsspnhap.add(spnhap);
                               
                            }
                            
                            
                            check = 1;                                 //NHẬP ĐÚNG MÃ SP THÌ CHECK = 1 VÁ THOÁT VÒNG LẶP FOR
                            break;
                        }
                        
                    }
                                        
                    if(check == 0) System.out.println("Nhập sai mã sp!!!. Vui lòng nhập lại");
                                    
                                        
                    System.out.println("- Nhấn 0 để thoát, nhấn 1 để tiếp tục chọn nhập sản phẩm");//NHẤN 0 THÌ THOÁT VÒNG LẶP WHILE
                                        
                    String temp = null;
                    admin = CheckLoi.CheckNhapSoNguyen(temp);
                    
                    if(admin == 0){
                        break;
                    }
 
                }
        
    }
    
    
    
    
    public static void DuyetSanPhamXuat(ArrayList<SanPham> dsspxuat ,ArrayList<SanPham> danhsachsp){   
        
            int admin = 1;
                while(admin == 1){
                    System.out.println("Nhập mã sp mà bạn cần xuất đi: ");
                    String masp = sc.nextLine();
                    

                    int check = 0;                                     //BIẾN CHECK DÙNG ĐỂ KIỂM TRA NHẬP ĐÚNG SAI MÃ SẢN PHẨM
                    int soluong;
                    double DonGia = 0;
                    
                    for(int i = 0; i < danhsachsp.size() ; i++){                      
                        
                        if( masp.equals(danhsachsp.get(i).getMasanpham()) ){          //NẾU NHẬP ĐÚNG MÃ SẢN PHẨM 
                                                  
                            
                            
                  //PHẦN NHẬP SỐ LƯỢNG SẢN PHẨM CẦN NHẬP
                            System.out.println("Nhập số lượng sản phẩm cần xuất (số lượng phải > 0 và < số lượng sản phẩm hiện tại): ");  
                            System.out.println("Số lượng sản phẩm của mã sp " + danhsachsp.get(i).getMasanpham() + ": " + danhsachsp.get(i).getSoluong());
                            String str = null;
                            soluong = CheckLoi.CheckNhapSoNguyen(str);
                            
                            
                                while( soluong <= 0 || soluong > danhsachsp.get(i).getSoluong() ){    //KHI SỐ LƯỢNG NHẬP VÀO <= 0 VÀ > SỐ LƯỢNG SP HIỆN CÓ
                                    System.out.println("VUI LÒNG NHẬP LẠI SỐ LƯỢNG SẢN PHẨM CẦN XUẤT: ");
                                    soluong = CheckLoi.CheckNhapSoNguyen(str);
                                }
                                
                            
                                
                  //PHẦN ĐIỀU CHỈNH ĐƠN GIÁ SẢN PHẨM    
                            int luachon;
                            System.out.println("BẠN CÓ MUỐN ĐIỀU CHỈNH ĐƠN GIÁ SẢN PHẨM NÀY??? (Nhấn 1 chọn CÓ, nhấn 0 để chọn KHÔNG)");
                            System.out.println("1. CÓ");
                            System.out.println("0. KHÔNG");
                                
                            System.out.print("MỜI NHẬP LỰA CHỌN: ");
                            luachon = CheckLoi.CheckNhapSoNguyen(str);
                            
                            
                            while( luachon != 1  &&  luachon != 0){
                                System.out.print("HÃY NHẬP LẠI LỰA CHỌN!!! (Nhấn 1 chọn CÓ, nhấn 0 để chọn KHÔNG): ");
                                luachon = CheckLoi.CheckNhapSoNguyen(str);
                            }
                            
                                if(luachon == 1){                         //ĐỒNG Ý ĐIỀU CHỈNH ĐƠN GIÁ SẢN PHẨM
                                    System.out.print("Mời nhập đơn giá mới (Ví dụ: 2000 là 2000VNĐ): ");
                                    DonGia = CheckLoi.CheckNhapSoThuc(str);
                                }
                            
                            
         //SAU KHI KIỂM TRA ĐIỀU KIỆN NHẬP SỐ LƯỢNG, ĐƠN GIÁ THÌ SẼ ĐƯA NHỮNG THAY ĐỔI ĐÓ VÀO LIST SẢN PHẨM
                        
                            if( danhsachsp.get(i) instanceof BUT ){
                                
                               BUT but = (BUT)danhsachsp.get(i);//TẠO ĐT BÚT
                               SanPham spnhap = new BUT(but.getMasanpham(), but.getTensanpham(), "BUT", but.getMaubut(), but.getDonGia(), soluong);//DÙNG ĐA HÌNH
                               dsspxuat.add(spnhap);
                               
                               
                               int temp2 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp2 - soluong ); 
                               
                               dsspxuat.get( dsspxuat.size() - 1 ).setSoluong(soluong);
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   dsspxuat.get( dsspxuat.size() - 1 ).setDonGia(DonGia);
                               }
                               
                            }
                            
                            
                            
                            if( danhsachsp.get(i) instanceof GIAY ){
                                
                               GIAY giay = (GIAY)danhsachsp.get(i);//TẠO Đối tượng Giấy
                               SanPham spnhap = new GIAY(giay.getMasanpham(), giay.getTensanpham(), "GIAY", giay.getMaugiay(), giay.getKhogiay(), giay.getDonGia(), soluong);//DÙNG ĐA HÌNH
                               dsspxuat.add(spnhap);
                               
                               
                               int temp2 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp2 - soluong ); 
                               
                               dsspxuat.get(dsspxuat.size() - 1).setSoluong(soluong);
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   dsspxuat.get(dsspxuat.size() - 1).setDonGia(DonGia);
                               }
                               
                            }
                            
                            
                            
                            
                            if( danhsachsp.get(i) instanceof TapVo ){
                                
                               TapVo tap = (TapVo)danhsachsp.get(i);//TẠO ĐT BÚT
                               SanPham spnhap = new TapVo(tap.getMasanpham(), tap.getTensanpham(), "TAP", tap.getSotrang(), tap.getDonGia(), soluong);//DÙNG ĐA HÌNH
                               dsspxuat.add(spnhap);
                               
                               
                               int temp2 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp2 - soluong ); 
                               
                               dsspxuat.get(dsspxuat.size() - 1).setSoluong(soluong);
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   dsspxuat.get(dsspxuat.size() - 1).setDonGia(DonGia);
                               }
                               
                            }
                            
                            
                            if( danhsachsp.get(i) instanceof BIA ){
                                
                               BIA bia = (BIA)danhsachsp.get(i);//TẠO ĐT BÚT
                               SanPham spnhap = new BIA(bia.getMasanpham(), bia.getTensanpham(), "BIA", bia.getMaubia(), bia.getKhobia(), bia.getDonGia(), soluong);//DÙNG ĐA HÌNH
                               dsspxuat.add(spnhap);
                               
                               
                               int temp2 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp2 - soluong ); 
                               
                               dsspxuat.get(dsspxuat.size() - 1).setSoluong(soluong);
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   dsspxuat.get(dsspxuat.size() - 1).setDonGia(DonGia);
                               }
                               
                            }
                            
                            
                            if( danhsachsp.get(i) instanceof KEP ){
                                
                               KEP kep = (KEP)danhsachsp.get(i);//TẠO ĐT BÚT
                               SanPham spnhap = new KEP(kep.getMasanpham(), kep.getTensanpham(), "KEP", kep.getMaukep(), kep.getDonGia(), soluong);//DÙNG ĐA HÌNH
                               dsspxuat.add(spnhap);
                               
                               
                               int temp2 = danhsachsp.get(i).getSoluong();
                               danhsachsp.get(i).setSoluong( temp2 - soluong ); 
                               
                               dsspxuat.get(dsspxuat.size() - 1).setSoluong(soluong);
                               
                               
                               if( DonGia != 0){      //NẾU QUẢN LÝ ĐỒNG Ý THAY ĐỔI ĐƠN GIÁ THÌ SET LẠI ĐƠN GIÁ CỦA SẢN PHẨM
                                   dsspxuat.get(dsspxuat.size() - 1).setDonGia(DonGia);
                               }
                               
                            }
                            
                            
                            check = 1;                                 //NHẬP ĐÚNG MÃ SP THÌ CHECK = 1 VÁ THOÁT VÒNG LẶP FOR
                            break;
                        }
                        
                    }
                                        
                    if(check == 0) System.out.println("Nhập sai mã sp!!!. Vui lòng nhập lại");
                                    
                                        
                    System.out.println("- Nhấn 0 để thoát, nhấn 1 để tiếp tục chọn nhập sản phẩm");//NHẤN 0 THÌ THOÁT VÒNG LẶP WHILE
                                        
                    String temp = null;
                    admin = CheckLoi.CheckNhapSoNguyen(temp);
                    
                    
                    if(admin == 0){
                        break;
                    }
 
                }
                
        
    }
    
 

    
    public static void main(String[] args) throws IOException{
        
        DanhSachKhachHang dskh = new DanhSachKhachHang();
        dskh.Themkhbandauvaomang();
        
        DanhSachSanPham dssp = new DanhSachSanPham();
        dssp.Themsp();
        

        ArrayList<SanPham> dsspkhmua = new ArrayList<SanPham>();
        
        
        DanhSachTaiKhoanNV dstknv = new DanhSachTaiKhoanNV();
        dstknv.DocFileTaiKhoanNhanVienVaoMang();
        
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        dsnv.DocFileNhanVienVaoMang();
        
        
        
        DanhSachHoaDon dshd = new DanhSachHoaDon();
        dshd.docfilehoadon();
        
        DanhSachChiTietHoaDon dschitiethd = new DanhSachChiTietHoaDon();
        dschitiethd.docfilechitiethoadon();
        
        
        
        DanhSachPhieuNhap dspn = new DanhSachPhieuNhap();
        dspn.docfiletuphieunhap();
        dspn.themspnhap();
        
        DanhSachChiTietPhieuNhap dschitietpn = new DanhSachChiTietPhieuNhap();
        dschitietpn.docfilechitietphieunhap();
        
        ArrayList<SanPham> dsspnhap = new ArrayList<SanPham>();       //DANH SÁCH GỒM CÁC SẢN PHẨM MÀ QUẢN LÝ CHỌN ĐỂ NHẬP HÀNG
        
        
        
        
        
        /*DanhSachSanPham dsspchonxuat = new DanhSachSanPham();         
        dsspchonxuat.Themsp(); */                                       
        
        ArrayList<SanPham> dsspxuat = new ArrayList<SanPham>();       //DANH SÁCH GỒM CÁC SẢN PHẨM MÀ QUẢN LÝ CHỌN ĐỂ XUẤT HÀNG
        
        DanhSachPhieuXuat dspx = new DanhSachPhieuXuat();
        dspx.docfiletuphieuxuat();
        
        
        DanhSachChiTietPhieuXuat dschitietpx = new DanhSachChiTietPhieuXuat();
        dschitietpx.docfilechitietphieuxuat();   
        
        
        
        
        DanhSachNhaCungCap dsncc = new DanhSachNhaCungCap();
        dsncc.themnccbandauvaomang();
        
        
        
        String luachon = "";
        do{
            System.out.println("==============================ĐĂNG NHẬP TÀI KHOẢN==============================");
            System.out.println("1. Nhân viên                                                                  |");
            System.out.println("2. Quản lý                                                                    |");
            System.out.println("0. Thoát                                                                      |");
            System.out.println("===============================================================================");
            System.out.print("Nhập chức năng (0 - 2): ");
           
            luachon = CheckLoi.Checkloinhapchucnang(luachon);
            
            switch( Integer.parseInt(luachon) ){
                case 1:   //NHÂN VIÊN
               
                    CheckLoi.checktaikhoanNV(dstknv);    //ĐĂNG NHẬP TÀI KHOẢN NHÂN VIÊN
                    
                    int checkthanhtoan = 0;        
                   
                    String chonchucnangnv = "";
                    do{
                        System.out.println("==============================NHẬP CHỨC NĂNG CỦA BẠN==============================");
                        System.out.println("1. Mua hàng cho khách hàng                                                       |");
                        System.out.println("2. Thanh toán cho khách hàng                                                     |");
                        System.out.println("3. Xem danh sách hoá đơn                                                         |");
                        System.out.println("4. Xem lương                                                                     |");
                        System.out.println("5. Xem danh sách sản phẩm                                                        |");
                        System.out.println("0. Thoát                                                                         |");
                        System.out.println("==================================================================================");
                        System.out.print("Nhập chức năng (0 - 5): ");
                        
                        
                        
                        chonchucnangnv = CheckLoi.Checkloinhapchucnang(chonchucnangnv);
                        
                        
                        
                        switch(Integer.parseInt(chonchucnangnv)){
                            case 1:    //MUA HÀNG

                                dskh.themkh();  //NHẬP THÔNG TIN KHÁCH HÀNG TRƯỚC
                                
                                String chonloaisp = "";
                                    do{
                                       
                                        System.out.println("=======================CHỌN LOẠI SẢN PHẨM MÀ KHÁCH HÀNG MUỐN MUA=======================");
                                        System.out.println("1. BÚT                                                                                |");
                                        System.out.println("2. GIẤY                                                                               |");
                                        System.out.println("3. TẬP VỞ                                                                             |");
                                        System.out.println("4. BÌA                                                                                |");
                                        System.out.println("5. KẸP GIẤY                                                                           |");
                                        System.out.println("0. THOÁT                                                                              |");
                                        System.out.println("=======================================================================================");
                                        System.out.println("Nhập chức năng (0 - 5): ");
                                        
                                        
                                        chonloaisp = CheckLoi.Checkloinhapchucnang(chonloaisp);
                                        
                                        
                                            switch( Integer.parseInt(chonloaisp) ){
                                                case 1:
                                                    dssp.xuatdsspBut();
                                                    DuyetSp(dsspkhmua, dssp.getDanhsachsp());
                                                    checkthanhtoan = 1;
                                                    break;

                                                case 2:
                                                    dssp.xuatdsspGiay();
                                                    DuyetSp(dsspkhmua, dssp.getDanhsachsp());
                                                    checkthanhtoan = 1;
                                                    break;

                                                case 3:
                                                    dssp.xuatdsspTap();
                                                    DuyetSp(dsspkhmua, dssp.getDanhsachsp());
                                                    checkthanhtoan = 1;
                                                    break;

                                                case 4:
                                                    dssp.xuatdsspBia();
                                                    DuyetSp(dsspkhmua, dssp.getDanhsachsp());
                                                    checkthanhtoan = 1;
                                                    break;

                                                case 5:
                                                    dssp.xuatdsspKep();
                                                    DuyetSp(dsspkhmua, dssp.getDanhsachsp());
                                                    checkthanhtoan = 1;
                                                    break;

                                                case 0:
                                                    break;

                                                default:
                                                    System.out.println("Nhập sai chức năng!!! Nhập lại");
                                            }

                                    }while( Integer.parseInt(chonloaisp) != 0);
                                    
                                    
                                    dssp.GhiDanhSachSanPhamVaoFile();
                                break; 
                                
                                
                                
        
                            case 2:           //THANH TOÁN HOÁ ĐƠN
                                
                                if(checkthanhtoan == 0){
                                    System.out.println("BẠN CHƯA CHỌN SẢN PHẨM NÀO CẢ!!! - NHẤN 1 ĐỂ CHỌN SẢN PHẨM ");
                                    break;
                                } 
                                
        //Lấy mã khách hàng vừa thêm vào ở case 
                                HoaDon hd = new HoaDon();
                                hd.nhaphoadon(dskh.getDskh()[dskh.getDskh().length - 1].getMakhachhang());
                                
                                dshd.themhd(hd);
                                
                                for( SanPham sp : dsspkhmua ){
                                    
                                    dschitiethd.Themchitiethoadon( hd.getMahoadon(), sp );
                                    
                                }
                              
                                dshd.xuathdchokhachhang( dschitiethd, hd.getMahoadon());
                                
                                File.ghifilehoadon(dshd.getDshd());
                                File.ghifilechitiethoadon(dschitiethd.getDscthd());
                                
                                checkthanhtoan = 0;                          //NHỚ CHO BIẾN CHECK NÀY VỀ 0
                                
                                dsspkhmua.removeAll(dsspkhmua);              //XOÁ TẤT CẢ DANH SÁCH KHÁCH HÀNG ĐÃ MUA SAU KHI THANH TOÁN XONG ĐỂ KHÁCH HÀNG KHÁC MUA TIẾP1
                                
                                break;
                                
                               
                            
                            case 3:
                                dshd.xuathd(dschitiethd);
                                break;
                                
                                
                           
                            case 4:            //XEM LƯƠNG NHÂN VIÊN
                                
                                System.out.print("Nhập mã nhân viên: ");
                                String manhanvien = sc.nextLine();
                                
                                NhanVien a[] = dsnv.getDsnv();
                                
                                int check = 0;
                                for(int i = 0 ; i < a.length ; i++ ){
                                    
                                    if( a[i].getManhanvien().compareTo(manhanvien) == 0 ){
                                        System.out.println("Lương của bạn là: " + a[i].XemLuong());
                                        check = 1;
                                        break;
                                    }
                                    
                                }
                                if(check == 0) System.out.println("Không tìm thấy mã nhân viên!!!");
                                
                                break;
                             
                            
                                
                            case 5:
                                String chonxemsp = "";
                                    do{
                                       
                                        System.out.println("===========================CHỌN LOẠI SẢN PHẨM MÀ BẠN MUỐN XEM==========================");
                                        System.out.println("1. BÚT                                                                                |");
                                        System.out.println("2. GIẤY                                                                               |");
                                        System.out.println("3. TẬP VỞ                                                                             |");
                                        System.out.println("4. BÌA                                                                                |");
                                        System.out.println("5. KẸP GIẤY                                                                           |");
                                        System.out.println("0. THOÁT                                                                              |");
                                        System.out.println("=======================================================================================");
                                        System.out.println("Nhập chức năng (0 - 5): ");
                                        
                                        
                                        chonxemsp = CheckLoi.Checkloinhapchucnang(chonxemsp);
                                        
                                        
                                            switch( Integer.parseInt(chonxemsp) ){
                                                case 1:
                                                    dssp.xuatdsspBut();
                                                    System.out.println("");
                                                    break;

                                                case 2:
                                                    dssp.xuatdsspGiay();
                                                    System.out.println("");
                                                    break;

                                                case 3:
                                                    dssp.xuatdsspTap();
                                                    System.out.println("");
                                                    break;

                                                case 4:
                                                    dssp.xuatdsspBia();
                                                    System.out.println("");
                                                    break;

                                                case 5:
                                                    dssp.xuatdsspKep();
                                                    System.out.println("");
                                                    break;

                                                case 0:
                                                    break;

                                                default:
                                                    System.out.println("Nhập sai chức năng!!! Nhập lại");
                                            }

                                    }while( Integer.parseInt(chonxemsp) != 0);
                                break;
                             
                                
                                
                            case 0:
                                break;
                                
                            default:
                                System.out.println("Nhập sai chức năng!!! Nhập lại");
                                
                        }
                    }while(Integer.parseInt(chonchucnangnv) != 0);
                    break;
                 
                    
                    
                    
                    
                    
                    
                    
                    
                case 2:  //Quản lý
                    CheckLoi.CheckQuyen();
                    
                    String chonchucnangql = "";
                    do{   
                        System.out.println("========================================NHẬP CHỨC NĂNG CỦA QUẢN LÝ========================================");
                        System.out.println("1. Nhập hàng                                                                                             |");
                        System.out.println("2. Xem phiếu nhập                                                                                    |");
                        System.out.println("3. Xuất hàng                                                                                             |");
                        System.out.println("4. Xem phiếu xuất                                                                                    |");
                        System.out.println("5. Quản lý nhà cung cấp                                                                                  |");
                        System.out.println("6. Quản lý khách hàng                                                                                    |");
                        System.out.println("7. Quản lý nhân viên                                                                                     |");
                        System.out.println("8. Quản lý tài khoản nhân viên                                                                           |");
                        System.out.println("9. Quản lý lương                                                                                         |");
                        System.out.println("10.Xem danh sách sản phẩm                                                                                      |");
                        System.out.println("11.Quản lý danh sách hóa đơn                                                                             |");
                        System.out.println("0. Thoát                                                                                                 |");
                        System.out.println("==========================================================================================================");
                        System.out.print("Nhập chức năng (0 - 11): ");
                        
                        
                        
                        chonchucnangql = CheckLoi.Checkloinhapchucnang(chonchucnangql);
                        
                        
                        
                        switch(Integer.parseInt(chonchucnangql)){
                            
                            case 1:
                                PhieuNhapHang pnh = new PhieuNhapHang();
                                pnh.nhapinfophieunhap(dspn.getDspn());
                                
                                String chonloaisp = "";
                                    do{
                                        System.out.println("=======================CHỌN LOẠI SẢN PHẨM MÀ BẠN CẦN ĐỂ NHẬP HÀNG=======================");
                                        System.out.println("1. BÚT                                                                                 |");
                                        System.out.println("2. GIẤY                                                                                |");
                                        System.out.println("3. TẬP VỞ                                                                              |");
                                        System.out.println("4. BÌA                                                                                 |");
                                        System.out.println("5. KẸP GIẤY                                                                            |");
                                        System.out.println("0. THOÁT                                                                               |");
                                        System.out.println("========================================================================================");
                                        System.out.print("Nhập chức năng (0 - 5): ");
                                       
                                        chonloaisp = CheckLoi.Checkloinhapchucnang(chonloaisp);
                                       
                                            switch(Integer.parseInt(chonloaisp)){
                                                case 1:
                                                    dssp.xuatdsspBut();
                                                    DuyetSanPhamNhap(dsspnhap, dssp.getDanhsachsp(), dspn.getDanhsachsp());
                                                    break;

                                                case 2:
                                                    dssp.xuatdsspGiay();
                                                    DuyetSanPhamNhap(dsspnhap, dssp.getDanhsachsp(), dspn.getDanhsachsp());
                                                    break;

                                                case 3:
                                                    dssp.xuatdsspTap();
                                                    DuyetSanPhamNhap(dsspnhap, dssp.getDanhsachsp(), dspn.getDanhsachsp());
                                                    break;

                                                case 4:
                                                    dssp.xuatdsspBia();
                                                    DuyetSanPhamNhap(dsspnhap, dssp.getDanhsachsp(), dspn.getDanhsachsp());
                                                    break;

                                                case 5:
                                                    dssp.xuatdsspKep();
                                                    DuyetSanPhamNhap(dsspnhap, dssp.getDanhsachsp(), dspn.getDanhsachsp());
                                                    break;

                                                case 0:
                                                    break;

                                                default:
                                                    System.out.println("Nhập sai!!!. Vui lòng nhập lại");
                                            }

                                    }while(Integer.parseInt(chonloaisp) != 0);
                                    
                                    dssp.GhiDanhSachSanPhamVaoFile();
                                    
                                    dspn.themphieunhap(pnh);
                                    dspn.ghithongtinphieunhapvaofile();
                                    
                                    
                                    for( SanPham sp : dsspnhap ){
                                
                                        dschitietpn.Themchitietphieunhap( pnh.getMaphieunhap(), sp);//ĐƯA MÃ PHIẾU NHẬP, THÔNG TIN SP NHẬP VÀO TRONG CHI TIẾT PHIẾU NHẬP
                                    }
                                    
                                break;
                                
                                
                                
                                
                            case 2:
                                
                                dspn.xuatphieunhap(dschitietpn);
                                
                                dschitietpn.ghichitietphieunhapvaofile();
                                
                                dsspnhap.removeAll(dsspnhap);              
                                break;
                                
                                
                                
                            case 3:
                                
                                PhieuXuatHang pxh = new PhieuXuatHang();
                                pxh.nhapinfophieuxuat(dspx.getDspx());
                                
                                
                                String chonloaispxuat = "";
                                    do{
                                        System.out.println("=======================CHỌN LOẠI SẢN PHẨM MÀ BẠN CẦN ĐỂ XUẤT HÀNG=======================");
                                        System.out.println("1. BÚT                                                                                 |");
                                        System.out.println("2. GIẤY                                                                                |");
                                        System.out.println("3. TẬP VỞ                                                                              |");
                                        System.out.println("4. BÌA                                                                                 |");
                                        System.out.println("5. KẸP GIẤY                                                                            |");
                                        System.out.println("0. THOÁT                                                                               |");
                                        System.out.println("========================================================================================");
                                        System.out.print("Nhập chức năng (0 - 5): ");
                                       
                                        chonloaispxuat = CheckLoi.Checkloinhapchucnang(chonloaispxuat);
                                       
                                            switch(Integer.parseInt(chonloaispxuat)){
                                                case 1:
                                                    dssp.xuatdsspBut();
                                                    DuyetSanPhamXuat(dsspxuat, dssp.getDanhsachsp());
                                                    break;

                                                case 2:
                                                    dssp.xuatdsspGiay();
                                                    DuyetSanPhamXuat(dsspxuat, dssp.getDanhsachsp());
                                                    break;

                                                case 3:
                                                    dssp.xuatdsspTap();
                                                    DuyetSanPhamXuat(dsspxuat, dssp.getDanhsachsp());
                                                    break;

                                                case 4:
                                                    dssp.xuatdsspBia();
                                                    DuyetSanPhamXuat(dsspxuat, dssp.getDanhsachsp());
                                                    break;

                                                case 5:
                                                    dssp.xuatdsspKep();
                                                    DuyetSanPhamXuat(dsspxuat, dssp.getDanhsachsp());
                                                    break;

                                                case 0:
                                                    break;

                                                default:
                                                    System.out.println("Nhập sai!!!. Vui lòng nhập lại");
                                            }

                                    }while(Integer.parseInt(chonloaispxuat) != 0);
                                    
                                    //dsspchonxuat.GhiDanhSachSanPhamVaoFile();
                                    
                                    dssp.GhiDanhSachSanPhamVaoFile();
                                    
                                    dspx.themphieuxuat(pxh);
                                    
                                    dspx.ghithongtinphieuxuatvaofile();
                                    
                                    for( SanPham sp : dsspxuat ){
                                
                                        dschitietpx.Themchitietphieuxuat( pxh.getMaphieuxuat(), sp);
                                    }

                                
                                break;
                                
                                
                                
                            case 4:
                                
                                dspx.xuatphieuxuat(dschitietpx);
                                
                                dschitietpx.ghichitietphieuxuatvaofile();
                                
                                dsspxuat.removeAll(dsspxuat);    
                                break;
                                
                                
                            case 5:
                                
                                String chonchucnangncc = "";
                                do{
                                    dsncc.themnccbandauvaomang();
                                    System.out.println("=====================================QUẢN LÝ NHÀ CUNG CẤP=====================================");
                                    System.out.println("1. Thêm nhà cung cấp                                                                         |");
                                    System.out.println("2. Xoá nhà cung cấp theo mã nhà cung cấp                                                     |");
                                    System.out.println("3. Xoá nhà cung cấp theo số điện thoại                                                       |");
                                    System.out.println("4. Sửa thông tin nhà cung cấp                                                                |");
                                    System.out.println("5. Tìm kiếm nhà cung cấp theo tên nhà cung cấp                                               |");
                                    System.out.println("6. Tìm kiếm nhà cung cấp theo mã nhà cung cấp                                                |");
                                    System.out.println("7. Tìm kiếm nhà cung cấp theo số điện thoại                                                  |");
                                    System.out.println("8. Xem danh sách nhà cung cấp                                                                |");
                                    System.out.println("0. Thoát                                                                                     |");
                                    System.out.println("==============================================================================================");
                                    System.out.print("Nhập chức năng (0 - 8): ");
                                    
                                    
                                    chonchucnangncc = CheckLoi.Checkloinhapchucnang(chonchucnangncc);
                                    
                                    
                                    switch( Integer.parseInt(chonchucnangncc) ){
                                        case 1:
                                            dsncc.themncc();
                                            break;
                                        case 2:
                                            dsncc.xoancctheomancc();
                                            break;
                                        case 3:
                                            dsncc.xoancctheosdt();
                                            break;
                                        case 4:
                                            dsncc.Suathongtinncc();
                                            break;
                                        case 5:
                                            dsncc.TimKiemncctheotenncc();
                                            break;
                                        case 6:
                                            dsncc.TimKiemncctheomancc();
                                            break;
                                        case 7:
                                            dsncc.TimKiemncctheosdt();
                                            break;
                                        case 8:
                                            dsncc.Xuatdsncc();
                                            break;
                                        default:
                                            System.out.println("Nhập sai!!!. Vui lòng nhập lại");
                                    }
                                                                       
                                }while( Integer.parseInt(chonchucnangncc) != 0);
                                
                                break;
                                
                                
                            case 6:
                                String chonchucnangkh = "";
                                do{
                                    dskh.Themkhbandauvaomang();
                                    System.out.println("=====================================QUẢN LÝ KHÁCH HÀNG=====================================");
                                    System.out.println("1. Thêm khách hàng                                                                         |");
                                    System.out.println("2. Xoá khách hàng theo mã khách hàng                                                       |");
                                    System.out.println("3. Xoá khách hàng theo số điện thoại                                                       |");
                                    System.out.println("4. Sửa thông tin khách hàng                                                                |");
                                    System.out.println("5. Tìm kiếm khách hàng theo tên khách hàng                                                 |");
                                    System.out.println("6. Tìm kiếm khách hàng theo mã khách hàng                                                  |");
                                    System.out.println("7. Tìm kiếm khách hàng theo số điện thoại                                                  |");
                                    System.out.println("8. Xem danh sách khách hàng                                                                |");
                                    System.out.println("0. Thoát                                                                                   |");
                                    System.out.println("============================================================================================");
                                    System.out.print("Nhập chức năng (0 - 8): ");
                                    
                                    chonchucnangkh = CheckLoi.Checkloinhapchucnang(chonchucnangkh);
                                    
                                    switch( Integer.parseInt(chonchucnangkh) ){
                                        case 1:
                                            dskh.themkh();
                                            break;
                                        case 2:
                                            dskh.xoakhtheomakh();
                                            break;
                                        case 3:
                                            dskh.xoakhtheosodt();
                                            break;
                                        case 4:
                                            dskh.Suathongtinkh();
                                            break;
                                        case 5:
                                            dskh.TimKiemKhTheoTenkh();
                                            break;
                                        case 6:
                                            dskh.TimKiemKhTheoMakh();
                                            break;
                                        case 7:
                                            dskh.TimKiemKhTheosdt();
                                            break;
                                        case 8:
                                            dskh.Xuatdskh();
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Nhập sai!!!. Vui lòng nhập lại");
                                    }
                                                                       
                                }while( Integer.parseInt(chonchucnangkh) != 0);
                                break;
                                
                                
                            case 7:
                                String chonchucnangcuanv = "";
                                do{
                                    dsnv.DocFileNhanVienVaoMang();
                                    System.out.println("=====================================QUẢN LÝ NHÂN VIÊN=====================================");
                                    System.out.println("1. Thêm nhân viên                                                                         |");
                                    System.out.println("2. Xoá nhân viên theo mã nhân viên                                                        |");
                                    System.out.println("3. Xoá nhân viên theo số điện thoại                                                       |");
                                    System.out.println("4. Sửa thông tin nhân viên                                                                |");
                                    System.out.println("5. Tìm kiếm nhân viên theo tên nhân viên                                                  |");
                                    System.out.println("6. Tìm kiếm nhân viên theo mã nhân viên                                                   |");
                                    System.out.println("7. Tìm kiếm nhân viên theo số điện thoại                                                  |");
                                    System.out.println("8. Xem danh sách nhân viên                                                                |");
                                    System.out.println("0. Thoát                                                                                  |");
                                    System.out.println("===========================================================================================");
                                    System.out.print("Nhập chức năng (0 - 8): ");
                                    
                                    
                                    chonchucnangcuanv = CheckLoi.Checkloinhapchucnang(chonchucnangcuanv);
                                    
                                    
                                    switch( Integer.parseInt(chonchucnangcuanv) ){
                                        case 1:
                                            dsnv.themnhanvien();
                                            break;
                                        case 2:
                                            dsnv.xoanhanvientheomanv();
                                            break;
                                        case 3:
                                            dsnv.xoanhanvientheosdt();
                                            break;
                                        case 4:
                                            dsnv.Suathongtinnv();
                                            break;
                                        case 5:
                                            dsnv.TimKiemnhanvientheotennv();
                                            break;
                                        case 6:
                                            dsnv.TimKiemnhanvientheomanv();
                                            break;
                                        case 7:
                                            dsnv.TimKiemnhanvientheosdt();
                                            break;
                                        case 8:
                                            dsnv.Xuatdsnv();
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Nhập sai!!!. Vui lòng nhập lại");
                                    }
                                                                       
                                }while( Integer.parseInt(chonchucnangcuanv) != 0);
                                break;
                                
                                
                                
                            case 8:
                                String chonchucnangqltaikhoannv = "";
                                do{
                                    dstknv.DocFileTaiKhoanNhanVienVaoMang();
                                    System.out.println("=====================================QUẢN LÝ TÀI KHOẢN NHÂN VIÊN=====================================");
                                    System.out.println("1. Thêm tài khoản nhân viên                                                                         |");
                                    System.out.println("2. Xoá tài khoản nhân viên                                                                          |");
                                    System.out.println("0. Thoát                                                                                            |");
                                    System.out.println("=====================================================================================================");
                                    System.out.print("Nhập chức năng (0-2): ");
                                    
                                    
                                    chonchucnangqltaikhoannv = CheckLoi.Checkloinhapchucnang(chonchucnangqltaikhoannv);
                                    
                                    
                                    switch( Integer.parseInt(chonchucnangqltaikhoannv) ){
                                        case 1:
                                            dstknv.themtaikhoannhanvien();
                                            break;
                                        case 2:
                                            dstknv.xoataikhoannhanvien();
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Nhập sai!!!. Vui lòng nhập lại");
                                    }
                                                                       
                                }while( Integer.parseInt(chonchucnangqltaikhoannv) != 0);
                                break;
                                
                                
                                
                            case 9:
                                String chonchucnangqlluongnv = "";
                                do{
                                    System.out.println("=====================================QUẢN LÝ LƯƠNG NHÂN VIÊN=====================================");
                                    System.out.println("1. Phát lương cho nhân viên                                                                     |");
                                    System.out.println("2. Xem lương nhân viên                                                                          |");
                                    System.out.println("0. Thoát                                                                                        |");
                                    System.out.println("=================================================================================================");
                                    System.out.print("Nhập chức năng (0 - 2): ");
                                    
                                    
                                    chonchucnangqlluongnv = CheckLoi.Checkloinhapchucnang(chonchucnangqlluongnv);
                                    
                                    
                                    switch( Integer.parseInt(chonchucnangqlluongnv) ){
                                        case 1:
                                            CheckLoi.CheckQuyen();
                                            for(NhanVien nv : dsnv.getDsnv()){
                                                nv.PhatLuong();
                                            }
                                            break;
                                            
                                        case 2:
                                            System.out.println(" Họ tên nhân viên \t\t\t Lương");
                                            int i = 1;
                                            for(NhanVien nv : dsnv.getDsnv()){
                                                System.out.println(i + ". " + nv.getHoten() + "\t\t\t" + nv.XemLuong() );
                                                i++;
                                            }
                                            break;
                                            
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Nhập sai!!!. Vui lòng nhập lại");
                                    }
                                                                       
                                }while( Integer.parseInt(chonchucnangqlluongnv) != 0);
                                break;
                            
                                
                                
                            case 10:
                                String chonxemsp = "";
                                    do{
                                       
                                        System.out.println("===========================CHỌN LOẠI SẢN PHẨM MÀ BẠN MUỐN XEM==========================");
                                        System.out.println("1. BÚT                                                                                |");
                                        System.out.println("2. GIẤY                                                                               |");
                                        System.out.println("3. TẬP VỞ                                                                             |");
                                        System.out.println("4. BÌA                                                                                |");
                                        System.out.println("5. KẸP GIẤY                                                                           |");
                                        System.out.println("0. THOÁT                                                                              |");
                                        System.out.println("=======================================================================================");
                                        System.out.println("Nhập chức năng (0 - 5): ");
                                        
                                        
                                        chonxemsp = CheckLoi.Checkloinhapchucnang(chonxemsp);
                                        
                                        
                                            switch( Integer.parseInt(chonxemsp) ){
                                                case 1:
                                                    dssp.xuatdsspBut();
                                                    System.out.println("");
                                                    break;

                                                case 2:
                                                    dssp.xuatdsspGiay();
                                                    System.out.println("");
                                                    break;

                                                case 3:
                                                    dssp.xuatdsspTap();
                                                    System.out.println("");
                                                    break;

                                                case 4:
                                                    dssp.xuatdsspBia();
                                                    System.out.println("");
                                                    break;

                                                case 5:
                                                    dssp.xuatdsspKep();
                                                    System.out.println("");
                                                    break;

                                                case 0:
                                                    break;

                                                default:
                                                    System.out.println("Nhập sai chức năng!!! Nhập lại");
                                            }

                                    }while( Integer.parseInt(chonxemsp) != 0);
                                break;
                                
                            
                            case 11:
                                
                                String chonchucnanghd = ""; 
                                do{
                                    System.out.println("============================HÓA ĐƠN================================");
                                    System.out.println("1. Xem danh sách hóa đơn                                          |");
                                    System.out.println("2. Tìm kiếm hóa đơn theo mã hóa đơn                               |");
                                    System.out.println("3. Tìm kiếm hóa đơn theo mã khách hàng                            |");
                                    System.out.println("0. Thoát                                                          |");
                                    System.out.println("===================================================================");
                                    System.out.println("Nhập chức năng (0 - 3): ");
                                    
                                    chonchucnanghd = CheckLoi.Checkloinhapchucnang(chonchucnanghd);
                                    switch( Integer.parseInt(chonchucnanghd) ){
                                        case 1:
                                            dshd.xuathd(dschitiethd);
                                            break;
                                        case 2:
                                            System.out.print("Nhập mã hóa đơn cần tìm:");
                                            dshd.TimKiemHoaDonTheoMaHoaDon(dschitiethd);
                                            break;
                                        case 3:
                                            System.out.print("Nhập mã khách hàng cần tìm:");
                                            dshd.TimKiemHoaDonTheoMaKhachHang(dschitiethd);
                                            break;
                                        case 0:
                                            break;

                                        default:
                                            System.out.println("Nhập sai chức năng!!! Nhập lại");
                                    }
                                }while(Integer.parseInt(chonchucnanghd) != 0);
                                break;
                                
                            case 0:
                                break;
                            default:
                                System.out.println("Nhập sai dữ liệu!!!");
                        }
                        
                    }while(Integer.parseInt(chonchucnangql) != 0);    
                    break;        
                            
                case 0:
                    break;
                    
                default:
                    System.out.println("Nhập sai chức năng!!! Nhập lại");
            }
            
        }while( Integer.parseInt(luachon) != 0);
        
        System.out.println("CẢM ƠN BẠN ĐÃ TIN TƯỞNG SỬ DỤNG PHẦN MỀM CỦA CHÚNG TÔI!!!");
        
        
        
    }
    
    
}
