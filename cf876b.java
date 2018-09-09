import java.util.*;
public class cf876b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int m=in.nextInt();
		int a[]=new int[n];
		int mod_arr[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			mod_arr[a[i]%m]++;
		}
		int flag=0;
		int mod_val=-1;
		for(int i=0;i<m;i++)
		{
			if(mod_arr[i]>=k)
			{
				flag=1;
				mod_val=i;
				i=m+1;
			}
		}
		if(flag==0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
			int count=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]%m==mod_val)
				{
					System.out.print(a[i]+" ");
					count++;
				}
				if(count>=k)
				{
					i=n+1;
				}
			}
			System.out.println();
		}
	}
}