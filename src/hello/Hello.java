package hello;
import java.util.Scanner;
public class Hello {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String str = input.nextLine().toUpperCase() ;
			System.out.println("result:" + str);
			input.close();
		}
}
