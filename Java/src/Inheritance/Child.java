package Inheritance;

// public abstract class Child extends Parent {
//  we can't create an object of an abstract class. But we can create a reference variable of an abstract class
	public  class Child extends Parent{
	public static void call(){
		//super();
		System.out.println("child Class call method is calling.....");
	}
	// void func() ;
	
	public static void desc() {
		System.out.println("......child Class desc method is calling.....");
		
	}

}
