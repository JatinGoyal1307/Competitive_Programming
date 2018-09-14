import java.io.*;
public class cf158c
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String path[]=new String[1000];
		int front=0;
		for(int i=0;i<n;i++)
		{
			String command=br.readLine();
			if(command.equals("pwd")==true)
			{
				for(int j=0;j<front;j++)
				{
					System.out.print("/"+path[j]);
				}
				System.out.println("/");
			}
			else
			{
				String dir=((command.split(" "))[1]);
				int p1=0;
				if(dir.charAt(0)=='/')
				{
					front=0;
					p1++;
				}
				String folders[]=dir.split("/");
				int k=folders.length;
				for(int j=p1;j<k;j++)
				{
					if(folders[j].equals("..")==true)
					{
						front--;
					}
					else
					{
						path[front]=folders[j];
						front++;
					}
				}
			}
		}
	}
}