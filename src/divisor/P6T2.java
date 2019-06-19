import java.util.Scanner;
public class P6T2 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please input first number: ");
		int m = in.nextInt();
		System.out.println("Please input second number: ");
		int n = in.nextInt();
		in.close();		
			try {
				float d=(float)m/(float)n;
					System.out.println("Divisor is : " + d);
			} catch(NegativeException e) {
				System.out.println("The divisor, " + n + ", could not be negative!");
			}catch(ZeroException e){
				System.out.println("The divisor, " + n + ", could not be zero!");
			}
			System.out.println("finally!");
	}
}


