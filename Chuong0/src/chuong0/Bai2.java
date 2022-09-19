package chuong0;
import java.util.Scanner; 

public class Bai2 {
   private float cd, cr; 
   
   public Bai2(){
     System.out.print("Nhập cd, cr: ");
     this.cd = Testclass.sc.nextFloat();
     this.cr = Testclass.sc.nextFloat();
   }
  public void setCd(float cd) {
    this.cd = cd;
  }

  public void setCr(float cr) {
    this.cr = cr;
  }

  public float getCd() {
    return this.cd;
  }

  public float getCr() {
    return this.cr;
  }
  
  public float Chuvi(){
     return (cd + cr)*2;
  }
  
  public float Dientich(){
     return cd * cr; 
  }
   
}
