package sta_category;
import java.util.Scanner;
public class Calcu_times {
		public static void main(String[] args) {
			Type num = new Type( "numbers" );
			Type chartra = new Type("English letters");
			Type blak = new Type("blank space");
			Type other = new Type("other characters");

			System.out.println("Please input a sentence:");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine() ;
			input.close();

			for(int i = 0; i < str.length();i++)
			{
				char n = str.charAt(i);
				if(isDigit(n))  			num.add();
	            else if(isLetter(n))  chartra.add();
				else if(isSpace(n))         blak.add();
				else      other.add();
				/*
				if(Character.isDigit(n))  			num.add();
	            else if(Character.isLetter(n))  chartra.add();
				else if(Character.isSpace(n))         blak.add();
				else      other.add();
				*/
			}

			System.out.println("The number of numbers is: " + num.times);
			System.out.println("The number of English letters is: " + chartra.times);
			System.out.println("The number of blank space is: " + blak.times);
			System.out.println("The number of other characters is: " + other.times);

		}
		
		public isDigit(char n)
		{
			if(n >= '0' && n <= '9')	return 1;
			else return 0;
		}
		
		public isLetter(char n)
		{
			if( n >= 'a' && n <= 'z')	return 1;
			else if( n <= 'Z' && n >= 'A' )	return 1;
			else return 0;
		}
		
		public isSpace(char n)
		{
			if( n == " ")	return 1;
			else 0;
		}
}
