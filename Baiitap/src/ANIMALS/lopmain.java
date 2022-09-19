/*package ANIMALS;
import java.util.Random;
import java.util.Scanner;

public class lopmain {
    public static void main(String[] agrs){
        giasuc bo = new Bo();
        giasuc cuu = new Cuu();
        giasuc de = new De();
        System.out.println("Tiếng kêu của gia súc khi đói: ");
        System.out.println("- Bò: ");
        bo.TiengKeu();
        System.out.println("- Cừu: ");
        cuu.TiengKeu();
        System.out.println("- Dê: ");
        de.TiengKeu();
        
        System.out.println("Nhập số lượng gia súc: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        giasuc []a = new giasuc[n];
        
        for(int i = 0 ; i < n ; i++){
            int luachon;
            do {
                System.out.println("----------------------NHẬP LOẠI GIA SÚC----------------------");
                System.out.println("1.BÒ: ");
                System.out.println("2.CỪU: ");
                System.out.println("3.DÊ: ");
                luachon = sc.nextInt();
                
                switch(luachon){
                    case 1:
                        a[i] = new Bo();
                        break;
                    case 2:
                        a[i] = new Cuu();
                        break;
                    case 3:
                        a[i] = new De();
                        break;
                    default:
                        System.out.println("Nhập sai dữ liệu, hãy nhập lại!!!");
                }
            }while((luachon < 1) && (luachon > 3)  );
        }
        
        for(int i = 0 ; i < n ; i++){

        }
        
    }
}*/
