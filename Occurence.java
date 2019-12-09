import java.util.*;
class Occurence
 {
 
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   char a=sc.next().charAt(0);
   String s = sc.next();
   Occurence o = new Occurence();
   o.count(s,a);
  }
 public void count(String s, char a)
   {
    int res=0;
    for(int i=0;i<s.length();i++)
     {
      if(s.charAt(i)==a)
       {
         res++;
       }
     }
   System.out.println(res);
 }
}
