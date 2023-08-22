package Abstract;

public class AbstractClassExtends extends AbstractEx{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("here is abstract method");
		
	}
	public static void main(String[] args) {
		AbstractClassExtends ace= new AbstractClassExtends();
		ace.show();
		ace.print();
	}

	
	

}
