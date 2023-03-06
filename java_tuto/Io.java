package java_tuto;

import java.util.Scanner;

public class Io implements Runnable {
	public void  run(){
		int yob=2002;
		int year;
		System.out.println("Enter the current year");
		Scanner obj = new Scanner(System.in);
		year=obj.nextInt();
		obj.close();
		int age=year-yob;
		System.out.print(age);
		try {Thread.sleep(200);
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Io obj = new Io();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
	
		t1.start();
		System.out.print(t1.getName());
		t1.join();
		t2.start();
	}

}
