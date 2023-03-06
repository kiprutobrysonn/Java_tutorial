package java_tuto;
import java.io.IOException;
import java.util.Scanner;
public class Hello {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.flush();
		System.out.print(5+3);
		String name ="MMU BSE";
		int yoa=0;
		try {
			yoa = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		System.out.println(yoa);
		System.out.println(name+" THIRD YEAR");
		
		
		
		}

}

