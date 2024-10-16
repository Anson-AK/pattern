package pattern;

public class InvertTriangleOutline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=10;
           for(int i=n;i>=0;i--)
           {
        	   for(int j=1;j<=n;j++)
        	   {
        		   if((i==j)||(i==0)||(j==n))
        			   System.out.print("* ");
        		   else
        			   System.out.print("  ");   
        			   
        	   }
        	   System.out.println();
           }
	}

}
