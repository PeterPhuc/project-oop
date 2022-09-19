package baiitap;
import java.util.Scanner;

public class TruongPhong extends nhanvien {
    private int hesotrachnhiem;
    
    public TruongPhong(){
        super();
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap he so trach nhiem: ");
        hesotrachnhiem = nhanvien.sc.nextInt();
    }
   
    public int getHesotrachnhiem(){
        return hesotrachnhiem;
    }
    public void setHesotrachnhiem(int hesotrachnhiem){
        this.hesotrachnhiem = hesotrachnhiem;
    }
}
