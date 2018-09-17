import java.util.*;
public class cf1041d
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long h=in.nextLong();
		long curr=h;
		long dist=0;
		long prev=0;
		long co[][]=new long[n+1][2];
		for(int i=0;i<n;i++)
		{
			co[i][0]=in.nextLong();
			co[i][1]=in.nextLong();
		}
		co[n][0]=co[n-1][0]+h+1;
		co[n][1]=co[n][0];
		long distsofar=0;
		int mark=0;
		long max=h;
		distsofar=co[0][1]-co[0][0];
		prev=co[0][1];
		for(int i=1;i<n;i++)
		{
			long a=co[i][0];
			long b=co[i][1];
			prev=co[i-1][1];
			if(curr<=a-prev&&mark<n)
			{
				if(max<distsofar+curr)
				{
					max=distsofar+curr;
				}
				while(curr<=a-prev)
				{
					curr+=co[mark+1][0]-co[mark][1];
					distsofar-=co[mark+1][0]-co[mark][0];
					mark++;
				}
				distsofar+=a-prev;
				distsofar+=b-a;
				curr-=a-prev;
				if(distsofar>max)
				{
					max=distsofar;
				}
			}
			else
			{
				distsofar+=a-prev;
				distsofar+=b-a;
				curr-=a-prev;
				if(distsofar>max)
				{
					max=distsofar;
				}
			}
		}
		if(curr>0)
		{
			distsofar+=curr;
		}
		if(distsofar>max)
		{
			max=distsofar;
		}
		System.out.println(max);
	}
}