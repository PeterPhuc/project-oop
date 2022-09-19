package DoAnVanPhongPham;

import java.io.IOException;
import java.util.ArrayList;

import static DoAnVanPhongPham.ConNguoi.sc;

public class DanhSachSanPham {
    private ArrayList<SanPham> danhsachsp;

    public DanhSachSanPham() {
        this.danhsachsp = new ArrayList<SanPham>();
    }

    public DanhSachSanPham(ArrayList<SanPham> danhsachsp) {
        this.danhsachsp = danhsachsp;
    }
    
    public void Themsp() throws IOException{
        
        File.docfilespBUT(danhsachsp, "sanphambut.txt");
        File.docfilespGIAY(danhsachsp, "sanphamgiay.txt");
        File.docfilespTAP(danhsachsp, "sanphamtap.txt");
        File.docfilespBIA(danhsachsp, "sanphambia.txt");
        File.docfilespKEP(danhsachsp, "sanphamkep.txt");
        
    }
    

    public void xuatdsspBut(){
        System.out.printf("\t %-10s %-10s %-25s %-20s %-30s %s \n" , "Mã sp",  "Loại", "Tên", "Màu", "Đơn giá", "Số lượng");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof BUT){
                System.out.print( i + ". ");
                sp.xuatinfosanpham();
                i++;
            }
        }
    }
    
    public void xuatdsspGiay(){
        System.out.printf("\t %-10s %-10s %-30s %-20s %-10s %-20s %s \n", "Mã sp", "Loại sp", "Tên sp", "Màu", "Khổ", "Đơn giá", "Số lượng");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof GIAY){
                System.out.print( i + ". ");
                sp.xuatinfosanpham();
                i++;
            }
        }
    }
    
    public void xuatdsspTap(){
        System.out.printf("\t %-10s %-10s %-30s %-10s %-25s %s \n", "Mã sp", "Loại sp", "Tên sp", "Số trang", "Đơn giá", "Số lượng");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof TapVo){
                System.out.print( i + ". ");
                sp.xuatinfosanpham();
                i++;
            }
        }
    }
    
    public void xuatdsspBia(){
        System.out.printf("\t %-10s %-10s %-30s %-20s %-10s %-20s |%s \n", "Mã sp", "Loại sp", "Tên sp", "Màu", "Khổ", "Đơn giá", "Số lượng");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof BIA){
                System.out.print( i + ". ");
                sp.xuatinfosanpham();
                i++;
            }
        }
    }
    
    public void xuatdsspKep(){
        System.out.printf("\t %-10s %-10s %-25s %-20s %-20s %s \n", "Mã sp", "Loại sp", "Tên sp", "Màu", "Đơn giá", "Số lượng");
        int i = 1;
        for(SanPham sp : danhsachsp){
            if(sp instanceof KEP){
                System.out.print( i + ". ");
                sp.xuatinfosanpham();
                i++;
            }
        }
    }
    
    public void GhiDanhSachSanPhamVaoFile() throws IOException{
        File.ghifileSP(danhsachsp);
    }

    public ArrayList<SanPham> getDanhsachsp() {
        return danhsachsp;
    }

    public void setDanhsachsp(ArrayList<SanPham> danhsachsp) {
        this.danhsachsp = danhsachsp;
    }
    
   
}
