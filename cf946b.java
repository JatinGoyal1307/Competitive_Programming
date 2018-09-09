import java.util.*;
public class cf946b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long m=in.nextLong();
		long a=n;
		long b=m;
		int flag=0;
		while(a>0&&b>0&&flag==0)
		{
			if(a>=(2*b))
			{
				a=a%(2*b);
			}
			else if(b>=(2*a))
			{
				b=b%(2*a);
			}
			else
			{
				flag=1;
			}
		}
		System.out.println(a+" "+b);
	}
}