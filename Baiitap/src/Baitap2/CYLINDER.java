package Baitap2;

public class CYLINDER extends CIRCLE {
    private int height;
    
    public CYLINDER(){
        super();
        this.height = 0;
    }
    
    public CYLINDER(POINT p, int R, int height){
        super(p,R);
        this.height = height;
    } 
    
    public void nhapchieucao (){
        System.out.println("Nhập chiều cao hình trụ: ");
        height = POINT.sc.nextInt();
    }
    
    public int getHeight(){
        return height;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return 2*3.14*r*(r + height);
    }

    public double getVolume(){
        return 3.14*r*r*height;
    }
    
    @Override
    public String toString(){
        //return "(" + center.getX() + "," + center.getY() + ")" + "---" + r + "---" + height;
        return super.toString() + ", " + height;
    }
}
