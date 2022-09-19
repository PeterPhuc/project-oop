package ANIMALS;

import java.util.Random;

public class Cuu extends giasuc {

    public Cuu() { 
        super();
    }

    public Cuu(String ten, int soLitSua, int sinhCon) {
        super(ten, soLitSua, sinhCon);
    }
     
    @Override
    public void TiengKeu() {
        System.out.println("bê bê");
    }
    
    public void setSinhCon() {
        Random rand = new Random();
        sinhCon = rand.nextInt(100)+1;
    }
    
    public void setSoLitSua() {
        Random rand = new Random();
        sinhCon = rand.nextInt(5);
    }
    
}
