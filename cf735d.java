import java.io.*;
public class cf735d
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long n=Long.parseLong(br.readLine());
		int sq=(int)(Math.sqrt(n));
		int flag=0;
		for(int i=2;i<=sq;i+=1)
		{
			if(n%i==0)
			{
				flag=1;
				i=sq+2;
			}
		}
		if(flag==0)
		{
			System.out.println(1);
		}
		else if(n%2==0)
		{
			System.out.println(2);
		}
		else
		{
			n=n-2;
			flag=0;
			for(int i=2;i<=sq;i++)
			{
				if(n%i==0)
				{
					flag=1;
					i=sq+2;
				}
			}
			if(flag==0)
			{
				System.out.println(2);
			}
			else
			{
				System.out.println(3);	
			}
			
		}
	}
}