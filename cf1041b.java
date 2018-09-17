import java.util.*;
public class cf1041b
{
	static long gcd(long a, long b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		long a=in.nextLong();
		long b=in.nextLong();
		long x=in.nextLong();
		long y=in.nextLong();
		long gc;
		if(x>y)
		{
			gc=gcd(x,y);
		}
		else
		{
			gc=gcd(y,x);
		}
		long starta=x/gc;
		long startb=y/gc;
		long var1=a/starta;
		long var2=b/startb;
		if(var1>var2)
		{
			System.out.println(var2);
		}
		else
		{
			System.out.println(var1);
		}

	}
}