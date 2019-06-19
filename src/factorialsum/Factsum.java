package factorialsum;
import java.util.Scanner;
public class Factsum {
	public static void main(String[] args)	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int y = func(n);
		System.out.println("1!~" + n + "!=" + y);
	}
	
	public static int func (int n)
	{
		int p = 0;
		for(int i = n ; i > 0 ; i--)
		{
			p++;
			p *= i;
		}
		return p;
	}
}
