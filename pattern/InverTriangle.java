package pattern;

public class InverTriangle {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=n;i>=n;i--)
		{
			for(int j=1;j<=n;j++)
			{
				int space=i-j;
				//if((i-j)<1) System.out.print("* ");
				//else System.out.print("  ");
				if(space>0)
					System.out.print("  ");
				else
					System.out.print("* ");	
			}
			System.out.println();
		}

	}

}
