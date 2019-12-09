import java.util.*;
 class Distance
 {
 int Dist(int x, int y)
  {
  int  t=x*x+y*y;
    int d=(int)Math.sqrt(t);
    return d;
   }
    
 float Dist(float s, float r)
  {
   float d,t;
   t=(s*s)+(r*r);
   d=(float)Math.sqrt(t);
    return d;
  }

 int Dist(int x1,int x2, int y1,int y2)
  {
  int  t=((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
   int d=(int)Math.sqrt(t);
    return d;
  }

   public static void main(String args [])
    { 
       Distance D = new Distance();
       Scanner sc = new Scanner(System.in);      
       int x=sc.nextInt(); 
       int y=sc.nextInt();
       int x1=sc.nextInt(); 
       int y1=sc.nextInt();
       int x2=sc.nextInt(); 
       int y2=sc.nextInt();
	float s = sc.nextFloat();
        float r = sc.nextFloat();
   int a = D.Dist(x,y);
   float b = D.Dist(s,r);
	int c = D.Dist(x1,x2,y1,y2);
    System.out.println(a);
System.out.println(b);
System.out.println(c);
    }
 }
 
 