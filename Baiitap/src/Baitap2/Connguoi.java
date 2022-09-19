package Baitap2;
import java.util.Scanner;
        
public class Connguoi {
    public static Scanner sc = new Scanner(System.in);
    protected String hoten;
    protected Ngay ngaysinh ;
    protected String sodt;
    protected String mail;
    protected Diachi address;

    public Connguoi() {
        this.hoten = null;
        this.ngaysinh = null;
        this.sodt = null;
        this.mail = null;
        this.address = null;
    }
    
    public Connguoi(String hoten, Ngay ngaysinh, String sodt, String mail, Diachi address) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.sodt = sodt;
        this.mail = mail;
        this.address = address;
    }
    
    public void nhap(){
        System.out.print("Nhập họ tên: ");
        hoten = sc.nextLine();
        
        System.out.println("Nhập ngay sinh: ");
        Ngay day = new Ngay();
        day.nhap();
        ngaysinh = day;
        
        sc.nextLine();
        
        System.out.print("Nhập số điện thoại: ");
        sodt = sc.nextLine();
      
        System.out.print("Nhập email: ");
        mail = sc.nextLine();
        
        System.out.println("Nhập địa chỉ: ");
        Diachi add = new Diachi();
        add.nhapdiachi();
        address = add;
    }
    
    public void xuatthongtin(){
        System.out.println(hoten);
        System.out.println(ngaysinh);
        System.out.println(sodt);
        System.out.println(mail);
        System.out.println(address);
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Ngay getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Ngay ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Diachi getAddress() {
        return address;
    }

    public void setAddress(Diachi address) {
        this.address = address;
    }
}
