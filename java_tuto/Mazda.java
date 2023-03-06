package java_tuto;

import java.io.*;

public class Mazda {
	public static void main(String[]args) {
	try {
	FileOutputStream fout= new FileOutputStream("C:\\Users\\user\\Desktop\\w.txt");
	System.out.println(fout.getFD());
	fout.write(3434343);
	fout.close();
	}
	catch(Exception e) {
		
	}
	}
}
