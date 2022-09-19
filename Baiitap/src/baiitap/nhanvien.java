package baiitap;
import java.util.Scanner;

public class nhanvien {
    static Scanner sc = new Scanner(System.in); 
    protected String manv;
    protected String hoten;
    protected int hesoluong; 
    protected int luongcb;
    
    public nhanvien(){
        
    }
    public void nhap(){
        System.out.println("NHẬP THÔNG TIN: ");
        System.out.print("Nhap ma nhan vien: ");
           this.manv = sc.nextLine();
        System.out.print("Nhap ho ten: ");
           this.hoten = sc.nextLine();
        System.out.print("Nhap he so luong: ");
           this.hesoluong = sc.nextInt();
        System.out.print("Nhap luong co ban: ");
           this.luongcb = sc.nextInt();
    }
    public String getManv(){
        return manv;
    }
    public void setManv(String manv){
        this.manv = manv;
    }
    public String getHoten(){
        return hoten;
    }
    public void setHoten(String hoten){
        this.hoten = hoten;
    }
    public int getHesoluong(){
        return hesoluong;
    }
    public void setHesoluong(int hesoluong){
        this.hesoluong = hesoluong;
    }
    public int getLuongcb(){
        return luongcb;
    }
    public void setLuongcb(int luongcb){
        this.luongcb = luongcb;
    }
    public int TinhLuong(){
        return luongcb * hesoluong;
    }
}
