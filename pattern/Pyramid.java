package pattern;

public class Pyramid {

	public static void main(String[] args) {
		
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n+i-1);j++) //totel =n+i-1
			{
				if(j<=(n-i)) //n-i for spaces
					System.out.print("  "); 
				else //2i-1 for stars
					System.out.print("* ");
			}
			System.out.println();
		}

	}

}
