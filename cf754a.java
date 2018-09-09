import java.util.*;
public class cf754a
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int sum=0;
		int start_i[]=new int[n];
		int end_i[]=new int[n];
		int top=0;
		int curr_start=1;
		sum+=a[0];
		for(int i=1;i<n;i++)
		{
			int temp=sum+a[i];
			if(temp==0&&a[i]!=0)
			{
				start_i[top]=curr_start;
				end_i[top]=i;
				top++;
				curr_start=i+1;
				sum=a[i];
			}
			else
			{
				sum=temp;
			}
		}
		if(sum==0)
		{
			System.out.println("NO");
		}
		else
		{
			start_i[top]=curr_start;
			end_i[top]=n;
			top++;
			System.out.println("YES");
			System.out.println(top);
			for(int j=0;j<top;j++)
			{
				System.out.println(start_i[j]+" "+end_i[j]);
			}
		}
	}
}