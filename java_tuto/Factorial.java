package java_tuto;
import java.util.Scanner;

public class Factorial {
	public static int factorial (int x) {
		if (x>1) {
			return x*factorial(x-1);
		}
		else {
			return 1;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the factorial number:");
		String x = input.nextLine();
		int y = Integer.parseInt(x);
		System.out.println("The factorial is:"+factorial(y));

	}

}
