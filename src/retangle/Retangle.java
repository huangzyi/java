package retangle;
import java.util.Scanner;
public class Retangle {
	double l;
	double d;
	double area;
	
	Retangle(double a , double b){
		this.l = a;
		this.d = b;
		this.area = a*b;
	}
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Please input length:");
	double a = in.nextDouble();
	System.out.println("Please input width:");
	double b = in.nextDouble();
	in.close();
	Retangle r = new Retangle(a,b);
	System.out.println("The lengh is:" + a);
	System.out.println("The width is:" + b);
	System.out.println("The area is:" + r.area);
	}
}
