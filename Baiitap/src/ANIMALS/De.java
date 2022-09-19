package ANIMALS;

import java.util.Random;

public class De extends giasuc {

    public De() { 
        super();
    }

    public De(String ten, int soLitSua, int sinhCon) {
        super(ten, soLitSua, sinhCon);
    }
    
    @Override
    public void TiengKeu() {
        System.out.println("be be");
    }
    
    public void setSinhCon() {
        Random rand = new Random();
        sinhCon = rand.nextInt(100)+1;
    }
    
    public void setSoLitSua() {
        Random rand = new Random();
        sinhCon = rand.nextInt(10);
    }
    
}
