import java.util.*;
class Reverse
 {
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
 
  String s = sc.next();
   
   char[] n = s.toCharArray();
   for(int i=s.length()-1;i>=0;i--)
    {
      System.out.print(n[i]);
     }
  }
}
   