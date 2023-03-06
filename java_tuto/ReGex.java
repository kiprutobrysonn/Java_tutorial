package java_tuto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReGex  implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern myPattern = Pattern.compile("Hello",Pattern.CASE_INSENSITIVE);
		Matcher myMatcher = myPattern.matcher("Hello this her");
	    boolean matchFound = myMatcher.find();
	    System.out.println(matchFound);
	    ReGex myThread = new ReGex();
	    Thread mThread = new Thread(myThread);
	    mThread.start();
	  

	}
public void run () {
	System.out.println("Hello world");
}
}
