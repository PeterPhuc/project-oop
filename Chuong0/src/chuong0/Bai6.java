package chuong0;
import java.util.Scanner; 
import java.lang.Math;
public class Bai6 {
    private int n; 
    
    public Bai6(){
       System.out.print("Nhập n: ");
       this.n = Testclass.sc.nextInt();
    }
   
    public void setN(int n) {
       this.n = n;
    }

    public int getN() {
       return this.n;
    }
    
    public void ktsnt() { 
       if(n < 2) System.out.println(n+" ko la snt");
       else {
           for(int i=2; i<= Math.sqrt(n) ;i++){
              if(n % i == 0){
                 System.out.println(n+" ko la snt");
                 return; 
              }
           }
          System.out.println(n+" la snt");  
       }
    }
    
}
