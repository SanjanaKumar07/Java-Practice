class Excep
  {
    public static void main(String args [])
     {
     
     try
     {
      int i=2;
      int j=0;
      int k=i/j;
      System.out.println("Result=" +k);
      }
       catch(ArithmeticException e)
        {
          System.out.println("Cannot divide by zero");
         }
     }
  }
