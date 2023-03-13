package java_tuto;

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread() {
			public void run() {
				Table table = new Table();
				table.printTable(1);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Table w = new Table();
				w.printTable(200);
			}
		};
		t1.start();
		t2.start();
		

	}

}
