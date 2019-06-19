package inputoutput;
import java.io.*;
/*
import java.io.FileWriter;
import java.io.IOException;
*/
public class InOut {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("E:/Java/java/src/inputoutput/input.txt"));
			String syst[] = new String [4];
			int i = 0 ;/*
			String s = br.readLine();
			System.out.println(s);*/
			
			while( i < 4 ) {
				syst[i] = br.read();
				System.out.println(syst[i]+" ");
			}/*
			Employee[] em =  new Employee[3];
			for(i = 0;i < 3; i++) {
				/*
				em[i].Name = dip.readUTF();
				em[i].Sex = dip.readChar();
				em[i].Age = dip.readInt();
				em[i].Salary = dip.readFloat();
				
				String Name = dip.readUTF();
				char Sex = dip.readChar();
				int Age = dip.readInt();
				float Salary = dip.readFloat();
				em[i] = new Employee(i+1,Name,Sex,Age,Salary);
				System.out.println(em[i]);
				}*/

			br.close();
			//FileWriter fw = new FileWriter("output.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
