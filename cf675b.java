import java.util.*;
public class cf675b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		long count=0;
		for(int j=1;j<=n;j++)
		{
			int e=j;
			int f=e-c+b;
			int h=e-d+a;
			int i=f-d+a;
			if(f>0&&f<=n&&h>0&&h<=n&&i>0&&i<=n)
			{
				count++;
			}
		}
		count=count*((long)n);
		System.out.println(count);


	}
}