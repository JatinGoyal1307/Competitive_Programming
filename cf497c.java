import java.util.*;
public class cf497c
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		{
			int n=in.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=in.nextInt();
			}
			Arrays.sort(arr);
			int i=0;
			int j=0;
			int count=0;
			while(i<n&&j<n)
			{
				while(i<n&&j<n&&arr[j]==arr[i])
				{
					j++;
				}
				while(i<n&&j<n&&arr[j]>arr[i])
				{
					count++;
					i++;
					j++;
				}
			}
			System.out.println(count);
		}
	}
}