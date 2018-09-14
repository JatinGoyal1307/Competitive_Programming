import java.util.*;
public class cf596a
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x[]=new int[n];
		int y[]=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=in.nextInt();
			y[i]=in.nextInt();
		}
		if(n==1)
		{
			System.out.println(-1);
		}
		else if(n==2)
		{
			if(x[0]!=x[1]&&y[0]!=y[1])
			{
				int area=(x[1]-x[0]);
				if(area<0)
				{
					area*=-1;
				}
				area*=(y[1]-y[0]);
				if(area<0)
				{
					area*=-1;
				}
				System.out.println(area);
			}
			else
			{
				System.out.println(-1);
			}
		}
		else
		{
			int xdiff=0;
			int ydiff=0;
			Arrays.sort(x);
			Arrays.sort(y);
			for(int i=1;i<n;i++)
			{
				if(y[i]-y[i-1]>ydiff)
				{
					ydiff=y[i]-y[i-1];
				}
				if(x[i]-x[i-1]>xdiff)
				{
					xdiff=x[i]-x[i-1];
				}
			}
			int area=xdiff*ydiff;
			System.out.println(area);
		}
	}
}