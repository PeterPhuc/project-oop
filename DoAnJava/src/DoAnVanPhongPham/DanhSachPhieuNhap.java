package DoAnVanPhongPham;

import java.io.IOException;
import java.util.ArrayList;


public class DanhSachPhieuNhap {
    private ArrayList<PhieuNhapHang> dspn;
    private ArrayList<SanPham> danhsachsp;

    public DanhSachPhieuNhap() {
        this.dspn = new ArrayList<PhieuNhapHang>();
        this.danhsachsp = new ArrayList<SanPham>();
    }

    public DanhSachPhieuNhap(ArrayList<PhieuNhapHang> dspn, ArrayList<SanPham> danhsachsp) {
        this.dspn = dspn;
        this.danhsachsp = danhsachsp;
    }
    
    
    public void docfiletuphieunhap() throws IOException{
        File.docfilephieunhap(dspn);
    }
    
    
    
    
    public void themspnhap() throws IOException{
        
        File.docfilespBUT(danhsachsp, "sanphamnhapbut.txt");
        File.docfilespGIAY(danhsachsp, "sanphamnhapgiay.txt");
        File.docfilespTAP(danhsachsp, "sanphamnhaptap.txt");
        File.docfilespBIA(danhsachsp, "sanphamnhapbia.txt");
        File.docfilespKEP(danhsachsp, "sanphamnhapkep.txt");
        
    }
    
    public void xuatdsspnhapBut(){
        System.out.printf("\t %-10s %-10s %-25s %-20s %s\n" , "Mã sp",  "Loại", "Tên", "Màu", "Đơn giá");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof BUT){
                System.out.print( i + ". ");
                sp.xuatinfospnosoluong();
                i++;
            }
        }
    }
    
    public void xuatdsspnhapGiay(){
        System.out.printf("\t %-10s %-10s %-30s %-20s %-10s %s \n", "Mã sp", "Loại sp", "Tên sp", "Màu", "Khổ", "Đơn giá");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof GIAY){
                System.out.print( i + ". ");
                sp.xuatinfospnosoluong();
                i++;
            }
        }
    }
    
    public void xuatdsspnhapTap(){
        System.out.printf("\t %-10s %-10s %-30s %-10s %s \n", "Mã sp", "Loại sp", "Tên sp", "Số trang", "Đơn giá");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof TapVo){
                System.out.print( i + ". ");
                sp.xuatinfospnosoluong();
                i++;
            }
        }
    }
    
    public void xuatdsspnhapBia(){
        System.out.printf("\t %-10s %-10s %-30s %-20s %-10s %s \n", "Mã sp", "Loại sp", "Tên sp", "Màu", "Khổ", "Đơn giá");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof BIA){
                System.out.print( i + ". ");
                sp.xuatinfospnosoluong();
                i++;
            }
        }
    }
    
    public void xuatdsspnhapKep(){
        System.out.printf("\t %-10s %-10s %-25s %-20s %s \n", "Mã sp", "Loại sp", "Tên sp", "Màu", "Đơn giá");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof KEP){
                System.out.print( i + ". ");
                sp.xuatinfospnosoluong();
                i++;
            }
        }
    }
    
    
    
    public void themphieunhap(PhieuNhapHang pn){
        dspn.add(pn);
    }
    
    
    
    public void xuatphieunhap( DanhSachChiTietPhieuNhap dsctpn ){
        
        int count = 1;
        for(PhieuNhapHang i : dspn){
            
            System.out.println("PHIẾU NHẬP " + count++ );
            System.out.println("");
            System.out.println("---------------------------------------------THÔNG TIN PHIẾU NHẬP HÀNG---------------------------------------------");
            System.out.printf("%-20s %-30s %s\n", "Mã phiếu nhập", "Mã nhà cung cấp", "Ngày nhập hàng");
            i.xuatinfophieunhap();
            
            System.out.println("");
            System.out.println("---------------------------------------------CHI TIẾT PHIẾU NHẬP HÀNG----------------------------------------------");
            
            int stt = 1;
            double tongtien = 0;
            for( ChiTietPhieuNhap j : dsctpn.getDsctpn() ){
                
                if( i.getMaphieunhap().compareTo(j.getMaphieunhap()) == 0 ){
                     
                    System.out.print(stt + ".  ");
                    j.xuatchitietphieunhap();
                    
                    tongtien = tongtien + j.ThanhTienNhapSP();
                    stt++;
                    
                    System.out.println("");
                }
                
            }
            System.out.println("Tổng tiền phiếu nhập: " + i.TongTienPhieuNhap(tongtien));
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }
    
    public void ghithongtinphieunhapvaofile() throws IOException{
        File.ghifilephieunhap(dspn);
    }

    public ArrayList<PhieuNhapHang> getDspn() {
        return dspn;
    }

    public void setDspn(ArrayList<PhieuNhapHang> dspn) {
        this.dspn = dspn;
    }

    public ArrayList<SanPham> getDanhsachsp() {
        return danhsachsp;
    }

    public void setDanhsachsp(ArrayList<SanPham> danhsachsp) {
        this.danhsachsp = danhsachsp;
    }
    
}
