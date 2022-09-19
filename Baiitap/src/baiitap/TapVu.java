package baiitap;
import java.util.Scanner;

public class TapVu extends nhanvien {
    public int sogiolamthem;
    public TapVu(){
        super();
    }
    
    @Override 
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so gio lam them: ");
        sogiolamthem = nhanvien.sc.nextInt();
    }
 
    public int getSogiolamthem(){
        return sogiolamthem;
    }
    public void setSogiolamthem(int sogiolamthem){
        this.sogiolamthem = sogiolamthem;
    }
}
