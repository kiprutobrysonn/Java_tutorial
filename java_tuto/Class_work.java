package java_tuto;
//import all the java util package as it contains the collection , array and scanner class 
import java.util.*;
//initialization of the java class
public class Class_work {
	//method that grades the subjects and accepts an array list of integer type as a parameter
	public static void grading(ArrayList<Integer>x) {
		for(int i = 0;i<x.size();i++) {
			System.out.println(x.get(i));
			if(x.get(i)<=50) {
				System.out.println("GRADE is D");
			}
			else if(x.get(i)<=60) {
				System.out.println("Grade is C");
			}
			else if (x.get(i)<=70) {
				System.out.println("Grade is B");
			}
			else {
				System.out.println("Grade is A");
			}
	}
	}
	
	public static void main(String[]args) {
		//create an object of the Arraylist class
		ArrayList <Integer> myMarks = new ArrayList<Integer>();
		//create a scanner class
		Scanner Units = new Scanner(System.in);
		System.out.println("ENTER MARKS FOR UNIT 1:");
		int myUnits = Units.nextInt();
		myMarks.add(myUnits);
		System.out.println("ENTER MARKS FOR UNIT 2:");
		myUnits = Units.nextInt();
		myMarks.add(myUnits);
		System.out.println("ENTER MARKS FOR UNIT 3:");
		myUnits = Units.nextInt();
		myMarks.add(myUnits);
		
		System.out.println("ENTER MARKS FOR UNIT 4:");
		myUnits = Units.nextInt();
		myMarks.add(myUnits);
	
		System.out.println("ENTER MARKS FOR UNIT 5:");
		myUnits = Units.nextInt();
		myMarks.add(myUnits);
	
		System.out.println("ENTER MARKS FOR UNIT 6:");
		myUnits = Units.nextInt();
		myMarks.add(myUnits);
		
		System.out.println("ENTER MARKS FOR UNIT 7:");
		myUnits = Units.nextInt();
		myMarks.add(myUnits);
		
		System.out.println("ENTER MARKS FOR UNIT 8:");
		myUnits = Units.nextInt();
		myMarks.add(myUnits);
		Units.close();
		//call the grading function
		grading(myMarks);
	};

}
