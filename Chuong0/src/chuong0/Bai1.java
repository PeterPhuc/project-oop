package chuong0;
import java.util.Scanner;

public class Bai1 {
  private int a, b;

  public Bai1(){
     System.out.print("Nhập a, b: ");
     this.a = Testclass.sc.nextInt();
     this.b = Testclass.sc.nextInt();
  }

  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getA() {
    return this.a;
  }

  public int getB() {
    return this.b;
  }

  public int tong() {
    return a + b;
  }

  public int hieu() {
    return a - b;
  }

  public int tich() {
    return a * b;
  }

  public float thuong() {
    return (float) a / b;
  }
}
