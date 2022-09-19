package Baitap2;

public class Diachi {
    private String sonha;
    private String duong;
    private String quan;
    private String tp;

    public Diachi() {
        this.sonha = null;
        this.duong = null;
        this.quan = null;
        this.tp = null;
    }

    public Diachi(String sonha, String duong, String quan, String tp) {
        this.sonha = sonha;
        this.duong = duong;
        this.quan = quan;
        this.tp = tp;
    }
    
    public void nhapdiachi(){
        System.out.print(" - Nhập số nhà: ");
        sonha = Connguoi.sc.nextLine();
        System.out.print(" - Nhập tên đường: ");
        duong = Connguoi.sc.nextLine();
        System.out.print(" - Nhập quận: ");
        quan = Connguoi.sc.nextLine();
        System.out.print(" - Nhập thành phố: ");
        tp = Connguoi.sc.nextLine();
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }
    
    @Override
    public String toString(){
        return sonha + "/" + duong + "/" + quan + "/" + tp;   
    }
}
