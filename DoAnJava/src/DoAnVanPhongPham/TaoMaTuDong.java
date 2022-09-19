package DoAnVanPhongPham;

import java.io.BufferedReader;
import java.io.FileReader;

public class TaoMaTuDong {
    
    public static String TaoMaKhachHang(){
        String makhachhang = null;
        try {
            FileReader rt = new FileReader("danhsachkhachhang.txt");
            BufferedReader br = new BufferedReader(rt);
            
            String line = br.readLine();
            
            if(line == null){
               makhachhang = "KH10001";
            }
            
            else{
                String temp = null;
                while(true){
                    if(line == null){        
                        String txt[] = temp.split("-");
                        
                        String temp1[] = txt[0].split("H");
                        int x = Integer.parseInt(temp1[1]);
                        x++;
                        String newtemp = String.valueOf(x);
                        makhachhang = "KH".concat(newtemp);
                    }
                    temp = line;
                    line = br.readLine();
                }
            }
            
        }
        catch(Exception e){
        }                 
        return makhachhang;
    }
    
    public static String TaoMaHoaDon(){
        String mahoadon = null;
        try {
            FileReader rt = new FileReader("danhsachhoadon.txt");
            BufferedReader br = new BufferedReader(rt);
            
            String line = br.readLine();
            
            if(line == null){
               mahoadon = "HD10001";
            }
            
            else{
                String temp = null;
                while(true){
                    if(line == null){        
                        String txt[] = temp.split("-");
                        
                        String temp1[] = txt[0].split("D");
                        int x = Integer.parseInt(temp1[1]);
                        x++;
                        String newtemp = String.valueOf(x);
                        mahoadon = "HD".concat(newtemp);
                    }
                    temp = line;
                    line = br.readLine();
                }
            }
            
        }
        catch(Exception e){
        }                 
        return mahoadon;
    }
    
    public static String TaoMaPhieuNhap(){
        String maphieunhap = null;
        try {
            FileReader rt = new FileReader("danhsachphieunhap.txt");
            BufferedReader br = new BufferedReader(rt);
            
            String line = br.readLine();
            
            if(line == null){
               maphieunhap = "PN1001";
            }
            
            else{
                String temp = null;
                while(true){
                    if(line == null){        
                        String txt[] = temp.split("-");
                        
                        String temp1[] = txt[0].split("N");
                        int x = Integer.parseInt(temp1[1]);
                        x++;
                        String newtemp = String.valueOf(x);
                        maphieunhap = "PN".concat(newtemp);
                    }
                    temp = line;
                    line = br.readLine();
                }
            }
            
        }
        catch(Exception e){
        }                 
        return maphieunhap;
    }
    
    public static String TaoMaPhieuXuat(){
        String maphieuxuat = null;
        try {
            FileReader rt = new FileReader("danhsachphieuxuat.txt");
            BufferedReader br = new BufferedReader(rt);
            
            String line = br.readLine();
            
            if(line == null){
               maphieuxuat = "PX1001";
            }
            
            else{
                String temp = null;
                while(true){
                    if(line == null){        
                        String txt[] = temp.split("-");
                        
                        String temp1[] = txt[0].split("X");
                        int x = Integer.parseInt(temp1[1]);
                        x++;
                        String newtemp = String.valueOf(x);
                        maphieuxuat = "PX".concat(newtemp);
                    }
                    temp = line;
                    line = br.readLine();
                }
            }
            
        }
        catch(Exception e){
        }                 
        return maphieuxuat;
    }
    
    public static String TaoMaNhaCungCap(){
        String manhacungcap = null;
        try {
            FileReader rt = new FileReader("danhsachnhacungcap.txt");
            BufferedReader br = new BufferedReader(rt);
            
            String line = br.readLine();
            
            if(line == null){
               manhacungcap = "NC1001";
            }
            
            else{
                String temp = null;
                while(true){
                    if(line == null){        
                        String txt[] = temp.split("-");
                        
                        String temp1[] = txt[0].split("C");
                        int x = Integer.parseInt(temp1[1]);
                        x++;
                        String newtemp = String.valueOf(x);
                        manhacungcap = "NC".concat(newtemp);
                    }
                    temp = line;
                    line = br.readLine();
                }
            }
            
        }
        catch(Exception e){
        }                 
        return manhacungcap;
    }
    
    
    public static String TaoMaNhanVien(){
        String manhanvien = null;
        try {
            FileReader rt = new FileReader("danhsachnhanvien.txt");
            BufferedReader br = new BufferedReader(rt);
            
            String line = br.readLine();
            
            if(line == null){
               manhanvien = "NV1001";
            }
            
            else{
                String temp = null;
                while(true){
                    if(line == null){        
                        String txt[] = temp.split("-");
                        
                        String temp1[] = txt[0].split("V");
                        int x = Integer.parseInt(temp1[1]);
                        x++;
                        String newtemp = String.valueOf(x);
                        manhanvien = "NV".concat(newtemp);
                    }
                    temp = line;
                    line = br.readLine();
                }
            }
            
        }
        catch(Exception e){
        }                 
        return manhanvien;
    }
    
    public static String LayNgayHienTai(){
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        
        String temp = String.valueOf(date);         //Chuyển sang định dạng chuỗi
        
        String arr[] = temp.split("-");             //Cắt chuỗi 
        
        String time = arr[2] + "/" + arr[1] + "/" + arr[0];     //Sắp xếp lại thành định dạng dd/mm/yy
        
        return time;
    }
    
}
