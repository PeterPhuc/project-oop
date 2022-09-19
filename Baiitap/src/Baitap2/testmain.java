package Baitap2;

public class testmain {
    public static void main(String[] agrs){
       /* Connguoi cn = new Connguoi();
        cn.nhap();
        cn.xuatthongtin();*/
       
       Sinhvien a = new Sinhvien();
       Sinhvien b = new Sinhvien();
       Sinhvien c = new Sinhvien();
       
       System.out.println(" + Nhập thông tin sinh viên 1: ");
       a.nhapinforsv();
     
       System.out.println(" + Nhập thông tin sinh viên 2: ");
       System.out.println("");
       b.nhapinforsv();
     
       System.out.println(" + Nhập thông tin sinh viên 3: ");
       System.out.println("");
       c.nhapinforsv();
       
       System.out.println("");
       System.out.println(" + THÔNG TIN SINH VIÊN 1: ");
       a.xuatinforsv();
       
       System.out.println("");
       System.out.println(" + THÔNG TIN SINH VIÊN 2: ");
       b.xuatinforsv();
       
       System.out.println("");
       System.out.println(" + THÔNG TIN SINH VIÊN 3: ");
       c.xuatinforsv();
    }
}
