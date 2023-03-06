package java_tuto;

  abstract class Java_abstract {
	//creation of an abstract method
	public abstract void carBehaviour();
	// creation of a regular method
	public static void rave() {
		System.out.println("The car raves zzzzz");
	}
	// creation of sub class to Java_abstract
	class Mazda extends Java_abstract{
		public void carBehaviour(){
			System.out.println("The car is sleek");
		}
		
	}

}
  //implementation from another class
   class Java_abstarction{
	   public static void main (String[]args) {
		  // creation of a mazda object
		   Mazda myMazda = new Mazda();
		   
	   }
   }
