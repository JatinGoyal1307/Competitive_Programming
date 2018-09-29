import java.util.*;
import java.io.*;
public class cf512b
{
	public static void main(String args[]) throws IOException
	{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int d=in.nextInt();
		int counts[]=new int[n+1];
		int starts[]=new int[n+1];
		int flag=0;
		if(n<=2*d)
		{
			d=n-d;
			flag=1;
		}
		counts[0]=0;
		starts[0]=d;
		for(int i=1;i<=n-d;i++)
		{
			counts[i]=counts[i-1]+2;
			starts[i]=starts[i-1]-1;
					}
		for(int i=n-d+1;i<=d;i++)
		{
			counts[i]=counts[i-1];
			starts[i]=starts[i-1]-1;
			//bw.write(i+" "+starts[i]+" "+counts[i]+" \n");

		}
		for(int i=d+1;i<=n-d;i++)
		{
			counts[i]=counts[i-1];
			starts[i]=starts[i-1]+1;
		}
		for(int i=n-d+1;i<=n;i++)
		{
			counts[i]=counts[i-1]-2;
			starts[i]=starts[i-1]+1;
		}
		int m=in.nextInt();
		for(int i=0;i<m;i++)
		{
			int x=in.nextInt();
			int y=in.nextInt();
			if(flag==1)
			{
				x=n-x;
			}
			if(x<0||x>n)
			{
				bw.write("NO"+"\n");
			}
			else
			{
				//bw.write(starts[x]+"  "+counts[x]+"\n");
				if(y>=starts[x]&&y<=starts[x]+counts[x])
				{
					bw.write("YES"+"\n");
				}
				else
				{
					bw.write("NO"+"\n");
				}
			}
		}
		bw.flush();
	}
}