package methodCalling;

public class Static {
	//A static method is a method that belongs to a class, but it does not belong to an instance of that class 
	//
	public static void main(String[] args) {
		
	System.out.println(sum(2,6));
	Static st=new Static();
	int b=st.mult(2,5);
	System.out.println(b);
		
	}
	
	public static int sum(int a, int b) {
		int x=90;
		 return a+b;
	}
	public int mult(int a, int b) {
		prnt();
		//System.out.println(x);
		//System.out.println(str);
		System.out.println(sum(a,b));  //Non-static methods can access any static method and static variable,
		                              //without creating an instance of the object.
		return a*b;
	}
	
	public void prnt() {
		int x=70;
		String str= "thidvbnm";
		System.out.println("Hey! This is non static method");
		system(x);
	}

	private static void system(int x) {
		// TODO Auto-generated method stub
		System.out.println(x+ " Inside");
		
	}
	
	
	
	

}
