import java.util.*;
public class cf761b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int l=in.nextInt();
		int sasha[]=new int[n];
		for(int i=0;i<n;i++)
		{
			sasha[i]=in.nextInt();
		}
		int kefa[]=new int[n];
		for(int i=0;i<n;i++)
		{
			kefa[i]=in.nextInt();
		}
		int dist1[]=new int[n];
		int dist2[]=new int[n];
		for(int i=1;i<n;i++)
		{
			dist1[i-1]=sasha[i]-sasha[i-1];
			dist2[i-1]=kefa[i]-kefa[i-1];
		}
		dist1[n-1]=l-(sasha[n-1]-sasha[0]);
		dist2[n-1]=l-(kefa[n-1]-kefa[0]);
		int dist[]=new int[2*n];
		for(int i=0;i<n;i++)
		{
			dist[i]=dist1[i];
			dist[n+i]=dist1[i];
		}
		int lcs[][]=new int[2*n][n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			int len=0;
			for(int j=0;j<n;j++)
			{
				if(dist[i+j]==dist2[j])
				{
					len++;
				}
				else
				{
					len=0;
				}
			}
			if(len>max)
			{
				max=len;
			}
		}
		if(max==n)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}
}