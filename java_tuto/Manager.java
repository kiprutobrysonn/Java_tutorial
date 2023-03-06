package java_tuto;

import java.util.Scanner;

public class Manager  extends Employee{
	private String section;
	private float allowance=0;
	Scanner e= new Scanner(System.in);
	public Manager() {
		super();
		System.out.println("manager constructor: ");
		
		System.out.println("Enter section : ");
		section=e.nextLine();
	}
	public Manager(String x,float y,int z,String section) {
		super(x,y,z);
		
		this.section=section;
		
	}
	
	public void viewSalary() {
		float gross = (float) (getSalaryt()*0.1);
		System.out.println(gross);
		
	}
	public void getTax() {
		System.out.println("hellow");
		
	}
	


	public String getSection() {
		return section;
	}




	public void setSection(String section) {
		this.section = section;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee m2= new Manager();
		if(m2 instanceof Manager) {
			System.out.print("Is manager");
		}
		else {
			System.out.print("Is Employee");
		}
		
		
		

	}




	public float getAllowance() {
		return allowance;
	}




	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}
	

}
