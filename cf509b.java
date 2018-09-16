import java.util.*;
public class cf509b
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int max=0;
		int min=110;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		if((max-min)>k)
		{
			System.out.println("NO");
		}
		else
		{
			StringBuffer ans[]=new StringBuffer[n];
			StringBuffer first=new StringBuffer();
			for(int i=0;i<min;i++)
			{
				first.append("1 ");
			}
			String firsts=first.toString();
			for(int i=0;i<n;i++)
			{
				ans[i]=new StringBuffer(firsts);
			}
			int p=1;
			int counter=min + 1; 
			for(int i=0;i<max-min;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr[j]>=counter)
					{
						ans[j].append((Integer.toString(p))+" ");
					}
				}
				counter++;
				p++;
			}
			System.out.println("YES");
			for(int i=0;i<n;i++)
			{
				System.out.println(ans[i].toString());
			}
		}
	}
}