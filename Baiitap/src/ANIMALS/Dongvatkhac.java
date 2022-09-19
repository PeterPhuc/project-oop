package ANIMALS;

public class Dongvatkhac extends DongVat {

    public Dongvatkhac() {
        super();
    }

    public Dongvatkhac(String name, int age, String food, String sound) {
        super(name, age, food, sound);
    }

    @Override
    public void thucan() {
        System.out.println(food);       
    }

    @Override
    public void tiengkeu() {
        System.out.println(sound);
    }
}
