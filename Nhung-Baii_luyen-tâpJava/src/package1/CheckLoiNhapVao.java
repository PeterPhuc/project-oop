package package1;

import static package1.BailLuyen1.sc;

public class CheckLoiNhapVao {
    
    public static int CheckSoNguyen(String dauvao) {
        int Nhap;
            try {
                Nhap = Integer.parseInt(dauvao);
                return 1;
            } catch (NumberFormatException exception) {  //Bắt lỗi sai định dạng sô nguyên, ko thể chuyển từ String sang int được
                return 0;
            }
    }
    
    
    public static int CheckNhapSoNguyen(){   
        String dauvao = null;
        do{                      
            dauvao = sc.nextLine();
            int checkloi = CheckSoNguyen(dauvao);  
            if( checkloi == 1 ){
                break;
            }else{
                System.out.println("Nhập sai định dạng số nguyên!!! Nhập lại: ");             
            }           
        }while(true);
        
        return Integer.parseInt(dauvao);
    }
}
