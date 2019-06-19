package sta_times;
import java.util.Scanner;
public class Calcu_times {
		public static void main(String[] args) {
			Num[] num = new Num[26];
			num[0] = new Num();
			
			for(int j = 0;	j < 26 ; j++) {
				num[j] = new Num();
				num[j].value += j;
			}
			
			Scanner input = new Scanner(System.in);
			String str = input.nextLine() ;
			input.close();
			
			for(int i = 0; i < str.length();i++)
			{
				char n = str.charAt(i);
				/*
				for(int j = 0;	j < 26  ;j++) 
					if(num[j].statics(n))	break;
					*/
				int m;
				if( n <= 'Z' && n >= 'A' ) 	 m = n -'A';
				else if( n <= 'z' && n >= 'a' )	 m = n - 'a';
				else	continue;
				num[m].add();
			}

			for(int j = 0;	j < 26 ; j++) {
				if(num[j].times != 0) System.out.println("(" + String.valueOf(num[j].value) + ")Num=" + num[j].times);
			}
			
		}
}
