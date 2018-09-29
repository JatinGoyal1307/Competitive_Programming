import java.util.*;
public class cf512a
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int k=in.nextInt();
			sum+=k;
		}
		if(sum>0)
		{
			System.out.println("HARD");
		}
		else
		{
			System.out.println("EASY");
		}
	}
}