package java_tuto;

public class TestCAse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
	new Thread() {
		public void run() {
			c1.withDraw(4000);
		}
	}.start();;
	new Thread() {
		public void run() {
			c1.dePosit(2000);
		}
	}.start();;

	}

}
