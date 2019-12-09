
import java.util.*;

class Bank
{
   Scanner sc = new Scanner(System.in);
   int bal;
  
 public void initial()
  { 
        int an=sc.nextInt(); 
       bal=sc.nextInt();
       int t=sc.nextInt();
       String n=sc.next();      
       System.out.println(" " +n +an +t +bal);
  }
  public void deposit()
   {
   
    int d=sc.nextInt();
     bal= bal +d;
      System.out.println(bal);
   }
 public void withdraw()
   {
   
    int w=sc.nextInt();
   bal= bal -w;
       System.out.println(bal);
   }
    public static void main(String args [])
    { 
       Scanner sc = new Scanner(System.in);
         
       Bank b = new Bank();
       b.initial();
       b.deposit();
       b.withdraw();
       
    }
 }