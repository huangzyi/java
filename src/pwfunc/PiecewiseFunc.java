package pwfunc;
import java.util.Scanner;
public class PiecewiseFunc {
	public static void main(String[] args)	{
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		in.close();
		double y = func(n);
		System.out.println("y=" + y);
	}
	
	public static double func (double x)
	{
		if ( x == 0 )	return 0;
		else if ( x > 0 )	return Math.exp( -x );
		else return -Math.exp( x );
	}
}
