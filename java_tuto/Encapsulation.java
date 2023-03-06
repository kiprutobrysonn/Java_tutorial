package java_tuto;

public class Encapsulation {
	private static String Name;
	public static String  getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation person = new Encapsulation();
		
		person.setName("James");
		System.out.print(person.getName());
		int hash = getName().hashCode();
		System.out.println(hash);

	}

}
