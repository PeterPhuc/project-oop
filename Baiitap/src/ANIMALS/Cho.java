package ANIMALS;

import java.util.Scanner;

public class Cho extends DongVat {

    public Cho() {
       super();
    }

    public Cho(String name, int age, String food, String sound) {
        super(name, age, food, sound);
    }

    @Override
    public void thucan() {
        System.out.println("Chó ăn cơm");
    }

    @Override
    public void tiengkeu() {
        System.out.println("Gâu gâu");
    }
}
