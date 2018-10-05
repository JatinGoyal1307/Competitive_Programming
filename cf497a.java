import java.io.*;
public class cf497a
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int flag=1;
		int n=str.length();
		char ch[]=str.toCharArray();
		for(int i=0;i<n;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				flag=1;
			}
			else if(ch[i]=='n')
			{
				if(i>0&&ch[i-1]!='a'&&ch[i-1]!='e'&&ch[i-1]!='i'&&ch[i-1]!='o'&&ch[i-1]!='u'&&ch[i-1]!='n')
				{
					flag=0;
					i=n+1;
				}
			}
			else
			{
				if(flag==0)
				{
					flag=0;
					i=n+1;
				}
				else
				{
					flag=0;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}