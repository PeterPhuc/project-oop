package Baitap2;
import java.util.Scanner;

public class CIRCLE {
    protected POINT center;
    protected int r;
    
    public CIRCLE(){
        this.center = null;
        this.r = 0;
    }
    
    public CIRCLE(POINT p, int R){
        this.center = p;
        this.r = R;
    }
    
    public void nhaptoadovabankinh(){
        System.out.println("Nhập tọa độ tâm: ");
        POINT p = new POINT();
        p.nhap();
        center = p;
        
        System.out.println("Nhập bán kính: ");
        r = POINT.sc.nextInt();
    }
    
    public POINT getCenter(){
        return center;
    }
    
    public void setCenter(POINT p){
        this.center = p;    
    }
    
    public int getR(){
        return r;
    }
    
    public void setR(int R){
        this.r = R;
    }
    
    public double getArea(){
        return 3.14*r*r; 
    }
    
    @Override
    public String toString(){
        return "(" + center.getX() + "," + center.getY() + ")" + ", " + r;
    }
}

