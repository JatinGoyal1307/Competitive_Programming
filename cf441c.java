import java.util.*;
public class cf441c
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int k=in.nextInt();
		int totalcells=n*m;
		int rem_cells=totalcells;
		int rem_tubes=k;
		int start_i=1;
		int start_j=1;
		int left=1;
		while(rem_tubes>0)
		{
			int count=rem_cells/rem_tubes;
			rem_cells-=count;
			rem_tubes--;
			System.out.print(count);
				while(count>0)
				{
					if(left==1)
					{
						int i=start_j;
						for(i=start_j;i<=m;i++)
						{
							System.out.print(" "+start_i+" "+i);
							count--;
							if(count<=0)
							{
								if(i==m)
								{
									start_i++;
									start_j=1;
									left=1;
								}
								else
								{
									start_j=i+1;
								}
								i=m+5;
							}
						}
						if(i==m+1)
						{
							start_j=m;
							start_i++;
							left=2;
						}
					}
					else
					{
						int i=start_j;
						for(i=start_j;i>0;i--)
						{
							System.out.print(" "+start_i+" "+i);
							count--;
							if(count<=0)
							{
								if(i==1)
								{
									start_i++;
									start_j=m;
									left=2;
								}
								else
								{
									start_j=i-1;
								}
								i=-5;
							}
						}
						if(i>=0)
						{
							start_j=1;
							start_i++;
							left=1;
						}
					}
				}
				System.out.println();
			}
			
	}
}