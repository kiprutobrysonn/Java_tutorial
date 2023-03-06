package java_tuto;

public class Daemon extends Thread {
	
	public void run () {
		if(Thread.currentThread().isDaemon()) {
			System.out.print("Thread is daemon");
			
			
		}else {
			System.out.print("User thread");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Daemon d1 = new Daemon();
		Daemon d2 = new Daemon();
		Thread d3= new Daemon();
		
		
		d1.setDaemon(true);
		d1.start();
		d1.join();
		d3.start();
		Runtime r=Runtime.getRuntime();
		d2.start();
		//System.exit(10);

	}

}
