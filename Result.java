//nai aaya :(
import java.util.*;
class Student
 {
  int rollno;
  Scanner sc = new Scanner(System.in);
  void get()
   {
  rollno = sc.nextInt(); }
 }
class Test extends Student
 {
  int sem1,sem2;
void pa()
   {
   sem1 = sc.nextInt();
   sem2 = sc.nextInt();
 } }
interface Sports
 {
  int score = 15;
 }
class Result extends Test implements Sports
 {
  int total;
void sa()
   {
   total = sem1+sem2+score;
 } 
void display()
{
System.out.println(total);
}
 

public static void main(String args[])
  {
    Result r = new Result();
    r.get();
    r.pa();
    r.sa();
    r.display();
   }
  }
 
