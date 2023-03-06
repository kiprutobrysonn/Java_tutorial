package java_tuto;
import java.util.*;

class Employee extends Object  {
	
	protected String name;
	protected float salary;
	protected int pfNo;
	protected  Scanner obj = new Scanner(System.in);
	
	protected Employee() {
		System.out.println("creating new employee");
		System.out.println("Enter your name:");
		name=obj.nextLine();
		System.out.println("Enter the pf Number:");
		pfNo=obj.nextInt();
		System.out.println("Enter salary:");
		salary=obj.nextFloat();
		
	}
	public Employee( String name, float salary ,int pfNo) {
		this.salary= salary;
		this.name= name;
		this.pfNo=pfNo;
		
	}
	public void getTax() {
		
		float tax= (float) (0.3*salary);
		System.out.println("The tax amount is:"+tax);
		
	}
	public float getSalaryt() {return salary;};
	public int getPfNo() { return pfNo;}
	public String getName() { return name;}
	public  void setSalary() {
		System.out.println("Enter new salary: ");
		salary=obj.nextFloat();
		
	}
	public  void setName() {
		System.out.println("Enter new name: ");
		name=obj.nextLine();
		
	}
	public  void setPfNo() {
		System.out.println("Enter new pfNo: ");
		pfNo=obj.nextInt();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee("Bryson",2000,200);
		e1.getTax();
		e2.getTax();
		

	}
	public static Employee createEmployee() {
		return new Employee() {
		};
	}

}
