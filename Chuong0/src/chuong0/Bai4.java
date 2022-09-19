package chuong0;
import java.util.Scanner;

public class Bai4 {
    private int n; 
    
    public Bai4(){
       System.out.print("Nhập n: ");
       this.n = Testclass.sc.nextInt();
    }
   
    public void setN(int n) {
       this.n = n;
    }

    public int getN() {
       return this.n;
    }
    
    public void Kiemtra(){
      if(n%2==0) System.out.println(n+" la so chan");
      else System.out.println(n+" la so le");
    }
   
}
