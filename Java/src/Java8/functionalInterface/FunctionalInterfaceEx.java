package Java8.functionalInterface;

public class FunctionalInterfaceEx implements check{

	
	public static void main(String[] args) {
		
		
		FunctionalInterfaceEx fie= new FunctionalInterfaceEx();
		fie.say("Anchal");
		
	}
	public void say(String msg) {
		System.out.println(msg);
	}
	
}
@FunctionalInterface
interface check{
	public void say(String msg);
}
//A functional interface can extends another interface only when it does not have any abstract method.`1