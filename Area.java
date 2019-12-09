import java.util.*;
 class Area
 {
 
 Area(int x, int y)
  {
    int d=x*y;
     System.out.println(d);
   }
    
Area()
  {
   Scanner sc = new Scanner(System.in); 
   int r = sc.nextInt();
   double d=3.14*r*r;
     System.out.println(d);
  }

 Area(int x1)
  {
 
   int d=x1*x1;
    System.out.println(d);
  }

   public static void main(String args [])
    { 
       Scanner sc = new Scanner(System.in);      
       
  Area a = new Area(5,10);
         Area b = new Area();
	 
	 Area c= new Area(20);
       
      

    }
 }