package ANIMALS;

public class Meo extends DongVat {

    public Meo() {
        super();
    }

    public Meo(String name, int age, String food, String sound) {
        super(name, age, food, sound);
    }
    
    @Override
    public void thucan() {
        System.out.println("Mèo ăn cá");
    }

    @Override
    public void tiengkeu() {
        System.out.println("Meow meow");
    }
}
