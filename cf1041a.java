import java.util.*;
public class cf1041a
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		long count=0;
		for(int i=1;i<n;i++)
		{
			count+=(long)(arr[i]-arr[i-1]-1);
		}
		System.out.println(count);
	}
}