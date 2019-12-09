import java.util.*;
class Bank1
 {String N,T;
    int AN,B;
    Scanner input =new Scanner(System.in);
   void o()
   {
    
    System.out.println("Enter the name of depositer, account number & type and balance");
    N= input.next();
    AN= input.nextInt();
    T= input.next();
    B= input.nextInt();
   System.out.println("Name Act Type Balance \n" +N +" " +AN +" " +T +" " +B);
   }
   
  void deposit()
   {
     int D;
     System.out.println("Enter amount to be deposited");
     D= input.nextInt();
     B=B+D;
     System.out.println("Balance now" +B);
   }
   
  void withdraw()
   {
    int W;
    System.out.println("Amount to be withdrawn");
    W= input.nextInt();
    B=B-W;
    System.out.println("Balance now" +B);
   }
  
 public static void main(String args[])
  {
    int ch;
    Scanner input =new Scanner(System.in);
    Bank s = new Bank();
    System.out.println("1.open 2.deposit 3.withdraw");
    ch=input.nextInt();

    switch(ch)
   {
    case 1 : s.o();
             break;
    case 2 : s.deposit();
             break;
    case 3 : s.withdraw();
             break;
   }
  }
 }
    
  