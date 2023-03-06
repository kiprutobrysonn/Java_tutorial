package java_tuto;

import java.util.StringTokenizer;

public class Methods  {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "The quick fox jumped over the lazy brown mouse";
		StringTokenizer str= new StringTokenizer(sentence," ");
		int count= str.countTokens();
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		
	}
	
	System.out.println(count);
}
}
