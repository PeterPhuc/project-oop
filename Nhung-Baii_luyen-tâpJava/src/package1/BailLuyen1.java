package package1;

import java.util.Scanner;

public class BailLuyen1 { 
    public static Scanner sc = new Scanner(System.in);  //Để Scanner này ở ngoài main cho các class khác dùng chung
    
    public static int DeQuy(int n){
        if(n==1){
            return 1;
        }
        return DeQuy(n-1) + n;
    }
    
    public static void main(String[] args) {
        //Tìm số lớn thứ nhì
        System.out.println("Nhập số lượng phần tử n: ");
        int n;
        n = CheckLoiNhapVao.CheckNhapSoNguyen();
        while(n <= 0){
            System.out.print("Số lượng phải > 0!!! Vui lòng nhập lại: ");
            n = CheckLoiNhapVao.CheckNhapSoNguyen();
        }
       
        int []a = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Nhập phần tử a["+i+"]= ");
            a[i] = CheckLoiNhapVao.CheckNhapSoNguyen();
        }
        
        for(int i = 0; i<n; i++){
            System.out.print(a[i] + " ");
        }
 
        int max = a[0];
        int maxnhi = max;
        
        for(int i = 1; i < n; i++){
            if(max < a[i]){
                maxnhi = max;
                max = a[i];
            }
            //+ Nếu max < a[i] thì gán maxnhi = max, max = a[i] và continue vòng lặp
            //+ Nếu max >= a[i]:
            //    + Nếu max == a[i] thì ko gán a[i] cho maxnhi
            //    + Nếu max > a[i]:
            //         + Nếu maxnhi < a[i] thì maxnhi = a[i]
            //         + Ngược lại thì không
            
            
            else if((maxnhi < a[i]) && (a[i] < max)){
                maxnhi = a[i];
            }
        }
        
        System.out.println("Số lớn nhất: "+max);
        System.out.println("Số lớn nhì: "+maxnhi);
        
        System.out.println("Kết quả đệ quy: " + BailLuyen1.DeQuy(10));
    }
}
