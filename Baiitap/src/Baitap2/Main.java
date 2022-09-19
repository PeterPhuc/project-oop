package Baitap2;

public class Main {
    public static void main(String[] agrs){
    System.out.println("--------------------------POINT--------------------------");
        POINT p1 = new POINT();
        POINT p2 = new POINT();
        System.out.println("Nhập điểm 1: ");
        p1.nhap();
        System.out.println("Nhập điểm 2: ");
        p2.nhap();
        System.out.println("Điểm 1: " + p1);
        System.out.println("Điểm 2: " + p2);
        System.out.println("Khoảng cách giữa hai điểm: " + p1.distance(p2));
    
 
    System.out.println("--------------------------LINE--------------------------");
        LINE line = new LINE();
        line.nhaptoado();
        System.out.println("Tọa độ 2 điểm lần lượt là: " + line);
        System.out.println("Khoảng cách giữa hai điểm trên đường thẳng: " + line.distance());
        
        
    System.out.println("--------------------------CIRCLE--------------------------");
        CIRCLE c = new CIRCLE();
        c.nhaptoadovabankinh();
        System.out.println("Tọa độ tâm và bán kính: " + c);
        System.out.println("Diện tích hình tròn: " + c.getArea());
        
    
    System.out.println("--------------------------CYLINDER--------------------------");
        CYLINDER cylinder = new CYLINDER();
        cylinder.nhaptoadovabankinh();
        cylinder.nhapchieucao();
        System.out.println("Tọa độ tâm, bán kính, chiều cao hình trụ: " + cylinder);
        System.out.println("Diện tích toàn phần hình trụ tròn: " + cylinder.getArea());
        System.out.println("Thể tích hình trụ: " + cylinder.getVolume());
    }
}
