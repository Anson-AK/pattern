package pattern;

public class PrimeFactorization {

	 static boolean isprime(int n)
	{
		if(n==2||n==3) return true;
		if(n%2==0||n%3==0) return false;
		
		for(int i=5;i*i<=n;i+=6)
		{
			if(n%i==0||n%(i+2)==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
       for(int i=2;i<=n;i++)
       {
    	   if(isprime(i)==true)
           {
    		   int x=i;
        	while(n%x==0)
        	{
        		System.out.print(i+" ");
        		x=x*i;
        	}
           }
       }
       
       System.out.println("ans"+ args.length+5);
       int a=10;
       float b=12.23f;
       double d=30.234222;
       long l=1200000;
       System.out.println(a+b+(d*l));
       
	}

}
