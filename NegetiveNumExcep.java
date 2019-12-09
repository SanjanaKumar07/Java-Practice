import java.util.*;
class NegetiveNumExcep extends Exception
  {
   public static void main(String args [])
    {
     try
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n>0)
         {
          int fact=1;
  	  for(int i=1;i<n;i++)
	   {
            fact= fact*i;
	   }
	System.out.println(fact);
         }
         else if (n<0)
          {
            throw new NegetiveNumExcep();
           }
       }
   catch(NegetiveNumExcep n)
    {
      System.out.println("no");
    }
  }
 }


   