package java_tuto; 
import java.io.*;
import java.util.*;



public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To create a new file
		File myObj = new File("C://Users//user//Desktop//tmp.txt");
		try {
		String B=(myObj.createNewFile())?("File created:"+myObj.getName()):("File exists");
			
				System.out.println(B);
			
		}
			catch(IOException e){
				System.out.println("An error occured");
				e.printStackTrace();
				
			}

//to write on the file		
		
		/*try {
			FileWriter  myWriter= new FileWriter("C://Users//user//Desktop//tmp.txt");
			Scanner myScanner = new Scanner(System.in);
			String myWord= myScanner.nextLine();
		myWriter.write(myWord);
			myWriter.close();
			System.out.println("The file was successfuly written");
			myScanner.close();
			
		} catch (IOException e) {
			System.out.println("An error occured");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// to read the contents of the file 
		try {
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				byte[] name=data.getBytes();
				for (byte i: name) {
					System.out.println(i);
				}
				System.out.println(data);
				
			}
			myReader.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File NOT found");
			e.printStackTrace();
			
		}
		
		

	}

	
}
