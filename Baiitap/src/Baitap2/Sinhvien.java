package Baitap2;

public class Sinhvien extends Connguoi {
    private String noihoc;
    private String lop;

    public Sinhvien() {
        super();
        this.noihoc = null;
        this.lop = null;
    }

    public Sinhvien(String noihoc, String lop, String hoten, Ngay ngaysinh, String sodt, String mail, Diachi address) {
        super(hoten, ngaysinh, sodt, mail, address);
        this.noihoc = noihoc;
        this.lop = lop;
    }
    
    public void nhapinforsv(){
        super.nhap();
        System.out.print("Nhập nơi học: ");
        noihoc = Connguoi.sc.nextLine();
        
        System.out.print("Nhập lớp học: ");
        lop = Connguoi.sc.nextLine();
    }
    
    public void xuatinforsv(){
        super.xuatthongtin();
        System.out.println(noihoc);
        System.out.println(lop);
    }

    public String getNoihoc() {
        return noihoc;
    }

    public void setNoihoc(String noihoc) {
        this.noihoc = noihoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
}
