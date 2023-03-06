package java_tuto;

import java.util.Scanner;

public class Checking extends Accounts{
	
private float overDraft;
Scanner o= new Scanner(System.in);

	public float getOverDraft() {
	return overDraft;
}

public void setOverDraft(float overDraft) {
	this.overDraft = overDraft;
}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		float withDraw;
		System.out.println("Enter the amount to withdraw:");
		withDraw=o.nextFloat();
		if(withDraw<=getBalance()) {
			System.out.println("The withdrawal of "+ withDraw+"is succesful");
			setBalance(getBalance()-withDraw);
			System.out.println("Your new balance is:"+getBalance());
		}else if((getBalance()+overDraft)>withDraw) {
				setBalance(0);
				overDraft=overDraft+(getBalance()-withDraw);
				System.out.println("Your new balance is:"+getBalance());
			}else {
				System.out.println("Insufficient amount and overDraft!!");
			}
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking c1= new Checking();
		c1.setAccNo(24567);
		c1.setBalance(40000);
		c1.setOverDraft(500);
		c1.withdraw();
		

	}

	

}
