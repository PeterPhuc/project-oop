package chuong0;
public class Bai5 {
    private int n; 
    
    public Bai5(){
       System.out.print("Nhập n: ");
       this.n = Testclass.sc.nextInt();
    }
   
    public void setN(int n) {
       this.n = n;
    }

    public int getN() {
       return this.n;
    }
    
    public void Kiemtrasoamduong(){
      if(n<0) System.out.println(n+" la so am");
      else if(n==0) System.out.println(n+" la so 0");
      else System.out.println(n+" la so duong");
    }      
}