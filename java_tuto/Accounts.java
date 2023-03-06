package java_tuto;

import java.util.Scanner;

abstract class Accounts {
	/*accHolder
	 * accNo
	 * Balance
	 *  checkBalance
	 *  deposit()
	 *  Withdraw()
	 */
	private String accHolder;
	private int accNo;
	private float balance;
	Scanner myObj=new Scanner(System.in);

	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	abstract void withdraw();
	
	public void deposit() {
		System.out.println("Enter the value to deposit:");
		balance=balance+myObj.nextFloat();
	}


	public Accounts() {
		super();
		System.out.println("Welcome: ");
		System.out.println("Enter your name:");
		accHolder=myObj.next();
		balance=0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		}
		

	}


