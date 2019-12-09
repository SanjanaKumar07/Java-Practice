import java.util.*;
class Calc
 {
   public static void main(String args [])
    { 
       Scanner sc = new Scanner(System.in);      
       int m=sc.nextInt(); 
       int n=sc.nextInt();
       int ch=sc.nextInt();
       int c;
       switch(ch)
        {
         case 1: c=m+n;
                 System.out.println(c);
			
 	 case 2: c=m-n;
                 System.out.println(c);
 	 case 3: c=m*n;
                 System.out.println(c);
 	 case 4: c=m/n;
                 System.out.println(c);
  	}
   }
}