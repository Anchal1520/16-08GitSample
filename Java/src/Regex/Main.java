package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String p=".s";
		Pattern pr= Pattern.compile(".b");
		Matcher m= pr.matcher("ab");
		boolean b1= m.matches();
		System.out.println(b1);
		
		boolean b=Pattern.matches(".s", "as");
		System.out.println(b);
		System.out.println(Pattern.matches("[abcd]", "b")); // true just have a single word from a,b,c,d
		System.out.println(Pattern.matches("[abcd]", "b"));
		
	}

}
