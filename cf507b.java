import java.util.*;
public class cf507b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int bestarr[]=new int[n];
		int mincount=n;
		if(n<=k)
		{
			System.out.println(1);
			System.out.println(1);
		}
		else if(k==0)
		{
			System.out.println(n);
			for(int i=1;i<=n;i++)
			{
				System.out.print(i+" ");
			}
		}
		else
		{
			for(int start=0;start<=k;start++)
			{
				int i=start;
				int arr[]=new int[n];
				int count=0;
				while(i<n)
				{
					arr[count]=i;
					count++;
					i=i+k;
					if(i<n-1&&(i+k+1)>=n)
					{
						count=n+1;
						i=n+1;
					}
					i+=k+1;
				}
				if(count<mincount)
				{
					mincount=count;
					for(int j=0;j<mincount;j++)
					{
						bestarr[j]=arr[j];
					}
				}
			}
			System.out.println(mincount);
			for(int j=0;j<mincount;j++)
			{
				System.out.print((bestarr[j]+1)+" ");
			}
			System.out.println();
		}
	}
}