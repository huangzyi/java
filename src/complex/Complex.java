package complex;
import java.util.Scanner;
public class Complex {
	public int a,b;

	Complex(int x, int y){
		this.a = x;
		this.b = y;
	}
	
	public Complex complexAdd(Complex c1, Complex c2) {
		this.a = c1.a;
		this.b = c2.b;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("");
		int a1 = in.nextInt();
		int b1 = in.nextInt();
		int a2 = in.nextInt();
		int b2 = in.nextInt();
		in.close();
		
		Complex c1 = new Complex(a1,b1);
		Complex c2 = new Complex(a2,b2);
		
	}
}