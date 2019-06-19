package wanshu;
import java.util.Scanner;
public class Wanshu {
	public static void main(String[] args)	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n =	in.nextInt();
		in.close();
		System.out.println(m + " to " + n + " WanShu:");
		for(int i = m ; i <= n ; i++){
			int sum = 0 ;
			for(int j = 1; j < i ; j++)
				if(i % j == 0){
					sum += j;
				}
			if(sum == i) {
				System.out.print(sum + ",");
			}
		}
	}
	
}
