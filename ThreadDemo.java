class Mythread1 extends Thread
 {
  public void run()
   {
     for(int i=1;i<10;i++)
	{
	  System.out.print(i);
	  try{ Thread.sleep(1000); } catch(Exception e) {}
	}
    }
 }
class Mythread2 extends Thread
 {
  public void run()
   {
    char ch='A';
     for(int i=1;i<10;i++)
	{
	  System.out.print(ch);
        try{ Thread.sleep(1000); } catch(Exception e) {}
	ch++;  
	} 
    } 
 }
class ThreadDemo
 {
   public static void main(String args [])
    {
     Mythread1 obj1 = new Mythread1();
     Mythread2 obj2 = new Mythread2();
     obj1.start();
     obj2.start();

   }
 }