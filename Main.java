import java.util.*;
abstract class Area
 {
  abstract void calc();
 }
   
class Circle extends Area
  {
    void calc()
     {
      Scanner sc = new Scanner(System.in);
     int r=sc.nextInt();
      double5 a=3.14*r*r;
      System.out.println(a);
     }
   }
class Square extends Area
  {
    void calc()
     {
      Scanner sc = new Scanner(System.in);
     int r=sc.nextInt();
      int a=r*r;
      System.out.println(a);
     }
   }
class Rectangle extends Area
  {
    void calc()
     {
      Scanner sc = new Scanner(System.in);
      int r=sc.nextInt();
      int s=sc.nextInt();
      int a=s*r;
      System.out.println(a);
     }
   }
public class Main
  {
   public static void main(String args [])
    {
     Circle C = new Circle();
     Square S = new Square();
     Rectangle R = new Rectangle();
     C.calc();
     S.calc();
     R.calc();
    }
 }