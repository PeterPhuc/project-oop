package chuong0;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Testclass {
    public static Scanner sc = new Scanner(System.in);
    
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
    
    
    public static String CheckMaSanPhamBut(String maspbut){
        do{                      
               maspbut = sc.nextLine();
              
               if( maspbut.matches("BT" + "[0-9]{1,3}") ){
                   
                    
                        break;
                  
                    
               }
               else{
                    System.out.println("Nhập sai định dạng!!! Mời nhập lại (ví dụ: NV1001): ");
               }
                                           
        }while(true);
        
        return maspbut;
    }
    
    public static void main(String[] args) {

         /*String dmy = "";
         Testclass.CheckDMY(dmy);*/
         
                      
         String maspbut = null;
         
         maspbut = CheckMaSanPhamBut(maspbut);
         
         System.out.println(maspbut);
         
    }
    
    
    
}
