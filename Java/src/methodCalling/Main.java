package methodCalling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overrideMethodExtends child=new overrideMethodExtends();
		child.show();
		
		overrideMathod parent =new overrideMathod();
		parent.show();
		
		child.print();
		parent.print();

	}

}
// static keyword must be present in both if it is in both parent or child