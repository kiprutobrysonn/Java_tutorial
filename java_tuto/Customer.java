package java_tuto;

public class Customer {
	int amount =2000;
	synchronized public void withDraw(int amount) {
		if(this.amount<amount) {
			System.out.println("waiting  for a deposit");
			try {
				wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		this.amount-=amount;
		System.out.println("Withdrawal successful");
	}
	synchronized public void dePosit(int amount) {
		this.amount+=amount;
		System.out.println("Deposit is succefull");
		notify();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
