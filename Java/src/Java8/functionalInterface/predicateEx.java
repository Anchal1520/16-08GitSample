package Java8.functionalInterface;

import java.util.function.Predicate;

public class predicateEx {
	public static void main(String[] agrs) {
	
	//String s1="Search for predicate";
	Predicate<String>pre= s->(s.length()>10);
	 System.out.println(pre.test("Search for predicate"));
	
	 
	 Predicate<String>evenlen= s->(s.length()%2==0);
	 System.out.println(evenlen.test("Search for predicate"));
	 
	 System.out.println(evenlen.and(pre).test(" Search for predicate"));
	 
	 //and, or, negate
	
	}

}


