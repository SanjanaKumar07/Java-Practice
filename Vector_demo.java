import java.util.*; 
class Vector_demo { 
    public static void main(String[] arg) 
    {  
        Vector v = new Vector(); 
  
        v.add(1); 
        v.add(2); 
        v.add("geeks"); 
        v.add("forGeeks"); 
        v.add(3); 

        v.add(0, 0); 
        v.add(1, 9); 
        v.add(2, "huhu"); 
        v.add(3, "gigi"); 
        v.add(4, 69); 
        System.out.println("Vector is " + v); 
        v.clear(); 
  

        System.out.println("after clearing: " + v);
    } 
}