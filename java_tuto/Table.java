package java_tuto;

public class Table {
	
	public void printTable(int n) {
		for(int i=0;i<5;i++) {
			System.out.println(i*n);
		}
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				
			}
		};

	}

}
