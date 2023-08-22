package Abstract.define;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr=new Triangle(6, 8);
		System.out.println("Area of Trianle is: "+ tr.area());
		//Diagram dr=new Diagram(7, 8);
	//	System.out.println("Area of Trianle is: "+ .area());
		
		Triangle tr2=new Triangle(7, 8);
		System.out.println("Area of Trianle is: "+ tr2.area());
		Diagram dr=tr; // cant create object of abstract class but can create refrence variable 
		System.out.println("Area of diagram is: "+ tr2.area());
		
		
	}

}
