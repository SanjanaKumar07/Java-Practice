
import java.util.*;
class Matrix 
 {
   public static void main(String args [])
    {  int i,j,k;
        int  [] [] a=new int[10] [10];
	int  [] [] b=new int[10] [10];
	int  [] [] c=new int[10] [10];
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
	int m=sc.nextInt();
        for(i=0;i<n;i++)
	 {
	   for(j=0;j<m;j++)
   	    {
      		a[i][j]=sc.nextInt();
	     }
 	}
   
for( i=0;i<n;i++)
	 {
	   for( j=0;j<m;j++)
   	    {
      		b[i][j]=sc.nextInt();
	     }
 	}
for( i=0;i<n;i++)
	 {
	   for( j=0;j<m;j++)
   	    {
             c[i][j]=0;
               for( k=0;k<n;k++)
  		{
      		c[i][j]+=a[i][k]*b[k][j];
	        }
           }
 	}
for(i=0;i<n;i++)
	 {
	   for(j=0;j<m;j++)
   	    {
      		      System.out.println(" "+c[i][j]);
	     }
 	}

    }
}



