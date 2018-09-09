import java.util.*;
public class cf467c
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int k=s.nextInt();
		long a[]=new long[n];
		long sum[]=new long[n];
		sum[0]=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextLong();
			if(i>0)
			{
				sum[i]=sum[i-1];
			}
			sum[i]+=a[i];
		}
		long prev[]=new long[n];
		long th[]=new long[n];
		prev[m-1]=sum[m-1];
		for(int i=m;i<n;i++)
		{
			if(sum[i]-sum[i-m]>prev[i-1])
			{
				prev[i]=sum[i]-sum[i-m];
			}
			else
			{
				prev[i]=prev[i-1];
			}
		}
		for(int j=1;j<k;j++)
		{
			th[(j+1)*m-1]=sum[(j+1)*m-1]-sum[j*m-1];
			if(j*m>=1)
			{
				th[(j+1)*m-1]+=prev[(j*m)-1];
			}
			for(int i=(j+1)*m;i<n;i++)
			{
				th[i]=sum[i]-sum[i-m]+prev[i-m];
			}
			for(int i=0;i<n;i++)
			{
				if(i>0&&prev[i-1]>th[i])
				{
					prev[i]=prev[i-1];
				}
				else
				{
					prev[i]=th[i];
				}
			}
		}
		long max=0;
		for(int i=0;i<n;i++)
		{
			if(prev[i]>max)
			{
				max=prev[i];
			}
		}
		System.out.println(max);

		
	}
}