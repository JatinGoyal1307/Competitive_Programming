import java.util.*;
public class cf239a
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		int k=s.nextInt();
		int n=s.nextInt();
		int flag=1;
		int sum=n-y;
		int j=1;
		for(int i=1;i<=sum;i=i+j)
		{
			if(flag==0)
			{
				System.out.print(i+" ");
			}
			else if((i+y)%k==0)
			{
				flag=0;
				j=k;
				System.out.print(i+" ");
			}
		}
		if(flag==1)
		{
			System.out.print("-1");
		}

	}
}