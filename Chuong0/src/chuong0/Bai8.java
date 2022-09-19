package chuong0;
import java.util.Scanner;
import java.lang.Math;

public class Bai8 {

   public static void nhapmang(int a[],int n){
      System.out.println("Nhập mảng: ");
      for(int i=0;i<n;i++){
         a[i] = Testclass.sc.nextInt();
      }
   }
   
   public static void xuatmang(int a[],int n){
      for(int i=0;i<n;i++){
         System.out.print(a[i]+" ");
      }
   }
   
   public static void CauA(int a[],int n){
      int s=0;
      for(int i=0;i<n;i++){
         System.out.print(a[i]+" ");
         s+=a[i];
      }
      System.out.println("");
      System.out.println(s);
   }
   
   public static void CauB(int a[],int n){
      int s=0;
      for(int i=0;i<n;i++){
         if(a[i] % 2 == 0){
            System.out.print(a[i]+" ");
            s+=a[i];
         }
      }
      
      System.out.println("");
      System.out.println(s);
   }
   
   public static void CauC(int a[],int n){
      int s=0;
      for(int i=0;i<n;i++){
         if(a[i] % 2 != 0){
            System.out.print(a[i]+" ");
            s+=a[i];
         }
      }
      System.out.println("");
      System.out.println(s);
   }
   
    
    public static boolean ktsnt(int x) { 
       if(x < 2) return false;
       else {
           for(int i=2; i<= Math.sqrt(x) ;i++){
              if(x % i == 0){
                 return false; 
              }
           }
          return true; 
       }
    }
   
    public static void CauD(int a[],int n){
      int s=0;
      for(int i=0;i<n;i++){
         if( ktsnt(a[i]) == true ){ 
            System.out.print(a[i]+" ");
            s+=a[i];
         }
      }
      System.out.println("");
      System.out.println(s);
   }
   
   public static void CauE(int a[],int n){
      System.out.print("Nhập giá trị thêm: ");
      int gtt = Testclass.sc.nextInt();
      a[n] = gtt; 
   }
   
   public static void CauF(int a[],int n){
      System.out.print("Nhập vị trí xoá k: ");
      int k = Testclass.sc.nextInt();
      for(int i=k+1 ;i<n; i++){
         a[i-1] = a[i];
      }
   }
   
   public static int CauG(int a[],int n){
      System.out.print("Nhập số x: ");
      int x = Testclass.sc.nextInt();
      
      for(int i=0;i<n;i++){
         if( a[i] == x ){
            return i; 
         }
      }
      return -1;
   }  
}