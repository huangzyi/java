package int_calcu;
import java.util.Scanner;
public class Int_Calcu {
	public static void main(String[] args)	{
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j =	in.nextInt();
		int k = in.nextInt();
		in.close();
		String sum = String.format("%.1f", (float)(i+j+k));
		double ave = Double.parseDouble(sum) / 3;
		System.out.println("sum=" + sum);
		System.out.println("average=" + ave);
	}	
}
