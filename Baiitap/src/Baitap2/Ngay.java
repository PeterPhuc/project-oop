package Baitap2;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;
     
    public Ngay() {
        this.ngay = 0;
        this.thang = 0;
        this.nam = 0;
    } 

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    public void nhap(){
        System.out.print(" - Ngày: ");
        ngay = Connguoi.sc.nextInt();
        System.out.print(" - Tháng: ");
        thang = Connguoi.sc.nextInt();
        System.out.print(" - Năm: ");
        nam = Connguoi.sc.nextInt();
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
     
    public String toString(){
        return ngay + "/" + thang + "/" + nam;
    }
}
