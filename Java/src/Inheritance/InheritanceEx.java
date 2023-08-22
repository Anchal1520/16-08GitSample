package Inheritance;

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch= new Child();
		Parent pr= new Parent();
		ch.call();
		ch.func();
		pr.call();
		
		
		//Parent p=new child()   // Upcasting
		// Child c= new Parent()  // downcasting --  run time error, it throws the "ClassCastException
		//Child c=(Child) obj1       downcasting -- possible only with upcasing refrence variable
		
		
		
		Parent obj1= (Parent)new Child();
		obj1.call();
	 ((Child) obj1).desc();         // Casting to child is imp. when we are calling the method not defined in parent
		
		 Child c=(Child) obj1;
		 c.call();
		 c.func();
		 

	}

}
