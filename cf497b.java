import java.util.*;
public class cf497b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int rects[][]=new int[n][2];
		int flag=1;
		for(int i=0;i<n;i++)
		{
			rects[i][0]=in.nextInt();
			rects[i][1]=in.nextInt();
		}
		int curr=rects[0][1];
		if(curr<rects[0][0])
		{
			curr=rects[0][0];
		}
		for(int i=1;i<n;i++)
		{
			if(rects[i][1]>curr&&rects[i][0]>curr)
			{
				i=n+1;
				flag=0;
				curr=-1;
			}
			else if(rects[i][1]>curr&&rects[i][0]<=curr)
			{
				curr=rects[i][0];
			}
			else if(rects[i][1]<=curr&&rects[i][0]>curr)
			{
				curr=rects[i][1];
			}
			else if(rects[i][1]>rects[i][0])
			{
				curr=rects[i][1];
			}
			else
			{
				curr=rects[i][0];
			}
		}
		if(curr==-1)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}