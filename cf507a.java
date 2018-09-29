import java.util.*;
public class cf507a
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int flag=0;
		int front=0;
		int end=n-1;
		int cost=0;
		while(front<=end)
		{
			if(arr[front]==arr[end]&&arr[front]==2)
			{
				cost+=0;
				int k=2;
				if(front==end)
				{
					k--;
				}
				if(a<b)
				{
					cost+=k*a;
				}
				else
				{
					cost+=k*b;
				}

			}
			else if(arr[front]==arr[end])
			{
				cost+=0;
			}
			else if(arr[front]==0&&arr[end]==2)
			{
				cost+=a;
			}
			else if(arr[front]==1&&arr[end]==2)
			{
				cost+=b;
			}
			else if(arr[end]==0&&arr[front]==2)
			{
				cost+=a;
			}
			else if(arr[end]==1&&arr[front]==2)
			{
				cost+=b;
			}
			else
			{
				flag=1;
			}
			front++;
			end--;
		}
		if(flag==1)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(cost);
		}
	}
}