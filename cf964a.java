import java.io.*;
public class cf964a
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int ans=n/2;
		ans++;
		System.out.println(ans);
	}
}