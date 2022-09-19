package ANIMALS;
import java.util.Random;

public class Bo extends giasuc {

    public Bo() {
        super();
    }

    public Bo(String ten, int soLitSua, int sinhCon) {
        super(ten, soLitSua, sinhCon);
    }

    @Override
    public void TiengKeu() {
        System.out.println("ò ò");
    }
    
    public void setSinhCon() {
        Random rand = new Random();
        sinhCon = rand.nextInt(100)+1;
    }
   
    public void setSoLitSua() {
        Random rand = new Random();
        sinhCon = rand.nextInt(20);
    }
}
