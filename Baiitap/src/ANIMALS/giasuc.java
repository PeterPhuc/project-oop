package ANIMALS;

public class giasuc {
    protected String ten;
    protected double soLitSua;
    protected int sinhCon;

    public giasuc() {
        this.ten = "null";
        this.soLitSua = 0;
        this.sinhCon = 0;
    }

    public giasuc(String ten, int soLitSua, int sinhCon) {
        this.ten = ten;
        this.soLitSua = soLitSua;
        this.sinhCon = sinhCon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getSoLitSua() {
        return soLitSua;
    }

    public void setSoLitSua(double soLitSua) {
        this.soLitSua = soLitSua;
    }

    public int getSinhCon() {
        return sinhCon;
    }

    public void setSinhCon(int sinhCon) {
        this.sinhCon = sinhCon;
    }
    
    public void TiengKeu(){
        System.out.println("Gia súc kêu");
    }
}
