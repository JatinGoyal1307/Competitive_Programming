import java.util.*;
public class cf263b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int count=n;
		if(k==n)
		{
			System.out.println("1 1");
		}
		else if(k>n)
		{
			System.out.println(-1);
		}
		else
		{
		for(int i=0;i<n;i++)
		{
			if(count==k)
			{
				if(i<n-1&&arr[i]==arr[i+1])
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(arr[i]+" "+arr[i]);
					i=n+1;
				}
			}
			else if(count>k)
			{
				count--;
			}
		}
	}
	}
}