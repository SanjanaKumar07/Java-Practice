import java.util.*;
class NoMatchException extends Exception
  {
   public static void main(String args [])
    {
     try
      {
       String s = new String();
      
       Scanner input= new Scanner(System.in);
       System.out.println("Enter a string");
       String st=input.nextLine();
       if(st.equals("INDIA"))
        {
 	  System.out.println("Match");
        }
        else 
	{
	 throw new NoMatchException() ;
	}
      }
  catch(NoMatchException n)
   {
     System.out.println("No");     
   }
  }
}
         
     
       
     