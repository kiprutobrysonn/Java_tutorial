package java_tuto;

import java.util.Scanner;

public class Savings extends Accounts {
	Scanner obj = new Scanner(System.in);

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to withdraw:");
		
		float withDraw;
		withDraw=obj.nextFloat();
		if(getBalance()>=withDraw) {
			System.out.println("The withdrawal of  "+withDraw+"  Is successful");
			setBalance(getBalance()-withDraw);
		} else {
			System.out.println("Insufficient amount try again !!");
			withdraw();
		}
		
	}
	public static void main(String[]args) {
		
	}

}
