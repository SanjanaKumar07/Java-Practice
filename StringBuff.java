import java.util.*;
class StringBuff
 {
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   String str = sc.next();
   StringBuffer s = new StringBuffer(str);
   StringBuffer a =  s.reverse();
      System.out.print(a);
     }
  }

   