import java.util.*;
public class cf587a
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		//int w[]=new int[n];
		int count[]=new int[1000002];
		int k;
		for(int i=0;i<n;i++)
		{
			k=in.nextInt();
			count[k]++;
		}
		int fi=0;
		for(int i=0;i<1000001;i++)
		{
			if(count[i]>=2)
			{
				int h=count[i]/2;
				count[i]=count[i]%2;
				if(i<1000001)
				{
					count[i+1]+=h;
				}	
			}
			if(count[i]==1)
			{
				fi++;
			}
		}
		if(count[1000001]>0&&count[1000001]%2!=0)
		{
			fi=fi+2;
		}
		else if(count[1000001]>0)
		{
			fi++;
		}
		System.out.println(fi);
	}
}