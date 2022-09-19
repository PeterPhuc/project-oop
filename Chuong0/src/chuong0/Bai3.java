package chuong0;
import java.util.Scanner; 

public class Bai3 {
   private double r; 
   
   public Bai3(){
     System.out.print("Nhập bán kính hình tròn: ");
     this.r = Testclass.sc.nextDouble();
   }
  public void setR(double r) {
    this.r = r;
  }

  public double getR() {
    return this.r;
  }
  
  public double Chuvihinhtron(){
     return 2*3.14*r; 
  }
  
  public double Dientichhinhtron(){
     return 3.14*r*r; 
  }
}