package int_move;
import java.util.Scanner;
public class Int_Move {
	public static void main(String[] args)	{
		int num[] = new int[10];
		System.out.println("Please input 10 numbers:");
		Scanner in = new Scanner(System.in);
		for(int i = 0 ; i < 10; i++)
			num[ i ] = in.nextInt();
		System.out.println("Your numbers are:");
		for(int e:num)
			System.out.print(e + " ");
		System.out.print("\n");
		System.out.println("Please input m:");
		int m = in.nextInt();
		in.close();
		//double ave = Double.parseDouble(sum) / 3;
		//System.out.println("sum=" + sum);
		//System.out.println("average=" + ave);
	}	
}
