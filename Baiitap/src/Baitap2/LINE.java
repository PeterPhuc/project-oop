package Baitap2;
import java.lang.Math;
import java.util.Scanner;

public class LINE { 
    private POINT A;
    private POINT B;
    
    public LINE(){
        this.A = null;
        this.B = null;
    }
    public LINE(POINT p1, POINT p2){
        this.A = p1;
        this.B = p2;
    }
    public void nhaptoado(){
       System.out.println("ĐIỂM A: ");
       POINT p1 = new POINT();
       p1.nhap();
       A = p1;
       
       System.out.println("ĐIỂM B: ");
       POINT p2 = new POINT();
       p2.nhap();
       B = p2;
    }
    
    public POINT getA(){
        return A;
    }
    
    public void setA(POINT p){
        this.A = p;
    }
    
    public POINT getB(){
        return B;
    }
    
    public void setB(POINT p){
        this.B = p;
    }
    
    public double distance(){
        int X = this.A.getX() - this.B.getX();
        int Y = this.A.getY() - this.B.getY();
        double kc = Math.sqrt( Math.pow(X,2) + Math.pow(Y,2) );
        return kc;
    }
    
    @Override
    public String toString(){
        return "("+A.getX()+","+A.getY()+")" + "  ,  "+ "("+B.getX()+","+B.getY()+")";
    }
}
