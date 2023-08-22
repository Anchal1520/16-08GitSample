package Interface;

public class InterfaceOverloadExtends implements InterfaceOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InterfaceOverload ib;
		InterfaceOverloadExtends ex=new InterfaceOverloadExtends();
		ex.show();
		ex.show(5);

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hi I am just show mathod call");
		
	}

	@Override
	public void show(int no) {
		// TODO Auto-generated method stub
		System.out.println("Hi I am just show mathod call with number"+ no);
		
	}

}
