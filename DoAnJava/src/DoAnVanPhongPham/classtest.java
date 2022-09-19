package DoAnVanPhongPham;

import static DoAnVanPhongPham.ConNguoi.sc;

public class classtest {
    public static void main(String[] args) {
        /*String chuoi1;
        chuoi1 = sc.nextLine();        //PN1001
        System.out.println(chuoi1);
        
        String chuoi2[] = chuoi1.split("N");
        
        int n = Integer.parseInt(chuoi2[1]);
        
        n++;
        
        String chuoin = String.valueOf(n);
        
        String chuoimoi = "PN".concat(chuoin);
        
        System.out.println(chuoimoi);*/
        
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        
        String temp = String.valueOf(date);         //Chuyển sang định dạng chuỗi
        
        String arr[] = temp.split("-");             //Cắt chuỗi 
        
        String time = arr[2] + "/" + arr[1] + "/" + arr[0];     //Sắp xếp lại thành định dạng dd/mm/yy
        
        System.out.println(time);
    }
}
