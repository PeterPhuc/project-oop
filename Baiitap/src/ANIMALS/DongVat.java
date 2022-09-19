package ANIMALS;

import java.util.Scanner;

public class DongVat {
    protected String name;
    protected int age;
    protected String food;
    protected String sound;
    static Scanner sc = new Scanner(System.in);
    
    public DongVat(){
        this.name = null;
        this.age = 0;
    }

    public DongVat(String name, int age, String food, String sound) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.sound = sound;
    }
    
    public void nhap() {
        System.out.println("Nhập tên con vật: ");
        name = sc.nextLine();
        
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
      
        System.out.println("Nhập tiếng kêu: ");
        sound = sc.nextLine();
        
        System.out.println("Nhập thức ăn: ");
        food = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public void tiengkeu(){
        System.out.println("Kêu j đó...");
    }
    
    public void thucan(){
        System.out.println("Tôi đang ăn");
    }
    
}
