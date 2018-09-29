import java.util.*;
import java.io.*;
public class cf503b
{
	public static void main(String args[])throws IOException
	{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int flag=0;
			int visited[]=new int[n];
			visited[i]=1;
			int present=i;
			while(flag==0)
			{
				int next=arr[present];
				present=next-1;
				if(visited[present]==1)
				{
					flag=1;
				}
				else
				{
					visited[present]=1;
				}
				
			}
			bw.write((present+1)+" ");
		}
		bw.write("\n");
		bw.flush();
	}
	
}