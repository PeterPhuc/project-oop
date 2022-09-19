package chuong0;
import java.util.Scanner; 
import java.lang.Math; 

public class Bai7 {
    private int n; 
    
    public Bai7(){
       System.out.print("Nhập n: ");
       this.n = Testclass.sc.nextInt();
    }
   
    public void setN(int n) {
       this.n = n;
    }

    public int getN() {
       return this.n;
    }
    
    public void CauA(){
       int s=0;
       for(int i=0;i<=n;i++){
          s+=i; 
          System.out.print(i+" ");
       }
       System.out.println("");
       System.out.println(s);
    }
    
    public void CauB(){
       int s=0;
       for(int i=0;i<=n;i+=2){
          System.out.print(i+" ");
          s+=i;
       }
       System.out.println("");
       System.out.println(s);
    }
    
    public void CauC(){
       int s=0;
       for(int i=1;i<=n;i+=2){
          System.out.print(i+" ");
          s+=i;
       }
       System.out.println("");
       System.out.println(s);
    }
    
     
    public boolean ktsnt(int n) { 
       if(n < 2) return false;
       else {
           for(int i=2; i<= Math.sqrt(n) ;i++){
              if(n % i == 0){
                 return false; 
              }
           }
          return true; 
       }
    }
    
    public void CauD(){
       int s=0;
       for(int i=2;i<=n;i++){
          if( this.ktsnt(i) == true){
             System.out.print(i+" ");
             s+=i;
          }
       }
       System.out.println("");
       System.out.println(s);
    }
    
    public void CauE(){
       int count=0;
       for(int i=2;;i++){
          if( ktsnt(i)== true ){
             System.out.print(i+" ");
             count++;
             if(count == n){
                System.out.println("");
                return;
             }
          }
       }
    }
    
}
