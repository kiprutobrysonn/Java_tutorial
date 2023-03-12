package java_tuto;
import java.util.*;

public class Collatz {

	static boolean isOdd(int b) {
		return ((b%2)==0)?true:false;
	}
	static boolean isEven(int b) {
		return ((b%2)==0)?true:false;
	}
	static void collatzConjecture(int b) {
		int iteration = 0;
	while(b!=1) {
		iteration+=1;
		if(isEven(b)) {
			b=b/2;
		} else {
			b=(b*3)+1;
		}
		System.out.println(b);
		
	}
	System.out.println(iteration);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

 Scanner input = new Scanner(System.in);
System.out.println("Enter the number ");
		collatzConjecture(input.nextInt());

	}

}
