class Student
 {
  void get()
   {
  Scanner sc = new Scanner(System.in);
  int rollno = sc.nextInt(); }
 }
class Test extends Student
 {
void pa()
   {
  int sem1 = sc.nextInt();
  int sem2 = sc.nextInt();
 } }
interface Sports
 {
  int score = 15;
 }
class Result extends Test implements Sports
 {
void sa()
   {
  int total = sem1+sem2+score;
 } }
public static void main(String args[])
  {
    Result r = new Result();
    r.get();
    r.pa();
    r.sa();
  }
 
