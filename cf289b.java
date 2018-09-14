import java.util.*;
public class cf289b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int d=in.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		int modvalue=arr[0][0]%d;
		int flag=0;
		int values[]=new int[20000];
		int max=0;
		int min=100000;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]%d!=modvalue)
				{
					flag=1;
				}
				values[arr[i][j]+1]++;
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
				if(min>arr[i][j])
				{
					min=arr[i][j];
				}
			}
		}
		if(flag==1)
		{
			System.out.println(-1);
		}
		else
		{
			long forward[]=new long[max+2];
			long backward[]=new long[max+2];
			int count=0;
			for(int i=min+1;i<=max+1;i=i+d)
			{
				forward[i]=(long)count;
				if(i!=min+1)
				{
					forward[i]+=forward[i-d];
				}
				count+=values[i];
			}
			/*for(int i=0;i<=max+1;i++)
			{
				System.out.print(forward[i]+ "  ");
			}
			System.out.println();*/
			int count2=0;
			for(int i=max+1;i>min;i=i-d)
			{
				backward[i]=(long)count2;
				if(i!=max+1)
				{
					backward[i]+=backward[i+d];
				}
				count2+=values[i];
			}
			/*for(int i=0;i<=max+1;i++)
			{
				System.out.print(backward[i]+"  ");
			}*/
			//System.out.println();
			long minsteps=1000000000;
			for(int i=min+1;i<=max+1;i=i+d)
			{
				if(forward[i]+backward[i]<minsteps)
				{
					minsteps=(forward[i]+backward[i]);
				}
			}
			System.out.println(minsteps);

		}
	}
}