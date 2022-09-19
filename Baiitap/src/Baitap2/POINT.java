package Baitap2;
import java.lang.Math;
import java.util.Scanner;

public class POINT {
    private int x;
    private int y;
    public static Scanner sc = new Scanner(System.in);
    
    public POINT(){
       this.x = 0;
       this.y = 0;
    }
    
    public POINT(int X, int Y){
       this.x = X;
       this.y = Y;
    }
    
    public void nhap(){
       System.out.print("Nhập tọa độ x: ");
       x = sc.nextInt();
       System.out.print("Nhập tọa độ y: ");
       y = sc.nextInt();
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int X){
        this.x = X;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int Y){
        this.y = Y;
    }
    
    public double distance(POINT p){
        double kc = Math.sqrt( Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2) );
        return kc;
    }
    
    @Override
    public String toString(){
        return "(" + this.x + " , " + this.y + ")";
    }
}
