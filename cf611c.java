import java.io.*;
public class cf611c
{
	public static void main(String args[])throws IOException
	{
		//Scanner in=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		String s[]=st.split(" ");
		int h=Integer.parseInt(s[0]);
		int w=Integer.parseInt(s[1]);
		char ch[][]=new char[h][w];
		int vertical[][]=new int[h][w];
		int horizontal[][]=new int[h][w];
		for(int i=0;i<h;i++)
		{
			String str=br.readLine();
			char c[]=str.toCharArray();
			for(int j=0;j<w;j++)
			{
				ch[i][j]=c[j];
			}
		}
		for(int i=0;i<h;i++)
		{
			horizontal[i][0]=0;
			for(int j=0;j<w;j++)
			{
				vertical[0][j]=0;
				if(j>0&&ch[i][j-1]=='.'&&ch[i][j]=='.')
				{
					horizontal[i][j]=horizontal[i][j-1]+1;
				}
				else if(j>0)
				{
					horizontal[i][j]=horizontal[i][j-1];
				}
				else
				{
					horizontal[i][j]=0;
				}
				if(i>0&&ch[i-1][j]=='.'&&ch[i][j]=='.')
				{
					vertical[i][j]=vertical[i-1][j]+1;
				}
				else if(i>0)
				{
					vertical[i][j]=vertical[i-1][j];
				}
				else
				{
					vertical[i][j]=0;
				}
			}
		}
		int q=Integer.parseInt(br.readLine());
		for(int i=0;i<q;i++)
		{
			long sum=0;
			String sd=br.readLine();
			String sda[]=sd.split(" ");
			int start_i=Integer.parseInt(sda[0]);
			int start_j=Integer.parseInt(sda[1]);
			int end_i=Integer.parseInt(sda[2]);
			int end_j=Integer.parseInt(sda[3]);
			start_i--;
			start_j--;
			end_i--;
			end_j--;
			for(int j=start_i;j<=end_i;j++)
			{
				if(end_j>0)
				{
					sum+=horizontal[j][end_j]-horizontal[j][start_j];
				}
			}
			for(int j=start_j;j<=end_j;j++)
			{
				if(end_i>0)
				{
					sum+=vertical[end_i][j]-vertical[start_i][j];
				}
			}
			System.out.println(sum);
		}
	}
}