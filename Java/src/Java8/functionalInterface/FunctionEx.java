package Java8.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx implements arithmatic {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> func= i->(i*2);
		Integer r=func.apply(5);
		System.out.println(r);
		
		Function<Integer, Integer> func2= i->(i*i);
		Integer r1=func2.apply(5);
		System.out.println(r1);
		/*-------------------Why use Lambda Expression-------------
		       1.To provide the implementation of Functional interface.
		       2.Less coding.
		       */
		int arr[]= {1,2,3,4};
		for(int j : arr)
			System.out.println(j);
		
		///-----------------BiFunction-----------------------------
		BiFunction<Integer, Float, Float> func3=  (i, j)->(i*j);
		Float r3=func3.apply(5, 10.0f);
		System.out.println(r3);
		
		BiFunction<Integer, Integer, Integer> func4=arithmatic::add;
		int r4=func4.apply(4, 5);
		System.out.println(r4);		
		
		
		
		  
	}
	

}
//@FunctionalInterface
interface arithmatic{
	public static int add(int i, int j) {
		return i+j;
	}
	
}
