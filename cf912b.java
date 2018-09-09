import java.util.*;
public class cf912b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long k=in.nextLong();
		int a[]=new int[100];
		int count=0;
		long temp=n;
		while(temp>0)
		{
			int r=(int)(temp%2);
			a[count]=r;
			count++;
			temp=temp/2;
		}
		int ind=count;
		long po=1;
		for(int i=0;i<ind;i++)
		{
			po=po*2;
		}
		long ans=0;
		ans=po-1;
		/*long tem=k;
		for(int i=ind-1;i>=0;i--)
		{
			if(k>0)
			{
				ans+=po;
				po=po/2;
				k--;
			}
		}*/
		if(k==1)
		{
			ans=n;
		}
		System.out.println(ans);
	}
}