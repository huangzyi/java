package sushu;
import java.util.Scanner;
public class Sushu {
	public static void main(String[] args)	{
		Scanner in = new Scanner(System.in);
		int i = 0;
		int m[] = new int[25];
		do {
			m[i] = in.nextInt();
		}while(m[i++]!=0);		
		in.close();
		for(int j = 0;j < i-1;j++)
		{
			switch(issushu(m[j])) {
			case 0:
				System.out.println(m[j] + " is not sushu.");
				break;
			default:
				System.out.println(m[j] + " is sushu.");
				break;
			}
		}
		System.out.println("programe is over.");
	}
	public static int issushu(int m)
	{
		for(int i = 2 ; i <= Math.sqrt(m) ; i++)
		{
			if(m%i==0)	return 0;
		}
		return 1;
	}
}
