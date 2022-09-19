package baiitap;

public class Main {
    
    public static void tinh(Main op){
        op.a = 6;
        op.b = 100;
    }
    
    public static void main(String[] args) {
        /*nhanvien nv = new nhanvien();
        nv.nhap();
        System.out.println("Thông tin nhân viên: ");
        System.out.println(nv.getManv());
        System.out.println(nv.getHoten());
        System.out.println(nv.getHesoluong());
        System.out.println(nv.getLuongcb());
        System.out.println(nv.TinhLuong());
        nhanvien.sc.nextLine();
        System.out.println("");
        
        TruongPhong tp = new TruongPhong();
        tp.nhap();
        System.out.println("Thông tin trưởng phòng: ");
        System.out.println(tp.getManv());
        System.out.println(tp.getHoten());
        System.out.println(tp.getHesoluong());
        System.out.println(tp.getLuongcb());
        System.out.println(tp.getHesotrachnhiem());
        System.out.println(tp.TinhLuong());
        nhanvien.sc.nextLine();
        System.out.println("");
        
        TapVu tv = new TapVu();
        tv.nhap();
        System.out.println("Thông tin tập vụ: ");
        System.out.println(tv.getManv());
        System.out.println(tv.getHoten());
        System.out.println(tv.getHesoluong());
        System.out.println(tv.getLuongcb());
        System.out.println(tv.getSogiolamthem());
        System.out.println(tv.TinhLuong());*/
        int a, b;
        a = 5;
        b = 6;
        
        Main op = new Main();
        tinh(op);
        
        System.out.println(op.a + " " op.b);
    }
}
