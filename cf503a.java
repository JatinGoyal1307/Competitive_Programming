import java.util.*;
public class cf503a
{
	static int difference(int a, int b)
	{
		if(a>b)
		{
			return a-b;
		}
		else
		{
			return b-a;
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int h=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		int k=in.nextInt();
		for(int i=0;i<k;i++)
		{
			int ta=in.nextInt();
			int fa=in.nextInt();
			int tb=in.nextInt();
			int fb=in.nextInt();
			if(ta==tb)
			{
				System.out.println(difference(fa,fb));
			}
			else
			{
				int diff=0;
				diff+=difference(ta,tb);
				if(fa<a)
				{
					diff+=a-fa;
					diff+=difference(fb,a);
				}
				else if(fa>b)
				{
					diff+=fa-b;
					diff+=difference(fb,b);
				}
				else
				{
					diff+=difference(fa,fb);
				}
				System.out.println(diff);
			}

		}
	}
}