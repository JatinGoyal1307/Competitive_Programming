import java.util.*;
public class cf771a
{
	int node1;
	int node2;
	cf771a(int a, int b)
	{
		this.node1=a;
		this.node2=b;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		LinkedList<cf771a> edges=new LinkedList<cf771a>();
		int visited[]=new int[n+1];
		int count_visited=0;
		int flag=0;
		for(int i=0;i<m;i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			cf771a n1=new cf771a(a,b);
			edges.add(n1);
		}
		long num_this_graph=0;
		while(count_visited<n&&flag==0)
		{
			num_this_graph=1;
			int start_vertex=-1;
			for(int i=1;i<=n;i++)
			{
				if(visited[i]==0)
				{
					visited[i]=1;
					start_vertex=i;
					count_visited++;
					i=n+2;
				}
			}
			int stack[]=new int[n+1];
			long num_of_edges=0;
			int top=0;
			stack[0]=start_vertex;
			Iterator<cf771a> itr=edges.iterator();
			while(start_vertex!=-1&&(itr.hasNext()||top>=0))
			{
				while((!itr.hasNext())&&top>=0)
				{
					top--;
					itr=edges.iterator();
				}
				cf771a ed=null;
				if(top==-1)
				{
					break;
				}
				else if(itr.hasNext())
				{
					ed=itr.next();
				}
				if(ed!=null&&ed.node1==stack[top]&&visited[ed.node2]==0)
				{
					top++;
					stack[top]=ed.node2;
					visited[ed.node2]=1;
					count_visited++;
					edges.remove(ed);
					itr=edges.iterator();
					num_of_edges++;
					num_this_graph++;
				}
				else if(ed!=null&&ed.node1==stack[top]&&visited[ed.node2]==1)
				{
					edges.remove(ed);
					num_of_edges++;
				}
				else if(ed!=null&&ed.node2==stack[top]&&visited[ed.node1]==0)
				{
					top++;
					stack[top]=ed.node1;
					visited[ed.node1]=1;
					count_visited++;
					edges.remove(ed);
					itr=edges.iterator();
					num_of_edges++;
					num_this_graph++;
				}
				else if(ed!=null&&ed.node2==stack[top]&&visited[ed.node1]==1)
				{
					edges.remove(ed);
					num_of_edges++;
				}
			}
			long req=num_this_graph*(num_this_graph-1)/2;
			if(num_of_edges!=req)
			{
				flag=1;
			}

		}
		if(flag==1)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}