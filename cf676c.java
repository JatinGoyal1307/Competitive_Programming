import java.io.*;
public class cf676c
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String arr[]=new String[2];
		arr=str.split(" ");
		int n=Integer.parseInt(arr[0]);
		int k=Integer.parseInt(arr[1]);
		int maxa=0;
		int sum=0;
		int maxb=0;
		int queue[]=new int[n];
		int end=0;
		int front=0;
		str=br.readLine();
		char ch[]=str.toCharArray();
		for(int i=1;i<=n;i++)
		{
			if(ch[i-1]=='a')
			{
				sum++;
			}
			else
			{
				if(end-front==k&&k!=0)
				{
					sum=i-queue[front];
					front++;
					queue[end]=i;
					end++;
				}
				else if(k!=0)
				{
					queue[end]=i;
					end++;
					sum++;
				}
				else
				{
					sum=0;
				}
			}
			if(maxa<sum)
			{
				maxa=sum;
			}
		}
		front=0;
		end=0;
		sum=0;
		for(int i=1;i<=n;i++)
		{
			if(ch[i-1]=='b')
			{
				sum++;
			}
			else
			{
				if(end-front==k&&k!=0)
				{
					sum=i-queue[front];
					queue[end]=i;
					end++;
					front++;
				}
				else if(k!=0)
				{
					queue[end]=i;
					end++;
					sum++;
				}
				else
				{
					sum=0;
				}
			}
			if(maxb<sum)
			{
				maxb=sum;
			}
		}
		if(maxa>maxb)
		{
			System.out.println(maxa);
		}
		else
		{
			System.out.println(maxb);
		}

	}
}