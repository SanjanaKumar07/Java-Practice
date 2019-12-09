import java.util.*;
class Grade
 {
   public static void main(String args [])
    { 
       Scanner sc = new Scanner(System.in);      
     int m=sc.nextInt();
     int c=sc.nextInt();
     int p=sc.nextInt();
     int t=m+c+p;
     int perc=t/3;
     if(perc<=60)
       {
        System.out.println("fail");
       }  
      if(perc>=61 && perc<=70)
       {
        System.out.println("cool");
       }
     if(perc>=71 && perc<=80)
       {
        System.out.println("um");
       }
     if(perc>=81 && perc<=100)
       {
        System.out.println("wow");
       }
  }
}
