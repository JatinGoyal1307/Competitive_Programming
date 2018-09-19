import java.io.*;
public class cf960a
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int counta=0;
		int countb=0;
		int countc=0;
		int a_start=0;
		int b_start=0;
		int c_start=0;
		int n=str.length();
		char ch[]=str.toCharArray();
		for(int i=0;i<n;i++)
		{
			if(ch[i]=='a')
			{
				counta++;
			}
			else
			{
				b_start=i;
				i=n+1;
			}
		}
		for(int i=b_start;i<n;i++)
		{
			if(ch[i]=='b')
			{
				countb++;
			}
			else
			{
				c_start=i;
				i=n+1;
			}
		}
		for(int i=c_start;i<n;i++)
		{
			if(ch[i]=='c')
			{
				countc++;
			}
		}
		if(counta>0&&countb>0)
		{
			if(countc==counta||countc==countb)
			{
				if(b_start==counta&&c_start-b_start==countb&&n-c_start==countc)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else
			{
				System.out.println("NO");
			}
		}
		else
		{
			System.out.println("NO");
		}
	}
}